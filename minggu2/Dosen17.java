package jobsheet2;

public class Dosen17 {
    String idDosen, nama, bidangKeahlian;
    boolean statusAktif;
    int tahunBergabung;

    public Dosen17(){

    }
    public Dosen17(String nm, String id, boolean Status, int tahun, String Ahli){
    idDosen = id;
    nama = nm;
    bidangKeahlian = Ahli;
    statusAktif = Status;
    tahunBergabung = tahun;
    }

    void tampilanInformasi(){
        System.out.println("Nama : " +nama);
        System.out.println("ID Dosen : " +idDosen);
        if (statusAktif){
        System.out.println("Status : Aktif");}
        else {
            System.out.println("Status : Tidak aktif");}
        System.out.println("Tahun bergabung : " +tahunBergabung);
        System.out.println("Bidang keahlian : " +bidangKeahlian);
    }
    void setStatusAktif(boolean Status){
        statusAktif = Status;
    }

    void hitungMasaKerja(int thnSkrng){
       int masaKerja = thnSkrng - tahunBergabung;
        System.out.println("Masa kerja : " + masaKerja);
        System.out.println("----------------");
    }
    void ubahKeahlian(String bidang){
        bidangKeahlian = bidang;
    }
}
