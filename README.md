# Warkop Digital - Tugas Akhir PBO 1

## Deskripsi Studi Kasus
Program ini mensimulasikan sistem kasir warkop sederhana yang mendukung
menu Minuman dan Makanan, sistem member dengan diskon 10%, pengecekan
stok otomatis menggunakan custom exception, serta perhitungan struk
belanja secara otomatis berdasarkan pilihan menu dan jumlah pesanan
pengguna.

## Anggota
- Nama: Riyanti Nafisa
- NPM: 24100010250
- Kelas: 4M

## Struktur Program
- `MenuItem.java` — class abstrak induk semua menu
- `Minuman.java` — subclass menu minuman
- `Makanan.java` — subclass menu makanan
- `Pelanggan.java` — data pelanggan & logika diskon
- `Pesanan.java` — transaksi pesanan (array/list item + total)
- `StokTidakCukupException.java` — custom exception
- `Main.java` — program utama (IO, alur transaksi)

## Cara Menjalankan
```
javac src/*.java -d out
java -cp out Main
```

## Tabel Penilaian Mandiri

| No | Materi | Bobot | Diterapkan di (file/method) | Nilai |
|----|--------|-------|------------------------------|-------|
| 1 | Class | 5 | Semua file `.java` (MenuItem, Minuman, Makanan, Pelanggan, Pesanan, Main, StokTidakCukupException) | 5 |
| 2 | Object | 5 | `Main.java` — pembuatan objek `Minuman`, `Makanan`, `Pelanggan`, `Pesanan` | 5 |
| 3 | Atribut | 5 | `MenuItem.java` (nama, harga, stok), `Minuman.java` (ukuran), `Makanan.java` (kategori), `Pelanggan.java` (nama, isMember), `Pesanan.java` (pelanggan, daftarItem, daftarJumlah) | 5 |
| 4 | Constructor | 5 | `MenuItem(...)`, `Minuman(...)`, `Makanan(...)`, `Pelanggan(...)`, `Pesanan(...)` | 5 |
| 5 | Mutator | 5 | `MenuItem.setStok()`, `MenuItem.setHarga()`, `Pelanggan.setMember()` | 5 |
| 6 | Accessor | 5 | `MenuItem.getNama()/getHarga()/getStok()`, `Minuman.getUkuran()`, `Makanan.getKategori()`, `Pelanggan.getNama()/isMember()` | 5 |
| 7 | Encapsulation | 5 | Semua atribut di `MenuItem`, `Minuman`, `Makanan`, `Pelanggan`, `Pesanan` bersifat `private`, diakses lewat getter/setter | 5 |
| 8 | Inheritance | 5 | `Minuman extends MenuItem`, `Makanan extends MenuItem`, `StokTidakCukupException extends Exception` | 5 |
| 9 | Polymorphism | 10 | `hitungHargaAkhir()` dan `getDeskripsi()` di-override berbeda di `Minuman.java` dan `Makanan.java` | 10 |
| 10 | Seleksi | 5 | `Pelanggan.getPersenDiskon()` (if isMember), `MenuItem.kurangiStok()` (if jumlah > stok), `Main.java` (if lanjut pesan) | 5 |
| 11 | Perulangan | 5 | `Pesanan.hitungTotalSebelumDiskon()` & `cetakStruk()` (for loop), `Main.java` (for loop tampilkan menu, while loop pesan berulang) | 5 |
| 12 | IO Sederhana | 10 | `Main.java` — `Scanner` untuk input nama, status member, pilihan menu, dan jumlah | 10 |
| 13 | Array | 15 | `Main.java` — `ArrayList<MenuItem> daftarMenu`; `Pesanan.java` — `ArrayList<MenuItem> daftarItem`, `ArrayList<Integer> daftarJumlah` | 15 |
| 14 | Error Handling | 15 | `StokTidakCukupException.java` (custom exception), `MenuItem.kurangiStok()` (throw), `Main.java` (try-catch saat tambah pesanan) | 15 |
| **TOTAL** | | **100** | | **100** |

## Link Video Penjelasan
> TODO: tempel link YouTube video penjelasan kamu di sini
