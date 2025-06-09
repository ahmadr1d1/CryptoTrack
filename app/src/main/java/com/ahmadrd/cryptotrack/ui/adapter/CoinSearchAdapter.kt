package com.ahmadrd.cryptotrack.ui.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.ahmadrd.cryptotrack.R
import com.ahmadrd.cryptotrack.data.remote.response.MarketResponse
import com.ahmadrd.cryptotrack.databinding.ItemRowCoinsSearchBinding
import com.ahmadrd.cryptotrack.ui.detail.DetailActivity
import com.ahmadrd.cryptotrack.ui.utils.PriceFormatter
import com.bumptech.glide.Glide

class CoinSearchAdapter : ListAdapter<MarketResponse, CoinSearchAdapter.ViewHolder>(DIFF_CALLBACK) {

    companion object {
        val DIFF_CALLBACK =
            object : DiffUtil.ItemCallback<MarketResponse>() {
                override fun areItemsTheSame(oldItem: MarketResponse, newItem: MarketResponse): Boolean {
                    return oldItem.id == newItem.id
                }

                override fun areContentsTheSame(oldItem: MarketResponse, newItem: MarketResponse): Boolean {
                    return oldItem == newItem
                }
            }
    }

    class ViewHolder(private val binding: ItemRowCoinsSearchBinding) :
        RecyclerView.ViewHolder(binding.root) {
            fun bind(item: MarketResponse) {
                with(binding) {
                    Glide.with(root.context)
                        .load(item.image)
                        .error(R.drawable.baseline_broken_image_24)
                        .into(coinImageView)
                    nameTextView.text = item.name
                    symbolTextView.text = item.symbol
                    priceTextView.text = PriceFormatter.formatUSD(item.currentPrice ?: 0.0)

                    val change = item.priceChangePercentage7dInCurrency ?: 0.0
                    val (formattedChange, color) = PriceFormatter.formatChangePercentage(change, root.context)
                    change7dTextView.text = formattedChange
                    change7dTextView.setTextColor(color)
                }

                binding.root.setOnClickListener {
                    val intent = Intent(binding.root.context, DetailActivity::class.java)
                    intent.putExtra(DetailActivity.EXTRA_ID, item.id)
                    binding.root.context.startActivity(intent)
                }
            }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding =
            ItemRowCoinsSearchBinding.inflate(
                LayoutInflater.from(parent.context), parent,
                false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = getItem(position)
        holder.bind(item)
    }
}