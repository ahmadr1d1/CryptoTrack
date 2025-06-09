package com.ahmadrd.cryptotrack.ui.favorites

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.ahmadrd.cryptotrack.R
import com.ahmadrd.cryptotrack.databinding.FragmentFavoritesBinding
import com.ahmadrd.cryptotrack.ui.adapter.FavoritesPagerAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class FavoritesFragment : Fragment() {

    private var _binding: FragmentFavoritesBinding? = null
    private val binding get() = _binding!!
    private lateinit var viewPager: ViewPager2
    private lateinit var tabLayout: TabLayout

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentFavoritesBinding.inflate(inflater, container, false)
        val root: View = binding.root
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewPager = binding.viewPagerFavorites
        tabLayout = binding.tabLayoutFavorites

        val adapter = FavoritesPagerAdapter(this)
        viewPager.adapter = adapter

        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            tab.text = when (position) {
                0 -> "Coins"
                1 -> "News"
                else -> "Tab ${position + 1}"
            }
        }.attach()

        val toolbar = binding.toolbarFavorites
        toolbar.setOnMenuItemClickListener {
            when(it.itemId) {
                R.id.navigation_notification -> {
                    Toast.makeText(
                        requireContext(),
                        "Feature not available yet",
                        Toast.LENGTH_SHORT
                    ).show()
                }

                R.id.navigation_search -> {
                    Toast.makeText(
                        requireContext(),
                        "Feature not available yet",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }
            true
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}