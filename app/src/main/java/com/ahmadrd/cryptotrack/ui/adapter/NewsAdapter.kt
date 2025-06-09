package com.ahmadrd.cryptotrack.ui.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.core.net.toUri
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.ahmadrd.cryptotrack.R
import com.ahmadrd.cryptotrack.data.remote.response.NewsTypeTrendingItem
import com.ahmadrd.cryptotrack.databinding.ItemRowNewsBinding
import com.ahmadrd.cryptotrack.ui.utils.TimeUtils

class NewsAdapter : ListAdapter<NewsTypeTrendingItem, NewsAdapter.ViewHolder>(DIFF_CALLBACK) {

    companion object {
        val DIFF_CALLBACK =
            object : DiffUtil.ItemCallback<NewsTypeTrendingItem>() {
                override fun areItemsTheSame(oldItem: NewsTypeTrendingItem, newItem: NewsTypeTrendingItem): Boolean {
                    return oldItem.id == newItem.id
                }

                override fun areContentsTheSame(
                    oldItem: NewsTypeTrendingItem,
                    newItem: NewsTypeTrendingItem
                ): Boolean {
                    return oldItem == newItem
                }
            }
    }

    class ViewHolder(private val binding: ItemRowNewsBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: NewsTypeTrendingItem) {
            with(binding) {
                tvTitle.text = item.title
                tvSource.text = item.source
                val formattedDate = TimeUtils.formatFeedDateToIndonesian(item.feedDate ?: 0L)
                tvTime.text = formattedDate
            }

            binding.root.setOnClickListener {
                item.link?.let { urlValue ->
                    val context = binding.root.context

                    AlertDialog.Builder(context)
                        .setTitle(context.getString(R.string.open_external_link_title))
                        .setMessage(context.getString(R.string.open_link_confirmation_message, urlValue))
                        .setPositiveButton(context.getString(R.string.yes)) { dialog, _ ->
                            if (urlValue.isNotBlank()) {
                                try {
                                    val intent = Intent(Intent.ACTION_VIEW, urlValue.toUri())
                                    context.startActivity(intent)
                                } catch (e: Exception) {
                                    Toast.makeText(context, context.getString(R.string.cannot_open_link), Toast.LENGTH_SHORT).show()
                                }
                            } else {
                                Toast.makeText(context, context.getString(R.string.invalid_website_link), Toast.LENGTH_SHORT).show()
                            }

                            dialog.dismiss()
                        }
                        .setNegativeButton(context.getString(R.string.no)) { dialog, _ ->
                            dialog.dismiss()
                        }
                        .show()
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding: ItemRowNewsBinding =
            ItemRowNewsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item: NewsTypeTrendingItem = getItem(position)
        holder.bind(item)
    }
}