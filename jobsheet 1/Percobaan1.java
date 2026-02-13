import java.util.Scanner;

public class Percobaan1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double tugas, kuis, uts, uas;
        double nilaiAkhir;
        String nilaiHuruf;
        String status;

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("================================");

        System.out.print("Masukkan Nilai Tugas: ");
        tugas = input.nextDouble();

        System.out.print("Masukkan Nilai Kuis: ");
        kuis = input.nextDouble();

        System.out.print("Masukkan Nilai UTS: ");
        uts = input.nextDouble();

        System.out.print("Masukkan Nilai UAS: ");
        uas = input.nextDouble();

        System.out.println("================================");
        System.out.println("================================");

        if (tugas < 0 || tugas > 100 ||
            kuis < 0 || kuis > 100 ||
            uts < 0 || uts > 100 ||
            uas < 0 || uas > 100) {

            System.out.println("nilai tidak valid");
            System.out.println("================================");
            System.out.println("================================");
        } else {

            nilaiAkhir = (0.2 * tugas) + (0.2 * kuis) + (0.3 * uts) + (0.3 * uas);

            if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
                nilaiHuruf = "A";
            } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
                nilaiHuruf = "B+";
            } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
                nilaiHuruf = "B";
            } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
                nilaiHuruf = "C+";
            } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
                nilaiHuruf = "C";
            } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
                nilaiHuruf = "D";
            } else {
                nilaiHuruf = "E";
            }

            if (nilaiHuruf.equals("A") ||
                nilaiHuruf.equals("B+") ||
                nilaiHuruf.equals("B") ||
                nilaiHuruf.equals("C+") ||
                nilaiHuruf.equals("C")) {

                status = "SELAMAT ANDA LULUS";
            } else {
                status = "ANDA TIDAK LULUS";
            }

            System.out.println("Nilai akhir : " + nilaiAkhir);
            System.out.println("Nilai Huruf : " + nilaiHuruf);
            System.out.println("================================");
            System.out.println("================================");
            System.out.println(status);
        }
    }
}