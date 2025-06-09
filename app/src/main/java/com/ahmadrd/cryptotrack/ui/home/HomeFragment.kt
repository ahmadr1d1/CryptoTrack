package com.ahmadrd.cryptotrack.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.ahmadrd.cryptotrack.R
import com.ahmadrd.cryptotrack.databinding.FragmentHomeBinding
import com.ahmadrd.cryptotrack.di.ViewModelFactory
import com.ahmadrd.cryptotrack.ui.adapter.CoinsMarketAdapter
import com.ahmadrd.cryptotrack.ui.utils.Result
import com.google.android.material.bottomnavigation.BottomNavigationView

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!
    private lateinit var viewModel: HomeViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val factory = ViewModelFactory.getInstance(requireActivity().application)
        viewModel = ViewModelProvider(this, factory)[HomeViewModel::class.java]

        val layoutManager = LinearLayoutManager(requireContext())
        binding.recyclerView.layoutManager = layoutManager

        val adapter = CoinsMarketAdapter()
        binding.recyclerView.adapter = adapter

        viewModel.coinResult.observe(viewLifecycleOwner) { result ->
            when (result) {
                is Result.Loading -> showLoading(true)
                is Result.Success -> {
                    showLoading(false)
                    adapter.submitList(result.data)
                }

                is Result.Error -> {
                    showLoading(false)
                    showError(result.error)
                }
            }
        }

        val toolbar = binding.toolbarHome
        toolbar.setOnMenuItemClickListener {
            when (it.itemId) {
                R.id.navigation_notification -> {
                    Toast.makeText(
                        context,
                        "Feature not available yet",
                        Toast.LENGTH_SHORT
                    ).show()
                }

                R.id.navigation_search -> {
                    val navView = requireActivity().findViewById<BottomNavigationView>(R.id.nav_view)
                    navView.selectedItemId = R.id.navigation_search
                }
            }
            true
        }

    }

    private fun showLoading(isLoading: Boolean) {
        binding.shimmerFrameLayout.visibility = if (isLoading) View.VISIBLE else View.GONE
    }

    private fun showError(isError: String) {
        Toast.makeText(context, isError, Toast.LENGTH_SHORT).show()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding.recyclerView.adapter = null
        binding.recyclerView.layoutManager = null
        _binding = null
    }
}