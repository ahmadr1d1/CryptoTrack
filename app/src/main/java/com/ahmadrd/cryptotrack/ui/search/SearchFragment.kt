package com.ahmadrd.cryptotrack.ui.search

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.EditorInfo
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.ahmadrd.cryptotrack.databinding.FragmentSearchBinding
import com.ahmadrd.cryptotrack.di.ViewModelFactory
import com.ahmadrd.cryptotrack.ui.adapter.CoinSearchAdapter
import com.ahmadrd.cryptotrack.ui.utils.Result

class SearchFragment : Fragment() {

    private var _binding: FragmentSearchBinding? = null
    private val binding get() = _binding!!
    private lateinit var viewModel: SearchViewModel
    private lateinit var searchAdapter: CoinSearchAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSearchBinding.inflate(inflater, container, false)
        val root: View = binding.root
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val factory = ViewModelFactory.getInstance(requireActivity().application)
        viewModel = ViewModelProvider(this, factory)[SearchViewModel::class.java]

        val layoutManager = LinearLayoutManager(requireContext())
        binding.rvCoins.layoutManager = layoutManager

        searchAdapter = CoinSearchAdapter()
        binding.rvCoins.adapter = searchAdapter

        // Observasi data market (awal)
        viewModel.coinResult.observe(viewLifecycleOwner) { result ->
            when (result) {
                is Result.Success -> {
                    showLoading(false)
                    val coins = result.data
                    if (coins.isNotEmpty()) {
                        searchAdapter.submitList(coins)
                    } else {
                        Toast.makeText(context, "No result found", Toast.LENGTH_SHORT).show()
                    }
                }

                is Result.Loading -> showLoading(true)
                is Result.Error -> {
                    showLoading(false)
                    showError(result.error)
                }
            }
        }


        // EditText search listener
        val searchBar = binding.searchEditText
        searchBar.setOnEditorActionListener { _, actionId, _ ->
            if (actionId == EditorInfo.IME_ACTION_SEARCH) {
                val query = searchBar.text.toString()
                if (query.isNotBlank()) {
                    Toast.makeText(requireContext(), "Searching $query", Toast.LENGTH_SHORT).show()
                    viewModel.searchCoins(query)
                } else {
                    viewModel.getCoins() // tampilkan ulang list coin awal
                }
                true
            } else {
                false
            }
        }
    }


    private fun showLoading(isLoading: Boolean) {
        binding.progressBar.visibility = if (isLoading) View.VISIBLE else View.GONE
    }

    private fun showError(isError: String) {
        Toast.makeText(context, isError, Toast.LENGTH_SHORT).show()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding.rvCoins.adapter = null
        binding.rvCoins.layoutManager = null
        _binding = null
    }
}