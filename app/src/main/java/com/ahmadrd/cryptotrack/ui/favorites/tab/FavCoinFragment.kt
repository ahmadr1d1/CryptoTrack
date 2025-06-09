package com.ahmadrd.cryptotrack.ui.favorites.tab

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.ahmadrd.cryptotrack.data.remote.response.DetailCoinsResponse
import com.ahmadrd.cryptotrack.data.remote.response.Image
import com.ahmadrd.cryptotrack.data.remote.response.Links
import com.ahmadrd.cryptotrack.databinding.FragmentFavCoinBinding
import com.ahmadrd.cryptotrack.di.ViewModelFactory
import com.ahmadrd.cryptotrack.ui.adapter.FavCoinAdapter
import com.ahmadrd.cryptotrack.ui.favorites.FavoritesViewModel


class FavCoinFragment : Fragment() {

    private var _binding: FragmentFavCoinBinding? = null
    private val binding get() = _binding!!
    private lateinit var adapter: FavCoinAdapter
    private lateinit var viewModel: FavoritesViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentFavCoinBinding.inflate(inflater, container, false)
        val factory = ViewModelFactory.getInstance(requireActivity().application)
        viewModel = viewModels<FavoritesViewModel> { factory }.value
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupRecyclerView()
        observeViewModel()
    }

    private fun setupRecyclerView() {
        adapter = FavCoinAdapter()
        binding.rvFavCoin.apply {
            layoutManager = LinearLayoutManager(context)
            this.adapter = this@FavCoinFragment.adapter
        }
    }

    private fun observeViewModel() {
        viewModel.getFavCoin().observe(viewLifecycleOwner) { listOfFavoriteEntities ->
            binding.tvFavNoData.visibility = if (listOfFavoriteEntities.isEmpty()) View.VISIBLE else View.GONE

            val itemsForAdapter = listOfFavoriteEntities.map { favoriteEntity ->
                // Mengurai JSON String kembali ke List<String?>
                val homepageList: List<String?> = listOf(favoriteEntity.homepageUrl)

                DetailCoinsResponse(
                    id = favoriteEntity.coinsId,
                    name = favoriteEntity.name,
                    symbol = favoriteEntity.symbol,
                    image = Image(large = favoriteEntity.imageUrl),
                    links = Links(homepage = homepageList)
                )
            }
            adapter.submitList(itemsForAdapter)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding.rvFavCoin.adapter = null
        binding.rvFavCoin.layoutManager = null
        _binding = null
    }
}