package com.ahmadrd.cryptotrack.ui.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.net.toUri
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.ahmadrd.cryptotrack.R
import com.ahmadrd.cryptotrack.data.remote.response.DetailCoinsResponse
import com.ahmadrd.cryptotrack.databinding.ItemRowFavCoinBinding
import com.ahmadrd.cryptotrack.ui.detail.DetailActivity
import com.bumptech.glide.Glide

class FavCoinAdapter :
    ListAdapter<DetailCoinsResponse, FavCoinAdapter.MyViewHolder>(DIFF_CALLBACK) {

    companion object {
        val DIFF_CALLBACK =
            object : DiffUtil.ItemCallback<DetailCoinsResponse>() {
                override fun areItemsTheSame(
                    oldItem: DetailCoinsResponse,
                    newItem: DetailCoinsResponse
                ): Boolean {
                    return oldItem.id == newItem.id
                }

                override fun areContentsTheSame(
                    oldItem: DetailCoinsResponse,
                    newItem: DetailCoinsResponse
                ): Boolean {
                    return oldItem == newItem
                }
            }
    }

    class MyViewHolder(private val binding: ItemRowFavCoinBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: DetailCoinsResponse) {
            with(binding) {
                Glide.with(root.context)
                    .load(item.image?.large)
                    .error(R.drawable.baseline_broken_image_24)
                    .into(coinImageView)
                nameTextView.text = item.name
                symbolTextView.text = item.symbol

            }

            // Ambil URL link pertama dari daftar homepage dengan aman
            val urlStringFromItem = item.links?.homepage?.firstOrNull()

            if (!urlStringFromItem.isNullOrBlank()) {
                binding.tvWebsite.setOnClickListener {
                    try {
                        val intent = Intent(Intent.ACTION_VIEW, urlStringFromItem.toUri())

                        // Verifikasi apakah ada aplikasi yang bisa menangani Intent ini
                        if (intent.resolveActivity(binding.root.context.packageManager) != null) {
                            binding.root.context.startActivity(intent)
                        } else {
                            Toast.makeText(
                                binding.root.context,
                                "Cannot open link: No application found",
                                Toast.LENGTH_LONG
                            ).show()
                        }
                    } catch (e: Exception) {
                        Toast.makeText(
                            binding.root.context,
                            "Invalid website link",
                            Toast.LENGTH_SHORT
                        ).show()
                    }
                }
            } else {
                binding.tvWebsite.text = R.string.invalid_website_link.toString()
            }

            binding.root.setOnClickListener {
                val intent = Intent(binding.root.context, DetailActivity::class.java)
                intent.putExtra(DetailActivity.EXTRA_ID, item.id)
                binding.root.context.startActivity(intent)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val binding =
            ItemRowFavCoinBinding.inflate(
                LayoutInflater.from(parent.context), parent,
                false
            )
        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val item = getItem(position)
        holder.bind(item)
    }
}