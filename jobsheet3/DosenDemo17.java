package jobsheet3;
import java.util.Scanner;
public class DosenDemo17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Data = ");
        int data = sc.nextInt();
        sc.nextLine();
        Dosen17[] arrDosen17 = new Dosen17[data];
        String nama, kode, dummy;
        boolean jenisKelamin;
        int usia;

        for (int i = 0; i < arrDosen17.length; i++){
        System.out.println("Masukkan data dosen ke-" + (i + 1));
        System.out.print("Kode               : ");
        kode = sc.nextLine();
        System.out.print("Nama               : ");
        nama = sc.nextLine();
        System.out.print("Jenis Kelamin (P/W): ");
        dummy = sc.nextLine();

        if (dummy.equalsIgnoreCase("P")){
         jenisKelamin =  false;
        }else {
            jenisKelamin = true;
        }
        System.out.print("Usia               : ");
        usia = sc.nextInt();
        sc.nextLine();
        System.out.println("------------------------------");
        arrDosen17[i] = new Dosen17(kode, nama, jenisKelamin, usia);
        }
    for (Dosen17 dsn : arrDosen17){

        System.out.println("Kode          : "+dsn.kode);
        System.out.println("Nama          : "+dsn.nama);
        System.out.println("Jenis Kelamin : "+dsn.jenisKelamin);
        System.out.println("Usia          : "+dsn.usia);
        System.out.println("-------------------------------");
    }
        DataDosen17 dt = new DataDosen17();
        dt.dataSemuaDosen(arrDosen17);
        dt.jumlahDosenPerJenisKelamin(arrDosen17);
        dt.rerataUsiaDosenPerJenisKelamin(arrDosen17);
        dt.infoDosenPalingTua(arrDosen17);
        dt.infoDosenPalingMuda(arrDosen17);
   sc.close(); }
}
