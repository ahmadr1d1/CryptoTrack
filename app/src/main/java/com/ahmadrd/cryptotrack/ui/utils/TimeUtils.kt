package com.ahmadrd.cryptotrack.ui.utils

import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale
import java.util.TimeZone

object TimeUtils {

    /**
     * Mengonversi feedDate (timestamp dalam milidetik) menjadi format tanggal yang terbaca manusia.
     * Contoh hasil: "06 Juni 2025"
     */
    fun formatFeedDateToIndonesian(dateMillis: Long): String {
        val localeID = Locale("id", "ID") // Bahasa Indonesia
        val sdf = SimpleDateFormat("dd MMMM yyyy", localeID)
        sdf.timeZone = TimeZone.getDefault() // Sesuai waktu lokal pengguna
        return sdf.format(Date(dateMillis))
    }
}
