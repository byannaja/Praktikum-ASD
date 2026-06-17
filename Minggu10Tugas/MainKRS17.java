package Minggu10Tugas;

import java.util.Scanner;

public class MainKRS17 {
    public static void menu() {
        System.out.println("\n=== MENU ANTRIAN KRS DOSEN PEMBINA AKADEMIK ===");
        System.out.println("1. Tambah Mahasiswa ke Antrian");
        System.out.println("2. Panggil & Proses KRS (2 Mahasiswa)");
        System.out.println("3. Lihat Semua Antrian");
        System.out.println("4. Lihat 2 Antrian Terdepan");
        System.out.println("5. Lihat Antrian Paling Akhir");
        System.out.println("6. Cetak Jumlah & Statistik KRS");
        System.out.println("7. Kosongkan Antrian");
        System.out.println("0. Keluar");
        System.out.print("Pilih operasi (0-7): ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianKRS17 antrian = new AntrianKRS17(10); 
        int pilihan;

        do {
            menu();
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("\n--- Masukkan Data Mahasiswa ---");
                    System.out.print("NIM   : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama  : ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi : ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = sc.nextLine();
                    
                    Mahasiswa17 mhs = new Mahasiswa17(nim, nama, prodi, kelas);
                    antrian.tambahAntrian(mhs);
                    break;

                case 2:
                    antrian.panggilProsesKRS();
                    break;

                case 3:
                    antrian.tampilkanSemua();
                    break;

                case 4:
                    antrian.tampilkanDuaTerdepan();
                    break;

                case 5:
                    antrian.tampilkanPalingAkhir();
                    break;

                case 6:
                    antrian.cetakStatistik();
                    break;

                case 7:
                    antrian.clear();
                    break;

                case 0:
                    System.out.println("Program selesai. Terima kasih.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid! Silakan masukkan angka yang benar (0-7).");
                    break;
            }
        } while (pilihan != 0);

        sc.close();
    }
}
