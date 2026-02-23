import java.util.Scanner;

public class Tugas1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        char[] kode = {'A','B','D','E','F','G','H','L','N','T'};

        String[] kota = {
                "BANTEN",
                "JAKARTA",
                "BANDUNG",
                "CIREBON",
                "BOGOR",
                "PEKALONGAN",
                "SEMARANG",
                "SURABAYA",
                "MALANG",
                "TEGAL"
        };

        System.out.print("Masukkan kode plat: ");
        char cari = input.next().toUpperCase().charAt(0);

        boolean ditemukan = false;

        for (int i = 0; i < kode.length; i++) {
            if (cari == kode[i]) {
                System.out.println("Kota: " + kota[i]);
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Kode tidak ditemukan");
        }
    }
}