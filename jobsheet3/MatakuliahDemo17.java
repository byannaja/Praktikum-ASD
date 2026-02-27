package jobsheet3;
import java.util.Scanner;

public class MatakuliahDemo17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Masukkan jumlah Matakuliah: ");
        int jumlah = sc.nextInt();
        sc.nextLine();
        Matakuliah17[] arrayOfMatakuliah17 = new Matakuliah17[jumlah];
        String kode,nama,dummy;
        int sks,jumlahJam;

        for (int i = 0; i < arrayOfMatakuliah17.length; i++){
            System.out.println("Masukkan Data Matakuliah ke-" + (i+1));
            System.out.print("Kode        : ");
            kode = sc.nextLine();
            System.out.print("Nama        : ");
            nama = sc.nextLine();
            System.out.print("SKS         : ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam  : ");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("-----------------------------------");

            arrayOfMatakuliah17[i] = new Matakuliah17(kode, nama, sks, jumlahJam);
            arrayOfMatakuliah17[1] = new Matakuliah17(kode, nama, sks);
            arrayOfMatakuliah17[i].tambahData(kode, nama, sks, jumlahJam);
        }

        for (int i = 0; i < arrayOfMatakuliah17.length; i++){
            System.out.println("Data Matakuliah ke-" + (i+1));
            arrayOfMatakuliah17[i].cetakInfo();
        }
        sc.close();
    }
}