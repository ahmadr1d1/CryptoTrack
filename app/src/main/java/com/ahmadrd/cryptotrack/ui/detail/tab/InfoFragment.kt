package com.ahmadrd.cryptotrack.ui.detail.tab

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.ahmadrd.cryptotrack.R
import com.ahmadrd.cryptotrack.databinding.FragmentInfoBinding
import com.ahmadrd.cryptotrack.di.ViewModelFactory
import com.ahmadrd.cryptotrack.ui.detail.DetailActivity.Companion.EXTRA_ID
import com.ahmadrd.cryptotrack.ui.detail.DetailViewModel
import com.ahmadrd.cryptotrack.ui.utils.PriceFormatter.formatNumberToMillionsBillions
import com.ahmadrd.cryptotrack.ui.utils.Result
import com.ahmadrd.cryptotrack.ui.utils.SetupLink.setupUrlLink


class InfoFragment : Fragment() {
    private var _binding: FragmentInfoBinding? = null
    private val binding get() = _binding!!
    private lateinit var viewModel: DetailViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentInfoBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val factory = ViewModelFactory.getInstance(requireActivity().application)
        viewModel = ViewModelProvider(requireActivity(), factory)[DetailViewModel::class.java]

        val coinID = arguments?.getString(EXTRA_ID)
        if (!coinID.isNullOrEmpty()) {
            observeDetailCoins()
        } else {
            Toast.makeText(requireContext(), "Coin ID not found", Toast.LENGTH_SHORT)
                .show()
        }
    }

    // Loading dan error sudah ditangani di kelas DetailActivity
    private fun observeDetailCoins() {
        viewModel.detailCoins.observe(viewLifecycleOwner) { result ->
            if (result is Result.Success) {
                val coinData = result.data
                with(binding) {
                    // Statistic CardView
                    tvMarketCap.text = getString(
                        R.string.volume_format,
                        coinData.marketData?.marketCap?.usd
                            ?: getString(R.string.not_available)
                    )
                    tvVolume.text = getString(
                        R.string.volume_format,
                        coinData.marketData?.totalVolume?.usd
                            ?: getString(R.string.not_available)
                    )
                    tvDiluted.text = getString(
                        R.string.volume_format,
                        coinData.marketData?.fullyDilutedValuation?.usd
                            ?: getString(R.string.not_available)
                    )


                    val circulatingSupply = coinData.marketData?.circulatingSupply
                    val formattedCirculatingSupply =
                        formatNumberToMillionsBillions(circulatingSupply)
                    tvCirculatingSupply.text = getString(
                        R.string.total_supply_format, formattedCirculatingSupply
                    )

                    val totalSupply = coinData.marketData?.totalSupply
                    val formattedTotalSupply = formatNumberToMillionsBillions(totalSupply)
                    tvTotalSupply.text = getString(
                        R.string.total_supply_format, formattedTotalSupply
                    )

                    val maxSupply = coinData.marketData?.maxSupply
                    val formattedMaxSupply = formatNumberToMillionsBillions(maxSupply)
                    tvMaxSupply.text = getString(
                        R.string.total_supply_format, formattedMaxSupply
                    )

                    // Historical CardView
                    tv24hh.text = getString(
                        R.string.volume_format,
                        coinData.marketData?.high24h?.usd
                            ?: getString(R.string.not_available)
                    )
                    tvAth.text = getString(
                        R.string.volume_format,
                        coinData.marketData?.ath?.usd
                            ?: getString(R.string.not_available)
                    )
                    tv24hl.text = getString(
                        R.string.volume_format,
                        coinData.marketData?.low24h?.usd
                            ?: getString(R.string.not_available)
                    )
                    tvAtl.text = getString(
                        R.string.volume_format,
                        coinData.marketData?.atl?.usd
                            ?: getString(R.string.not_available)
                    )

                    // Links CardView
                    val homepageUrl = coinData.links?.homepage?.firstOrNull { !it.isNullOrBlank() }
                    tvWebsiteLink.setupUrlLink(homepageUrl)

                    val firstSite =
                        coinData.links?.blockchainSite?.getOrNull(0)?.takeIf { it.isNotBlank() }
                    val secondSite =
                        coinData.links?.blockchainSite?.getOrNull(1)?.takeIf { it.isNotBlank() }
                    val thirdSite =
                        coinData.links?.blockchainSite?.getOrNull(2)?.takeIf { it.isNotBlank() }
                    tvExploresLink.setupUrlLink(firstSite)
                    tvExploresLink2.setupUrlLink(secondSite)
                    tvExploresLink3.setupUrlLink(thirdSite)

                    val forumLink =
                        coinData.links?.officialForumUrl?.firstOrNull { !it.isNullOrBlank() }
                    tvCommunityLink.setupUrlLink(forumLink)


                    // Description CardView
                    val desc = coinData.description?.en
                    if (desc != null && desc != "") {
                        tvDescription.text = desc
                    } else {
                        tvDescription.text = getString(R.string.no_desc)
                    }
                }
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}