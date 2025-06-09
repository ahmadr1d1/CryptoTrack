package com.ahmadrd.cryptotrack.ui.utils

import android.content.Context
import android.content.res.Configuration
import android.graphics.Color
import androidx.core.content.ContextCompat
import com.ahmadrd.cryptotrack.R
import com.github.mikephil.charting.charts.LineChart
import com.github.mikephil.charting.components.LimitLine
import com.github.mikephil.charting.data.Entry
import com.github.mikephil.charting.data.LineData
import com.github.mikephil.charting.data.LineDataSet

object ChartFormatter {
    fun setupSparklineChart(chartView: LineChart, prices: List<Double>, change7d: Double?) {
        val entries = prices.mapIndexed { index, price ->
            Entry(index.toFloat(), price.toFloat())
        }

        val color = if ((change7d ?: 0.0) >= 0.0) Color.GREEN else Color.RED

        val dataSet = LineDataSet(entries, "Sparkline").apply {
            setDrawCircles(false)
            setDrawValues(false)
            lineWidth = 2f
            this.color = color
        }

        chartView.apply {
            data = LineData(dataSet)
            setBackgroundColor(Color.TRANSPARENT)
            setGridBackgroundColor(Color.TRANSPARENT)
            description.isEnabled = false
            legend.isEnabled = false
            setTouchEnabled(false)
            setScaleEnabled(false)
            setPinchZoom(false)
            setDrawGridBackground(false)
            setViewPortOffsets(0f, 0f, 0f, 0f)
            xAxis.isEnabled = false
            axisLeft.isEnabled = false
            axisRight.isEnabled = false
            invalidate()
        }
    }

    fun setupMarketChart(context: Context, chart: LineChart,
                         priceList: List<Float>, change7d: Double?) {
        val entries = priceList.mapIndexed { index, price ->
            Entry(index.toFloat(), price)
        }

        val color = if ((change7d ?: 0.0) >= 0.0) Color.GREEN else Color.RED

        // Konfigurasi data set
        val dataSet = LineDataSet(entries, "Price").apply {
            this.color = color
            setDrawCircles(false)
            lineWidth = 1.5f
            setDrawValues(false)
            mode = LineDataSet.Mode.CUBIC_BEZIER
            setDrawFilled(true)
            this.fillColor = color
            fillAlpha = 80
            setDrawHighlightIndicators(false)
        }

        val lineData = LineData(dataSet)
        chart.data = lineData

        // Tambah ATH dan ATL
        val athPrice = priceList.maxOrNull()
        val atlPrice = priceList.minOrNull()

        val athLine = LimitLine(athPrice!!, "ATH: $$athPrice").apply {
            lineColor = Color.TRANSPARENT // Tidak ada garis
            textColor = if (isUsingDarkTheme(context)) Color.WHITE else R.color.detailToolbarDescText
            textSize = 10f
            labelPosition = LimitLine.LimitLabelPosition.RIGHT_TOP
        }

        val atlLine = LimitLine(atlPrice!!, "ATL: $$atlPrice").apply {
            lineColor = Color.TRANSPARENT
            textColor = if (isUsingDarkTheme(context)) Color.WHITE else R.color.detailToolbarDescText
            textSize = 10f
            labelPosition = LimitLine.LimitLabelPosition.RIGHT_BOTTOM
        }

        // Tambahkan ke axisLeft
        chart.axisLeft.removeAllLimitLines()
        chart.axisLeft.addLimitLine(athLine)
        chart.axisLeft.addLimitLine(atlLine)

        // Hapus legend dan deskripsi
        chart.legend.isEnabled = false
        chart.description.isEnabled = false

        // Nonaktifkan interaksi
        chart.setTouchEnabled(false)
        chart.isDragEnabled = false
        chart.setScaleEnabled(false)
        chart.setPinchZoom(false)

        // Konfigurasi axis kiri (label harga)
        chart.axisLeft.apply {
            isEnabled = true
            textColor = ContextCompat.getColor(
                context,
                if (isUsingDarkTheme(context)) android.R.color.white else R.color.detailToolbarDescText
            )
            setDrawGridLines(false)
            setDrawAxisLine(false)
        }

        // Hilangkan axis kanan
        chart.axisRight.isEnabled = false

        // Konfigurasi X axis (waktu/horizontal)
        chart.xAxis.apply {
            isEnabled = false
        }

        // Refresh chart
        chart.invalidate()
    }

    // Mengubah warna teks pada chart sesuai tema aplikasi
    private fun isUsingDarkTheme(context: Context): Boolean {
        return when (context.resources.configuration.uiMode and Configuration.UI_MODE_NIGHT_MASK) {
            Configuration.UI_MODE_NIGHT_YES -> true
            else -> false
        }
    }

}