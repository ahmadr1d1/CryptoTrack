package com.ahmadrd.cryptotrack.ui.adapter

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.ahmadrd.cryptotrack.ui.detail.DetailActivity
import com.ahmadrd.cryptotrack.ui.detail.tab.InfoFragment
import com.ahmadrd.cryptotrack.ui.detail.tab.OverviewFragment

class DetailPagerAdapter(
    fragmentActivity: FragmentActivity,
    private val coinId: String?
) : FragmentStateAdapter(fragmentActivity) {

    override fun getItemCount() = 2

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> {
                val fragment = OverviewFragment()
                val bundle = Bundle()
                bundle.putString(DetailActivity.EXTRA_ID, coinId)
                fragment.arguments = bundle
                fragment
            }
            1 -> {
                val fragment = InfoFragment()
                val bundle = Bundle()
                bundle.putString(DetailActivity.EXTRA_ID, coinId)
                fragment.arguments = bundle
                fragment
            }
            else -> throw IllegalArgumentException("Invalid tab position")
        }
    }
}
