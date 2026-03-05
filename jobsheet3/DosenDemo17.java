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
        System.out.print("Jenis Kelamin (P/L): ");
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

        String jk;
        if (dsn.jenisKelamin){
            jk = "Wanita";
        }
        else {
            jk = "Pria";
        }
        System.out.println("Kode          : "+dsn.kode);
        System.out.println("Nama          : "+dsn.nama);
        System.out.println("Jenis Kelamin : "+jk);
        System.out.println("Usia          : "+dsn.usia);
        System.out.println("-------------------------------");
    }
   sc.close(); }
}
