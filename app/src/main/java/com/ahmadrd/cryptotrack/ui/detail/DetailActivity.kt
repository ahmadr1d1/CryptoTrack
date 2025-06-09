package com.ahmadrd.cryptotrack.ui.detail

import android.os.Bundle
import android.util.TypedValue
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.graphics.drawable.DrawableCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.isVisible
import androidx.lifecycle.ViewModelProvider
import com.ahmadrd.cryptotrack.R
import com.ahmadrd.cryptotrack.data.local.entity.FavoritesCoin
import com.ahmadrd.cryptotrack.databinding.ActivityDetailBinding
import com.ahmadrd.cryptotrack.di.ViewModelFactory
import com.ahmadrd.cryptotrack.ui.adapter.DetailPagerAdapter
import com.ahmadrd.cryptotrack.ui.favorites.FavoritesViewModel
import com.ahmadrd.cryptotrack.ui.utils.Result
import com.bumptech.glide.Glide
import com.google.android.material.tabs.TabLayoutMediator

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding
    private lateinit var factory: ViewModelFactory
    private lateinit var viewModel: DetailViewModel
    private var favoritesCoin: FavoritesCoin? = null
    private var ivFavoriteState = false
    private lateinit var favoritesViewModel: FavoritesViewModel
    private var favoriteMenuItem: MenuItem? = null

    companion object {
        const val EXTRA_ID = "extra_id"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.detailRoot)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        factory = ViewModelFactory.getInstance(application)
        viewModel = ViewModelProvider(this, factory)[DetailViewModel::class.java]
        favoritesViewModel = ViewModelProvider(this, factory)[FavoritesViewModel::class.java]

        // Tombol back
        binding.toolbarCoinDetail.setNavigationOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }

        // Ambil data
        val coinId = intent.getStringExtra(EXTRA_ID)
        setupViewPager(coinId)
        if (!coinId.isNullOrEmpty()) {
            viewModel.getDetailCoins(coinId)
            observeDetailCoins()
        } else {
            Toast.makeText(this, "Coin ID not found", Toast.LENGTH_SHORT).show()
        }

        val toolbar = binding.toolbarCoinDetail
        favoriteMenuItem = toolbar.menu.findItem(R.id.navigation_favorites)
        toolbar.setOnMenuItemClickListener {
            when (it.itemId) {
                R.id.navigation_notification -> {
                    Toast.makeText(
                        this,
                        "Feature not available yet",
                        Toast.LENGTH_SHORT
                    ).show()
                }

                R.id.navigation_favorites -> {

                    val favCoin = favoritesCoin
                    if (favCoin != null) {
                        if (!ivFavoriteState) {
                            val fav = FavoritesCoin(
                                coinsId = favoritesCoin!!.coinsId,
                                name = favoritesCoin!!.name,
                                symbol = favoritesCoin!!.symbol,
                                imageUrl = favoritesCoin!!.imageUrl,
                                homepageUrl = favoritesCoin!!.homepageUrl
                            )
                            favoritesViewModel.insertCoin(fav)
                            showToast("Added to favorites")
                        } else {
                            favoritesViewModel.deleteCoin(favoritesCoin!!)
                            showToast("Removed from favorites")
                        }

                        // Refresh status favorit
                        favoritesViewModel.isCoinFavorited(favoritesCoin!!.coinsId)
                            .observe(this) { favorites ->
                                val isFavorited = favorites.isNotEmpty()
                                ivFavoriteState = isFavorited
                                updateFavoriteIcon(isFavorited)
                            }
                    }
                }

                R.id.navigation_share -> {
                    Toast.makeText(
                        this,
                        "Feature not available yet",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }
            true
        }
    }

    private fun observeDetailCoins() {
        viewModel.detailCoins.observe(this) { result ->
            when(result) {
                is Result.Loading -> showLoading(true)
                is Result.Success -> {
                    showLoading(false)
                    val coin = result.data
                    Glide.with(this)
                        .load(coin.image?.large)
                        .placeholder(R.drawable.baseline_broken_image_24)
                        .into(binding.ivCoinLogoDetail)
                    binding.tvCoinNameDetail.text = coin.name
                    binding.tvCoinSymbolDetail.text = coin.symbol?.uppercase()
                    binding.tvCoinRankDetail.text = coin.marketCapRank?.let { "#${it.toInt()}" } ?: "-"
                    favoritesCoin = FavoritesCoin(
                        coinsId = coin.id ?: "N/A",
                        name = coin.name ?: "N/A",
                        symbol = coin.symbol ?: "N/A",
                        imageUrl = coin.image?.large ?: "N/A",
                        homepageUrl = coin.links?.homepage?.firstOrNull() ?: "N/A"
                    )

                    favoritesViewModel.isCoinFavorited(result.data.id!!).observe(this) { favorites ->
                        val isFavorited = favorites.isNotEmpty()
                        ivFavoriteState = isFavorited
                        updateFavoriteIcon(isFavorited)
                    }
                }
                is Result.Error -> {
                    showLoading(false)
                    showToast(result.error)
                }
            }
        }

        viewModel.remainingTimeToFetch.observe(this) { millis ->
            if (millis > 0) {
                val seconds = (millis / 1000) % 60
                val minutes = (millis / 1000) / 60
                binding.tvWaitMessage.text = getString(R.string.wait_message_format, minutes, seconds)
                binding.tvWaitMessage.isVisible = true
                binding.mainContent.isVisible = false
            } else {
                binding.tvWaitMessage.isVisible = false
                binding.mainContent.isVisible = true
            }
        }
    }


    private fun setupViewPager(coinId: String?) {
        val adapter = DetailPagerAdapter(this, coinId)
        binding.viewPager.adapter = adapter

        TabLayoutMediator(binding.tabLayout, binding.viewPager) { tab, position ->
            tab.text = when (position) {
                0 -> "Overview"
                1 -> "Info"
                else -> "Tab ${position + 1}"
            }
        }.attach()
    }

    fun moveToNextTab() {
        with(binding) {
            if (viewPager.currentItem < (viewPager.adapter?.itemCount?.minus(1) ?: 0)) {
                viewPager.currentItem += 1
            }
        }
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    private fun showLoading(isBoolean: Boolean) {
        binding.shimmerFrameDetail.startShimmer()
        binding.shimmerFrameDetail.visibility = if (isBoolean) View.VISIBLE else View.GONE
        binding.mainContent.visibility = if (isBoolean) View.INVISIBLE else View.VISIBLE
        binding.shimmerFrameDetail.stopShimmer()
    }

    private fun updateFavoriteIcon(isFav: Boolean) {
        favoriteMenuItem?.let { item ->
            if (isFav) {
                item.icon = ContextCompat.getDrawable(this, R.drawable.baseline_favorite_24)
                // Terapkan tint warna aktif (hijau)
                DrawableCompat.setTint(
                    item.icon!!,
                    ContextCompat.getColor(this, R.color.green)
                )
            } else {
                item.icon = ContextCompat.getDrawable(this, R.drawable.favorites_black)
                val typedValue = TypedValue()
                theme.resolveAttribute(android.R.attr.colorControlNormal, typedValue, true)
                val themeTintColor = ContextCompat.getColor(this, typedValue.resourceId)

                DrawableCompat.setTint(
                    item.icon!!,
                    themeTintColor
                )
            }
        }
    }
}
