package com.ahmadrd.cryptotrack.ui.adapter

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.ahmadrd.cryptotrack.ui.favorites.tab.FavCoinFragment
import com.ahmadrd.cryptotrack.ui.favorites.tab.FavNewsFragment

class FavoritesPagerAdapter(
    fragment: Fragment
): FragmentStateAdapter(fragment) {
    override fun getItemCount() = 2

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> FavCoinFragment()
            1 -> FavNewsFragment()
            else -> throw IllegalArgumentException("Invalid tab position")

        }
    }

}