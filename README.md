# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pendaftaran kursus menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa berapa banyak banyak pendaftaran yang akan dilakukan, nama kursus, harga kursus, nama pendaftar, durasi kursus dan memberikan output berupa informasi detail dari transaksi tersebut seperti total biaya dan lain sebagainya.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Kursus`, `Pebdaftaran` dan `Main` adalah contoh dari class.

```bash
public class Kursus {
    ...
}

public class Pendaftaran extends Kursus {
    ...
}

public class Main {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, ` Pendaftaran[] pendaftarans = new Pendaftaran[jumlahPendaftaran];`adalah contoh pembuatan object.

```bash
Pendaftaran[] pendaftarans = new Pendaftaran[jumlahPendaftaran];
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `namaKursus`,`biayaKursus`,`namaPeserta`,`durasiKursus`,`totalBiaya` dan `jumlahPendaftaran` adalah contoh atribut.

```bash
String namaKursus;
double biayaKursus;
String namaPeserta;
int durasiKursus; 
double totalBiaya = hitungTotalBiaya();
int jumlahPendaftaran = 0;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Kursus` dan `Pendaftaran`.

```bash
public Kursus(String namaKursus, double biayaKursus) {
        this.namaKursus = namaKursus;
        this.biayaKursus = biayaKursus;
    }

  public Pendaftaran(String namaKursus, double biayaKursus, String namaPeserta, int durasiKursus) {
        super(namaKursus, biayaKursus); 
        this.namaPeserta = namaPeserta;
        this.durasiKursus = durasiKursus;
    }
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNamaKursus`,`setBiayaKursus`,`setNamaPeserta`dan`setDurasiKursus` adalah contoh method mutator.

```bash
public void setNamaKursus(String namaKursus) {
        this.namaKursus = namaKursus;
    }
     public void setBiayaKursus(double biayaKursus) {
        this.biayaKursus = biayaKursus;
    }

   public void setNamaPeserta(String namaPeserta) {
        this.namaPeserta = namaPeserta;
    }
    public void setDurasiKursus(int durasiKursus) {
        this.durasiKursus = durasiKursus;
    }
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini,`getNamaKursus`,`getBiayaKursus`,`getNamaPeserta`dan`getDurasiKursus` adalah contoh method accessor.

```bash
   public String getNamaKursus() {
        return namaKursus;
    }
    public double getBiayaKursus() {
        return biayaKursus;
    }
     public String getNamaPeserta() {
        return namaPeserta;
    }

 public int getDurasiKursus() {
        return durasiKursus;
    }
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `namaKursus`,`biayaKursus`,`namaPeserta`,`durasiKursus` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
 private String namaKursus;
 private double biayaKursus;
 private String namaPeserta;
 private int durasiKursus; 
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `Pendaftaran` mewarisi `Kursus` dengan sintaks `extends`.

```bash
public class Pendaftaran extends Kursus {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `tampilkanInfo()` di `Kursus` merupakan overloading `tampilkanInfo()` di `Pendaftaran` merupakan override dari method `tampilkanInfo()` di `Kursus`.

```bash
   public void tampilkanInfo() {
        System.out.println("Nama Kursus: " + namaKursus);
        System.out.println("Biaya Kursus: Rp" + biayaKursus);
    }

@Override
public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Nama Peserta: " + namaPeserta);
        System.out.println("Durasi Kursus: " + durasiKursus + " minggu");
        double totalBiaya = hitungTotalBiaya();
        System.out.println("Total Biaya: Rp" + totalBiaya);
        if (totalBiaya >= 1000000) {
            double potongan = totalBiaya * 0.1;
            double totalBiayaSetelahPotongan = totalBiaya - potongan;
            System.out.println("Potongan (10%): Rp" + potongan);
            System.out.println("Total Biaya Setelah Potongan: Rp" + totalBiayaSetelahPotongan);
        }
    }
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if` dalam method `tampilkanInfo()` di Pendaftaran untuk menentukan apakah transaksi lebih dari Rp.1.000.000, jika lebih maka mendapat potongan 10%.
```bash
 if (totalBiaya >= 1000000) {
            double potongan = totalBiaya * 0.1;
            double totalBiayaSetelahPotongan = totalBiaya - potongan;
            System.out.println("Potongan (10%): Rp" + potongan);
            System.out.println("Total Biaya Setelah Potongan: Rp" + totalBiayaSetelahPotongan);
        }
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for (int i = 0; i < jumlahPendaftaran; i++) {
    ...
}

for (Pendaftaran pendaftaran : pendaftarans) {
            pendaftaran.tampilkanInfo();
            System.out.println();
        }
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner scanner = new Scanner(System.in);
System.out.print("Masukkan jumlah pendaftaran: ");
jumlahPendaftaran = scanner.nextInt();
System.out.print("Masukkan biaya kursus per minggu untuk pendaftaran " + (i + 1) + ": ");
biayaKursus = scanner.nextDouble();
System.out.print("Masukkan nama peserta untuk pendaftaran " + (i + 1) + ": ");
String namaPeserta = scanner.nextLine();
System.out.print("Masukkan durasi kursus (minggu) untuk pendaftaran " + (i + 1) + ": ");
durasiKursus = scanner.nextInt();


```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `pendaftarans[i] = new Pendaftaran(namaKursus, biayaKursus, namaPeserta, durasiKursus);` adalah contoh penggunaan array.

```bash
pendaftarans[i] = new Pendaftaran(namaKursus, biayaKursus, namaPeserta, durasiKursus);
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
while (true) {
            try {
                System.out.print("Masukkan jumlah pendaftaran: ");
                jumlahPendaftaran = scanner.nextInt();
                scanner.nextLine();  
                if (jumlahPendaftaran <= 0) {
                    System.out.println("Jumlah pendaftaran harus lebih dari 0. Silakan coba lagi.");
                    continue;
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Input tidak valid. Silakan masukkan angka.");
                scanner.next();
            }
        }


while (true) {
                try {
                    System.out.print("Masukkan biaya kursus per minggu untuk pendaftaran " + (i + 1) + ": ");
                    biayaKursus = scanner.nextDouble();
                    scanner.nextLine(); 
                    if (biayaKursus <= 0) {
                        System.out.println("Biaya kursus harus lebih dari 0. Silakan coba lagi.");
                        continue;
                    }
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Input tidak valid. Silakan masukkan angka.");
                    scanner.next();  
                }
            }

while (true) {
                try {
                    System.out.print("Masukkan durasi kursus (minggu) untuk pendaftaran " + (i + 1) + ": ");
                    durasiKursus = scanner.nextInt();
                    scanner.nextLine();  
                    if (durasiKursus <= 0) {
                        System.out.println("Durasi kursus harus lebih dari 0 minggu. Silakan coba lagi.");
                        continue;
                    }
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Input tidak valid. Silakan masukkan angka.");
                    scanner.next(); 
                }
            }
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Noor Admayanti
NPM: 2210010147
