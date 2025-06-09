package com.ahmadrd.cryptotrack.ui.utils

import android.content.ActivityNotFoundException
import android.content.Intent
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.core.net.toUri
import com.ahmadrd.cryptotrack.R

object SetupLink {
    fun TextView.setupUrlLink(
        url: String?,
        defaultTextResId: Int = R.string.not_available, // Default text jika URL tidak ada
        onErrorText: String = "Link tidak valid"
    ) {
        if (!url.isNullOrBlank()) {
            try {
                val uri = url.toUri()
                var domain = uri.host

                if (domain != null && domain.startsWith("www.")) {
                    domain = domain.substring(4)
                }

                if (!domain.isNullOrBlank()) {
                    this.text = domain
                    this.visibility = View.VISIBLE
                    this.setOnClickListener {
                        try {
                            val intent = Intent(Intent.ACTION_VIEW, url.toUri())
                            this.context.startActivity(intent)
                        } catch (e: ActivityNotFoundException) {
                            Toast.makeText(this.context, "Tidak ada aplikasi untuk membuka link ini", Toast.LENGTH_SHORT).show()
                        } catch (e: Exception) {
                            Toast.makeText(this.context, onErrorText, Toast.LENGTH_SHORT).show()
                        }
                    }
                } else {
                    // Domain tidak bisa diekstrak dari URL yang valid
                    this.text = context.getString(defaultTextResId)
                    this.visibility = View.GONE
                    this.setOnClickListener(null)
                }
            } catch (e: Exception) {
                // URL tidak valid, tidak bisa di-parse
                this.text = context.getString(defaultTextResId)
                this.visibility = View.GONE
                this.setOnClickListener(null)
            }
        } else {
            // URL null atau kosong
            this.text = context.getString(defaultTextResId)
            this.visibility = View.VISIBLE
            this.setOnClickListener(null)
        }
    }
}