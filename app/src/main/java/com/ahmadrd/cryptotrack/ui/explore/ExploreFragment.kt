package com.ahmadrd.cryptotrack.ui.explore

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.ahmadrd.cryptotrack.R
import com.ahmadrd.cryptotrack.databinding.FragmentExploreBinding
import com.ahmadrd.cryptotrack.di.ViewModelFactory
import com.ahmadrd.cryptotrack.ui.adapter.NewsAdapter
import com.ahmadrd.cryptotrack.ui.utils.Result
import com.google.android.material.bottomnavigation.BottomNavigationView

class ExploreFragment : Fragment() {

    private var _binding: FragmentExploreBinding? = null
    private val binding get() = _binding!!
    private lateinit var viewModel: ExploreViewModel
    private lateinit var adapter: NewsAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentExploreBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val factory = ViewModelFactory.getInstance(requireActivity().application)
        viewModel = ViewModelProvider(this, factory)[ExploreViewModel::class.java]

        val layoutManager = LinearLayoutManager(requireContext())
        binding.rvNews.layoutManager = layoutManager

        adapter = NewsAdapter()
        binding.rvNews.adapter = adapter

        viewModel.newsResult.observe(viewLifecycleOwner) {
            when(it) {
                is Result.Loading -> showLoading(true)
                is Result.Success -> {
                    showLoading(false)
                    adapter.submitList(it.data)
                }
                is Result.Error -> {
                    showLoading(false)
                    showError(it.error)
                }
            }
        }

        val toolbar = binding.toolbarExplore
        toolbar.setOnMenuItemClickListener {
            when (it.itemId) {
                R.id.navigation_favorites -> {
                    val navView = requireActivity().findViewById<BottomNavigationView>(R.id.nav_view)
                    navView.selectedItemId = R.id.navigation_favorites
                }

                R.id.navigation_search -> {
                    Toast.makeText(
                        context,
                        "Search News is not available yet.",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }
            true
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
        binding.rvNews.adapter = null
        binding.rvNews.layoutManager = null
        _binding = null
    }
}