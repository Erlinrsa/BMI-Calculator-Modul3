# BMI Calculator - Modul 2 Pemrograman Lanjut

## Deskripsi Program
Program BMI (Body Mass Index) Calculator adalah aplikasi berbasis Java yang digunakan untuk menghitung dan mengkategorikan indeks massa tubuh seseorang. Program ini dapat menghitung BMI untuk dua kategori pengguna: **Adult** (Dewasa) dan **Child** (Anak-anak), dengan standar kategori BMI yang berbeda untuk masing-masing kelompok usia.

Program ini telah di-refactoring menggunakan konsep OOP (Object-Oriented Programming) dengan penerapan inheritance, encapsulation, dan abstraction.

## Fitur Program
-  Menghitung BMI berdasarkan berat dan tinggi badan
-  Kategori BMI berbeda untuk Adult dan Child
-  Menampilkan informasi lengkap: nama, berat, tinggi, umur, nilai BMI, dan kategori
-  Menggunakan inheritance untuk Adult dan Child class
-  Implementasi abstract class dan method

## Rumus Perhitungan BMI
```
BMI = Berat Badan (kg) / (Tinggi Badan (m) × Tinggi Badan (m))
```

## Kategori BMI

### Untuk Adult (Dewasa):
| Nilai BMI | Kategori |
|-----------|----------|
| < 18.5 | Underweight |
| 18.5 - 24.9 | Normal |
| 25.0 - 29.9 | Overweight |
| ≥ 30.0 | Obese |

### Untuk Child (Anak-anak):
| Nilai BMI | Kategori |
|-----------|----------|
| < 16.0 | Underweight |
| 16.0 - 21.9 | Normal |
| ≥ 22.0 | Overweight |

## Cara Menjalankan Program

### Prerequisites:
- Java JDK 8 atau lebih tinggi
- IntelliJ IDEA atau IDE Java lainnya

### Langkah-langkah:
1. Buka project di IntelliJ IDEA
2. Pastikan semua file `.java` sudah ada di project
3. Jalankan file `Main.java`
4. Program akan menampilkan output perhitungan BMI untuk 3 test case

## Struktur Project
```
BMICalculator/
├── src/
│   ├── Main.java              # Entry point program
│   ├── BMIPerson.java         # Abstract parent class
│   ├── Adult.java             # Class untuk orang dewasa
│   ├── Child.java             # Class untuk anak-anak
│   └── MainApp.java           # Class implementasi
└── README.md                  # File dokumentasi
```

## Penjelasan Class

### 1. BMIPerson (Abstract Class)
- Parent class untuk Adult dan Child
- Menyimpan data: nama, weight, height, age
- Memiliki abstract method: `displayInfo()` dan `calculateBMI()`

### 2. Adult (Child Class)
- Extends dari BMIPerson
- Implementasi perhitungan BMI untuk orang dewasa
- Kategori: Underweight, Normal, Overweight, Obese

### 3. Child (Child Class)
- Extends dari BMIPerson
- Implementasi perhitungan BMI untuk anak-anak
- Kategori: Underweight, Normal, Overweight

### 4. MainApp
- Class implementasi yang extends BMIPerson
- Menangani logika untuk Adult dan Child

### 5. Main
- Entry point program
- Berisi test case untuk menguji program

## Contoh Output Program
```
=== BMI CALCULATOR ===
Nama: Budi
Berat: 70.0 kg
Tinggi: 1.75 m
Tipe: Adult
Umur: 25 tahun
BMI: 22.86
Kategori: Normal

=== BMI CALCULATOR ===
Nama: Siti
Berat: 55.0 kg
Tinggi: 1.6 m
Tipe: Adult
Umur: 30 tahun
BMI: 21.48
Kategori: Normal

=== BMI CALCULATOR ===
Nama: Andi
Berat: 40.0 kg
Tinggi: 1.5 m
Tipe: Child
Umur: 12 tahun
BMI: 17.78
Kategori: Normal
```

## Konsep OOP yang Diterapkan
1. **Inheritance**: Adult dan Child mewarisi dari BMIPerson
2. **Encapsulation**: Penggunaan private attributes dengan getter/setter
3. **Abstraction**: BMIPerson sebagai abstract class
4. **Polymorphism**: Override method displayInfo() dan calculateBMI()

## Refactoring yang Dilakukan
-  Memisahkan logic Adult dan Child ke class terpisah
-  Menggunakan constant untuk batas kategori BMI
-  Menghilangkan magic numbers
-  Implementasi inheritance yang proper
-  Menambahkan dokumentasi JavaDoc

## Author
- **Nama**: Erlin Mariska
- **NIM**: 202410370110514
- **Kelas**: Pemrograman Lanjut
- **Prodi**: Teknik Informatika
- **Universitas**: Universitas Muhammadiyah Malang

## Versi
- **Versi 1.0** - Implementasi awal dengan refactoring
- **Tanggal**: 27 Oktober 

## Catatan
Program ini dibuat sebagai tugas Modul 2 mata kuliah Pemrograman Lanjut. Program telah di-refactoring sesuai dengan best practices dan prinsip Clean Code.