# 🪙 CryptoTrack

**CryptoTrack** adalah aplikasi Android yang memungkinkan pengguna untuk memantau pasar cryptocurrency secara real-time, menjelajahi berita terbaru, dan menyimpan aset serta berita kripto favorit anda. Aplikasi ini saya buat untuk mengasah skill yang saya peroleh dari kursus [Android Fundamental dari Dicoding](https://www.dicoding.com/academies/14-belajar-fundamental-aplikasi-android), oleh karena itu pada dasarnya konsep aplikasinya terlihat sama dengan [Aplikasi Submission Akhir Android Fundamental dari dicoding](https://github.com/ahmadr1d1/DicodingEvent). Aplikasi ini dibangun dengan arsitektur modern Android dan mengintegrasikan berbagai API untuk menyajikan data yang akurat dan terkini.

---

## 🚀 Fitur Utama

- 🔍 **Eksplorasi Koin**  
  Cari dan temukan berbagai aset kripto lengkap dengan data pasar, grafik historis, dan detail lainnya.

- 📈 **Data Pasar Realtime**  
  Tampilkan data harga, volume, dan perubahan pasar terkini untuk berbagai cryptocurrency populer.

- 📰 **Berita Trending**  
  Integrasi dengan API berita untuk menyajikan artikel trending terbaru seputar dunia kripto.

- ❤️ **Favorit**  
  Simpan koin dan artikel favorit ke dalam database lokal untuk akses cepat kapan saja.

- 🧭 **Navigasi Intuitif**  
  Navigasi berbasis bottom navigation dan ViewPager untuk pengalaman pengguna yang menyenangkan.

---

## 🛠️ Teknologi & Tools

- **Kotlin**
- **Jetpack ViewModel & LiveData**
- **Room Database**
- **Retrofit2 + Gson Converter**
- **Shimmer Loading Effect**
- **Glide**
- **mpandroidchart**
- **Material Components**
- **MVVM Architecture**

---

## 🗂️ Struktur Direktori

```
CryptoTrack/
└── app/
    ├── src/
    │   ├── main/
    │   │   ├── java/com/ahmadrd/cryptotrack/
    │   │   │   ├── ui/             # Adapter, Fragment & Activity UI
    │   │   │   ├── data/           # Local database dan remote API
    │   │   │   ├── di/             # Dependency injection
    │   │   ├── res/                # Layout, drawable, mipmap, dll.
    │   │   ├── AndroidManifest.xml
    ├── build.gradle.kts
└── build.gradle.kts
```

---

## 🔌 API & Integrasi

- Data Coins diambil dari [Coingecko](https://docs.coingecko.com/v3.0.1/reference/introduction) menggunakan endpoint yang didefinisikan di `ApiService.kt`
- Berita Kripto diambil dari [Coinstats](https://docs.api.coinstats.app/reference) menggunakan endpoint yang didefinisikan di `NewsApiService.kt`

---

## 📷 Screenshot
<table>
  <tr>
    <th>Home</th>
    <th>Detail Overview</th>
    <th>Detail Info</th>
  </tr>
  <tr>
    <td><img src="https://github.com/user-attachments/assets/596f8655-c2e5-4e6e-9376-88ded5a71f30" alt="Gambar Halaman Home" width="300"></td>
    <td><img src="https://github.com/user-attachments/assets/2ae97bbc-8628-4c59-8ed6-529243e4d53f" alt="Gambar Halaman Detail Overview" width="300"></td>
    <td><img src="https://github.com/user-attachments/assets/0f7388ae-20da-4726-b681-0b17f3e2a84b" alt="Gambar Halaman Detail Info" width="300"></td>
  </tr>
  <tr>
    <th>Detail Cooldown Limit</th>
    <th>Favorites Coins</th>
    <th>Favorites News</th>
  </tr>
  <tr>
    <td><img src="https://github.com/user-attachments/assets/23eca9b4-f494-4ec2-be1d-9b7bbfa70b40" alt="Gambar Halaman Detail Loading Limit" width="300"></td>
    <td><img src="https://github.com/user-attachments/assets/986b0900-8997-435e-80d8-c1667f447022" alt="Gambar Halaman Favorites Coins" width="300"></td>
    <td><img src="https://github.com/user-attachments/assets/e9552fd0-b4f6-4d79-800a-86d3dc6c5b05" alt="Gambar Halaman Favorites News" width="300"></td>
  </tr>
  <tr>
    <th>Search</th>
    <th>Explore News</th>
    <th>Profile</th>
  </tr>
  <tr>
    <td><img src="https://github.com/user-attachments/assets/90369662-94f3-4793-94e3-051a52ab7836" alt="Gambar Halaman Search" width="300"></td>
    <td><img src="https://github.com/user-attachments/assets/df052dc9-c268-439b-9aa0-0f9f3dd7272a" alt="Gambar Halaman Explore News" width="300"></td>
    <td><img src="https://github.com/user-attachments/assets/1dd1f9dd-734e-4f2c-bc20-67178949d2bb" alt="Gambar Halaman Profile" width="300"></td>
  </tr>
</table>


---


## ▶️ Cara Menjalankan

1. Clone repositori ini:
   ```bash
   git clone https://github.com/ahmadr1d1/CryptoTrack.git
   ```
2. Buka di Android Studio.
3. Pastikan Anda memiliki API Key dan letakkan di file `ApiConfig.kt` dan `NewsApiConfig.kt`.
4. Jalankan di emulator atau perangkat Android.

---

## 📹 Rekaman Penggunaan Aplikasi
📎 [Link Google Drive](https://drive.google.com/file/d/1xN2B8EzspuVWOPIkGOAsF_TiYsc1Q3CR/view?usp=drive_link)

---

## 📝 Catatan Pengembangan

- **Fitur yang Belum Dikembangkan**  
  Beberapa fitur seperti _halaman Profile_ dan _halaman Favorite News_ memang belum dikembangkan sepenuhnya saat ini. Hal ini saya putuskan karena saat ini saya memiliki deadline project android app lainnya yang lebih saya prioritasakan untuk saya selesaikan terlebih dahulu. Pengembangan fitur tersebut tetap akan saya rencanakan di masa mendatang.
  
- **Resource Tidak Terpakai**  
  Beberapa resource yang saat ini belum digunakan sengaja tidak dihapus dari proyek. Hal ini dilakukan untuk mempermudah proses pengembangan di masa mendatang, sehingga saya tidak perlu mencari ulang atau menambahkan kembali resource eksternal saat fitur tambahan ingin diimplementasikan.

- **Akses API dan Keamanan**  
  Untuk keperluan pembelajaran terkait praktik keamanan, _API Key_ dan _Base URL_ dari **CoinGecko** dan **CoinStats** tidak disertakan langsung dalam repositori ini. Informasi tersebut disimpan secara lokal melalui file `local.properties`. Jika Anda tertarik untuk menjalankan aplikasi ini secara penuh, silakan hubungi saya secara langsung untuk mendapatkan akses.

- **Manual Dependency Injection**  
  Dalam proyek ini, dependency injection dilakukan secara manual tanpa menggunakan framework seperti Hilt atau Dagger. Keputusan ini diambil karena saya saat ini masih dalam tahap mempelajari penggunaan framework DI yang lebih kompleks. Pendekatan manual ini dipilih untuk menjaga struktur kode tetap modular dan mudah dipahami selama proses pengembangan awal.

- **Caching dan Rate Limit Handling**  
  Mengingat penggunaan API CoinGecko dalam proyek ini menggunakan free plan, terdapat batasan pemanggilan API yang cukup ketat. Untuk mengatasinya:
  - Beberapa grafik harga (chart) menerapkan caching lokal agar tidak selalu memicu request ke API saat pengguna berpindah-pindah tampilan.
  - Diberlakukan cooldown timer ketika pengguna membuka halaman detail untuk kedua kalinya dalam waktu singkat. Ini mencegah permintaan berulang yang tidak perlu dan membantu menjaga penggunaan dalam batas aman dari API rate limit.

---

## 📄 Lisensi

[MIT License](https://github.com/ahmadr1d1/CryptoTrack/blob/master/LICENSE). Silakan gunakan dan modifikasi proyek ini sesuai kebutuhan Anda.
