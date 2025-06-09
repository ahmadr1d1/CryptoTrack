package com.ahmadrd.cryptotrack.ui.detail.tab

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.ahmadrd.cryptotrack.R
import com.ahmadrd.cryptotrack.data.remote.response.DetailCoinsResponse
import com.ahmadrd.cryptotrack.data.remote.response.HistoryChartResponse
import com.ahmadrd.cryptotrack.databinding.FragmentOverviewBinding
import com.ahmadrd.cryptotrack.di.ViewModelFactory
import com.ahmadrd.cryptotrack.ui.detail.DetailActivity
import com.ahmadrd.cryptotrack.ui.detail.DetailActivity.Companion.EXTRA_ID
import com.ahmadrd.cryptotrack.ui.detail.DetailViewModel
import com.ahmadrd.cryptotrack.ui.utils.ChartFormatter
import com.ahmadrd.cryptotrack.ui.utils.PriceFormatter
import com.ahmadrd.cryptotrack.ui.utils.PriceFormatter.formatNumberToMillionsBillions
import com.ahmadrd.cryptotrack.ui.utils.Result
import com.ahmadrd.cryptotrack.ui.utils.UiEvent


class OverviewFragment : Fragment() {

    private var _binding: FragmentOverviewBinding? = null
    private val binding get() = _binding!!
    private lateinit var viewModel: DetailViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentOverviewBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val factory = ViewModelFactory.getInstance(requireActivity().application)
        viewModel = ViewModelProvider(requireActivity(), factory)[DetailViewModel::class.java]


        val coinId = arguments?.getString(EXTRA_ID)
        if (!coinId.isNullOrEmpty()) {
            // Set default period chart
            viewModel.currentSelectedPeriodDays.value?.let { defaultDays ->
                viewModel.getMarketChart(coinId, defaultDays)
            }

            setupPeriodButtonListeners(coinId)
            observeDetailCoins()
            observeChart()
        } else {
            Toast.makeText(requireContext(), "Coin ID not found", Toast.LENGTH_SHORT)
                .show()
        }

        binding.tvMore.setOnClickListener {
            (activity as? DetailActivity)?.moveToNextTab()
        }

        binding.btnCurrency.setOnClickListener {
            Toast.makeText(
                requireContext(), "Feature not available yet",
                Toast.LENGTH_SHORT
            ).show()
        }
    }

    private fun setupPeriodButtonListeners(coinId: String) {
        binding.btn1h.setOnClickListener { // 1 jam (1/24 hari)
            viewModel.updateChartPeriod(coinId, "0.0416")

        }
        binding.btn24h.setOnClickListener {
            viewModel.updateChartPeriod(coinId, "1")
        }
        binding.btn7d.setOnClickListener {
            viewModel.updateChartPeriod(coinId, "7")
        }
        binding.btn1m.setOnClickListener {
            viewModel.updateChartPeriod(coinId, "30")
        }
        binding.btn1y.setOnClickListener {
            viewModel.updateChartPeriod(coinId, "365")
        }
    }

    // Loading dan error sudah ditangani di kelas DetailActivity
    private fun observeDetailCoins() {
        viewModel.detailCoins.observe(viewLifecycleOwner) { result ->
            if (result is Result.Success) {
                updateCoinDetailsUI(result.data)
                // Coba setup chart jika data chart juga sudah tersedia
                val historyResult = viewModel.historyChart.value
                if (historyResult is Result.Success) {
                    trySetupChart(result, historyResult, viewModel.currentSelectedPeriodDays.value)
                }
            }
        }

    }

    // Loading dan error sudah ditangani di kelas DetailActivity
    private fun observeChart() {
        viewModel.historyChart.observe(viewLifecycleOwner) { result ->
            if (result is Result.Success) {
                // Coba setup chart jika data detail koin juga sudah tersedia
                val detailResult = viewModel.detailCoins.value
                if (detailResult is Result.Success) {
                    trySetupChart(detailResult, result, viewModel.currentSelectedPeriodDays.value)
                }
            }
        }

        viewModel.uiEvent.observe(viewLifecycleOwner) { event ->
            when (event) {
                is UiEvent.ShowToast -> {
                    Toast.makeText(requireContext(), event.message, Toast.LENGTH_LONG).show()
                }
            }
        }
    }

    // Fungsi ini akan dipanggil ketika ada data detail dan data chart yang sukses
    private fun trySetupChart(
        detailResultSuccess: Result.Success<DetailCoinsResponse>,
        historyResultSuccess: Result.Success<HistoryChartResponse>,
        currentDaysPeriod: String? // Diambil dari viewModel.currentSelectedPeriodDays.value
    ) {
        val detailData = detailResultSuccess.data
        val priceList = historyResultSuccess.data.prices.mapNotNull {
            it.getOrNull(1)?.toFloat() }

        if (priceList.isNotEmpty()) {
            val changePercentage =
                viewModel.getChangePercentageForCurrentPeriod(detailData, currentDaysPeriod)
            ChartFormatter.setupMarketChart(
                requireContext(),
                binding.chartView,
                priceList,
                changePercentage // Bisa null, default warna hijau (0.0)
            )
        } else {
            binding.chartView.clear()
        }
    }

    // Fungsi untuk mendapatkan data detail dan mengubah UI detail koin
    private fun updateCoinDetailsUI(data: DetailCoinsResponse) {
        with(binding) {
            tvPrice.text = PriceFormatter.formatUSD(
                data.marketData?.currentPrice?.usd ?: 0.0
            )


            val change24h = data.marketData?.priceChangePercentage24h ?: 0.0
            val (formattedChange, color) = PriceFormatter.formatChangePercentage(
                change24h,
                root.context
            )
            tvPriceChange.text = formattedChange
            tvPriceChange.setTextColor(color)
            tv24h.text = formattedChange
            tv24h.setTextColor(color)

            val change7d = data.marketData?.priceChangePercentage7d ?: 0.0
            val (formattedChange7d, color7d) = PriceFormatter.formatChangePercentage(
                change7d,
                root.context
            )
            tv7d.text = formattedChange7d
            tv7d.setTextColor(color7d)

            val change14d = data.marketData?.priceChangePercentage14d ?: 0.0
            val (formattedChange14d, color14d) = PriceFormatter.formatChangePercentage(
                change14d,
                root.context
            )
            tv14d.text = formattedChange14d
            tv14d.setTextColor(color14d)

            val change30d = data.marketData?.priceChangePercentage30d ?: 0.0
            val (formattedChange30d, color30d) = PriceFormatter.formatChangePercentage(
                change30d,
                root.context
            )
            tv30d.text = formattedChange30d
            tv30d.setTextColor(color30d)


            tvMarketCap.text = getString(
                R.string.volume_format,
                data.marketData?.marketCap?.usd
                    ?: getString(R.string.not_available)
            )
            tvVolume.text = getString(
                R.string.volume_format,
                data.marketData?.totalVolume?.usd
                    ?: getString(R.string.not_available)
            )
            tvDiluted.text = getString(
                R.string.volume_format,
                data.marketData?.fullyDilutedValuation?.usd
                    ?: getString(R.string.not_available)
            )


            val circulatingSupply = data.marketData?.circulatingSupply
            val formattedCirculatingSupply =
                formatNumberToMillionsBillions(circulatingSupply)
            tvCirculatingSupply.text = getString(
                R.string.total_supply_format, formattedCirculatingSupply
            )

            val totalSupply = data.marketData?.totalSupply
            val formattedTotalSupply = formatNumberToMillionsBillions(totalSupply)
            tvTotalSupply.text = getString(
                R.string.total_supply_format, formattedTotalSupply
            )

            val maxSupply = data.marketData?.maxSupply
            val formattedMaxSupply = formatNumberToMillionsBillions(maxSupply)
            tvMaxSupply.text = getString(
                R.string.total_supply_format, formattedMaxSupply
            )
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}