package kursus;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jumlahPendaftaran = 0;

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

        System.out.println("=======================================================");
        
        Pendaftaran[] pendaftarans = new Pendaftaran[jumlahPendaftaran];

        for (int i = 0; i < jumlahPendaftaran; i++) {
            System.out.print("Masukkan nama kursus untuk pendaftaran " + (i + 1) + ": ");
            String namaKursus = scanner.nextLine();

            double biayaKursus = 0;
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

            System.out.print("Masukkan nama peserta untuk pendaftaran " + (i + 1) + ": ");
            String namaPeserta = scanner.nextLine();

            int durasiKursus = 0;
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
            System.out.println("-------------------------------------------------------------");
            pendaftarans[i] = new Pendaftaran(namaKursus, biayaKursus, namaPeserta, durasiKursus);
        }

        System.out.println("\nSemua Pendaftaran:");
        for (Pendaftaran pendaftaran : pendaftarans) {
            pendaftaran.tampilkanInfo();
            System.out.println();
        }

        scanner.close();
    }
}
