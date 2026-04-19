package jobsheet6;

public class Mahasiswa17 {
    String nim, nama, kelas;
    double ipk;

    Mahasiswa17(){

    }
    Mahasiswa17(String nm, String name, String kls, double ip){
        nim = nm;
        nama = name;
        kelas = kls;
        ipk = ip;
    }
    
    void tampilInformasi (){
        System.out.println("NIM : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("Kelas : " + kelas);
        System.out.println("IPK : " +ipk);
    }
}
