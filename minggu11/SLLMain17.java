package minggu11;

import java.util.Scanner; // modifikasi 2.1.2

public class SLLMain17 {
    public static void main(String[] args) {

        SingleLinkedList17 sll = new SingleLinkedList17();

        // modifikasi 2.1.2
        Scanner sc = new Scanner(System.in);

        // modifikasi 2.1.2
        System.out.print("Jumlah mahasiswa yang akan ditambahkan: ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        // modifikasi 2.1.2
        for (int i = 0; i < jumlah; i++) {

            System.out.println("\nData Mahasiswa ke-" + (i + 1));

            System.out.print("NIM   : ");
            String nim = sc.nextLine();

            System.out.print("Nama  : ");
            String nama = sc.nextLine();

            System.out.print("Kelas : ");
            String kelas = sc.nextLine();

            System.out.print("IPK   : ");
            double ipk = sc.nextDouble();
            sc.nextLine();

            Mahasiswa17 mhs = new Mahasiswa17(nim, nama, kelas, ipk);

            // modifikasi 2.1.2
            sll.addLast(mhs);
        }

        sll.print();

        sc.close(); // modifikasi 2.1.2
    }
}