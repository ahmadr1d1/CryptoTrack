package com.ahmadrd.cryptotrack.ui.utils

import android.content.Context
import android.graphics.Color
import com.ahmadrd.cryptotrack.R
import java.text.DecimalFormat
import java.text.NumberFormat
import java.util.Currency
import java.util.Locale

/**
 * Kode yang diberi komentar diperuntukkan untuk
 * kemudahan dalam mengembangkan halaman favorites News
 * Di masa mendatang.
 */
object PriceFormatter {

    fun formatUSD(price: Double): String {
        val formatter = NumberFormat.getCurrencyInstance(Locale.US)
        formatter.maximumFractionDigits = 2
        formatter.currency = Currency.getInstance("USD")
        return formatter.format(price)
    }

//    fun formatIDR(price: Double): String {
//        val formatter = NumberFormat.getCurrencyInstance(Locale("in", "ID"))
//        formatter.maximumFractionDigits = 0 // Biasanya IDR tidak pakai desimal
//        formatter.currency = Currency.getInstance("IDR")
//        return formatter.format(price)
//    }

    fun formatChangePercentage(change: Double, context: Context): Pair<String, Int> {
        val formatted = context.getString(R.string.change7dformat).format(change)
        val color = if (change >= 0.0) Color.GREEN else Color.RED
        return Pair(formatted, color)
    }

    fun formatNumberToMillionsBillions(number: Double?): String {
        if (number == null || number == 0.0) {
            return "0"
        }

        val df = DecimalFormat("#,##0.0")

        return when {
            number >= 1_000_000_000_000.0 -> "${df.format(number / 1_000_000_000_000.0)} Trillion"
            number >= 1_000_000_000.0 -> "${df.format(number / 1_000_000_000.0)} Billion"
            number >= 1_000_000.0 -> "${df.format(number / 1_000_000.0)} Million"
            number >= 1_000.0 -> "${df.format(number / 1_000.0)}K" // Opsional untuk Ribuan
            else -> df.format(number) // Untuk angka di bawah 1000 (atau 1 Juta jika K tidak diinginkan)
        }
    }
}