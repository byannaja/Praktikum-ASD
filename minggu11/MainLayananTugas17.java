package minggu11;

import java.util.Scanner;

public class MainLayananTugas17 {
    public static void menu() {
        System.out.println("\n=================================");
        System.out.println(" MENU LAYANAN UNIT KEMAHASISWAAN ");
        System.out.println("=================================");
        System.out.println("1. Daftarkan Mahasiswa (Enqueue)");
        System.out.println("2. Panggil Antrian (Dequeue)");
        System.out.println("3. Cek Antrian Depan & Belakang (Peek)");
        System.out.println("4. Cetak Semua Antrian & Jumlah Sisa");
        System.out.println("5. Kosongkan Antrian (Clear)");
        System.out.println("6. Keluar");
        System.out.println("=================================");
        System.out.print("Pilih menu (1-6): ");
    }

    public static void main(String[] args) {
        QueueLLTugas17 antrian = new QueueLLTugas17();
        Scanner scTugas17 = new Scanner(System.in);
        int pilihan;

        do {
            menu();
            pilihan = scTugas17.nextInt();
            scTugas17.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("\n--- Input Data Mahasiswa Baru ---");
                    System.out.print("NIM   : ");
                    String nim = scTugas17.nextLine();
                    System.out.print("Nama  : ");
                    String nama = scTugas17.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = scTugas17.nextLine();
                    System.out.print("IPK   : ");
                    double ipk = scTugas17.nextDouble();
                    
                    MahasiswaTugas17 mhs = new MahasiswaTugas17(nim, nama, kelas, ipk);
                    antrian.enqueue(mhs);
                    break;

                case 2:
                    System.out.println();
                    antrian.dequeue();
                    break;

                case 3:
                    System.out.println();
                    antrian.peek();
                    break;

                case 4:
                    System.out.println();
                    antrian.displayQueue();
                    break;

                case 5:
                    System.out.println();
                    antrian.clear();
                    break;

                case 6:
                    System.out.println("\nProgram selesai. Terima kasih!");
                    break;

                default:
                    System.out.println("\nPilihan menu tidak valid!");
            }
        } while (pilihan != 6);

        scTugas17.close();
    }
}
