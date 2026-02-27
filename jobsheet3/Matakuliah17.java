package jobsheet3;

public class Matakuliah17 {
    public String kode, nama;
    public int sks, jumlahJam;

    public Matakuliah17(){
        
    }

    public Matakuliah17 (String kode, String nama, int sks, int jumlahJam){
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }
    public Matakuliah17 (String kode, String nama, int sks){
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
    }
    public void tambahData(String kode, String nama, int sks, int jumlahJam){
    this.kode = kode;
    this.nama = nama;
    this.sks = sks;
    this.jumlahJam = jumlahJam;
}
public void cetakInfo(){
    System.out.println("Kode        : " + kode);
    System.out.println("Nama        : " + nama);
    System.out.println("SKS         : " + sks);
    System.out.println("Jumlah Jam  : " + jumlahJam);
    System.out.println("-----------------------------------");
}
}
