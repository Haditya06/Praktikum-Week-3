# Praktikum-Week-3
percabangan java

pada minggu ke 3 ini saya mempelajari tentang percangan yaitu if, if else dan switch case
# 📘 Algoritma Pemrograman 

## Bab VI – Perulangan

tugas praktik dari mata kuliah **Algoritma Pemrograman** Program Studi **Rekayasa Perangkat Lunak, Universitas Telkom Surabaya (2025)**.
Topik utama nya adalah **Perulangan (Looping)** — konsep dasar dalam pemrograman untuk mengeksekusi blok kode secara berulang berdasarkan kondisi tertentu.

---

## 🎯 Tujuan Pembelajaran

1. Menggunakan berbagai jenis struktur perulangan (`for`, `while`, dan `do-while`).
2. Melakukan *tracing* dan memahami alur logika dari proses iteratif dalam kode program.

---

## 🧠 Materi dan Tugas

### 🧩 **Jurnal Terbimbing**

#### 1. Mencari Bilangan Terkecil `n` Sehingga `n³ > Input`

* **Deskripsi:** Program mencari nilai bilangan bulat terkecil `n` di mana `n³` lebih besar dari nilai yang dimasukkan pengguna.
* **Spesifikasi:**

  * Gunakan ketiga jenis perulangan (`for`, `while`, `do-while`).
  * Program berjalan dari `n = 1` ke atas hingga menemukan hasil yang memenuhi `n³ > input`.
  * Setelah ketemu, tampilkan nilai `n` tersebut.
* **Contoh:**

  * Input: `12000`
  * Output: `23`, karena `23³ = 12167 > 12000`.

#### 2. Penjumlahan Bilangan Genap dari 1 hingga N

* **Deskripsi:** Program menjumlahkan seluruh bilangan genap dari `1` sampai `N`, di mana `N` merupakan input dari pengguna.
* **Tujuan:** Melatih penggunaan perulangan untuk akumulasi nilai berdasarkan kondisi tertentu (bilangan genap).

#### 3. Menentukan Bilangan Prima

* **Deskripsi:** Program menentukan apakah sebuah angka `N` merupakan bilangan prima atau bukan.
* **Logika:** Sebuah angka dikatakan prima jika hanya habis dibagi oleh `1` dan dirinya sendiri.
* **Contoh Output:**

  * Input: `10` → Output: *"10 bukan bilangan prima"*
  * Input: `11` → Output: *"11 bilangan prima"*

---

### 🧩 **Jurnal Mandiri**

#### 1. Menampilkan Daftar Bilangan Prima dari 1 hingga N

* **Deskripsi:** Modifikasi dari soal Jurnal Terbimbing No. 3.
  Program menampilkan seluruh bilangan prima antara 1 sampai `N`.
* **Tujuan:** Melatih perulangan bersarang dan logika pengecekan kondisi untuk setiap angka dalam rentang tertentu.

#### 2. Game Tebak Angka (0–100)

* **Deskripsi:** Program interaktif di mana komputer menghasilkan angka acak antara 0–100, lalu pengguna menebaknya.
* **Aturan:**

  * Jika tebakan < nilai sebenarnya → tampilkan *“Nilai yang anda masukkan lebih kecil”*
  * Jika tebakan > nilai sebenarnya → tampilkan *“Nilai yang anda masukkan lebih besar”*
  * Jika sama → tampilkan *“Tebakan yang bagus, anda berhasil menebaknya dalam N kali tebakan”*
* **Implementasi:** Gunakan class `Random` dari Java:

  ```java
  import java.util.Random;
  Random gen = new Random();
  int nilai = gen.nextInt(100);
  ```
* **Tujuan:** Melatih penggunaan perulangan dengan kondisi dinamis, serta logika percabangan dan interaksi dengan input pengguna.

---

## ⚙️ Bahasa Pemrograman

Seluruh soal dikerjakan menggunakan **Java**, dengan fokus pada struktur dasar:

* Input/output (`Scanner`)
* Kontrol alur (`if-else`, `for`, `while`, `do-while`)
* Operasi logika dan aritmatika
* Penggunaan kelas `Random` untuk menghasilkan nilai acak

---

## 📄 Referensi

Materi ini mengacu pada beberapa sumber klasik dalam algoritma pemrograman, di antaranya:

* Cormen et al., *Introduction to Algorithms* (MIT Press, 2009)
* Sedgewick, *Algorithms in Java* (Pearson, 2002)
* Deitel & Deitel, *Java How to Program* (Prentice Hall, 2011)
* Poo et al., *Object-Oriented Programming and Java* (Springer, 2010)
* Wu, *An Introduction to Object-Oriented Programming with Java* (McGraw-Hill, 2009)

---

## 💡 Kesimpulan

Bab ini melatih pemahaman mendalam terhadap struktur **perulangan** melalui penerapan nyata pada beberapa kasus logika dan numerik.
Mahasiswa diharapkan tidak hanya mampu menulis sintaks perulangan, tetapi juga memahami *kapan dan bagaimana* tiap jenis loop digunakan secara efektif dalam penyelesaian masalah.

---
