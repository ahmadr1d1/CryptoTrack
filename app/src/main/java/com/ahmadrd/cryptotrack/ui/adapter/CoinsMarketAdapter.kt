package com.ahmadrd.cryptotrack.ui.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.ahmadrd.cryptotrack.R
import com.ahmadrd.cryptotrack.data.remote.response.MarketResponse
import com.ahmadrd.cryptotrack.databinding.ItemRowCoinsMarketBinding
import com.ahmadrd.cryptotrack.ui.detail.DetailActivity
import com.ahmadrd.cryptotrack.ui.utils.ChartFormatter
import com.ahmadrd.cryptotrack.ui.utils.PriceFormatter
import com.bumptech.glide.Glide

class CoinsMarketAdapter :
    ListAdapter<MarketResponse, CoinsMarketAdapter.MyViewHolder>(DIFF_CALLBACK) {

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

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val binding =
            ItemRowCoinsMarketBinding.inflate(LayoutInflater.from(parent.context), parent,
                false)
        return MyViewHolder(binding)
    }

    class MyViewHolder(private val binding: ItemRowCoinsMarketBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: MarketResponse) {
            with(binding) {
                rankTextView.text = item.marketCapRank.toString()
                Glide.with(root.context)
                    .load(item.image)
                    .error(R.drawable.baseline_broken_image_24)
                    .into(coinImageView)
                symbolTextView.text = item.symbol
                priceTextView.text = PriceFormatter.formatUSD(item.currentPrice ?: 0.0)

                val change = item.priceChangePercentage7dInCurrency ?: 0.0
                val (formattedChange, color) = PriceFormatter.formatChangePercentage(change, root.context)
                change7dTextView.text = formattedChange
                change7dTextView.setTextColor(color)

                val priceList = item.sparkline?.price
                if (!priceList.isNullOrEmpty()) {
                    ChartFormatter.setupSparklineChart(chartView, priceList, item.priceChangePercentage7dInCurrency)
                } else {
                    chartView.clear()
                }
            }

            binding.root.setOnClickListener {
                val intent = Intent(binding.root.context, DetailActivity::class.java)
                intent.putExtra(DetailActivity.EXTRA_ID, item.id)
                binding.root.context.startActivity(intent)
            }
        }
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val item = getItem(position)
        holder.bind(item)
    }

}