package jobsheet2;

public class MataKuliah17 {
    String kodeMK, nama;
    int sks, jumlahJam;

    public MataKuliah17(){

    }
    public MataKuliah17(String mk, String nm, int Sks, int Jam){
        kodeMK = mk;
        nama = nm;
        sks = Sks;
        jumlahJam = Jam;
    }
    void tampilkanInformasi (){
    System.out.println("Nama : " +nama);
    System.out.println("kode MK : " +kodeMK);
    System.out.println("SKS : " +sks);
    if (jumlahJam >= 0){
    System.out.println("Jumlah jam : " +jumlahJam);
    }
    else {
        System.out.println("Jumlah jam : Maaf jumlah jam tidak cukup.");
    }
    System.out.println("--------------------");
}

    void ubahSKS(int sksBaru){
    sks = sksBaru;
    }

    void tambahJam(int jam){
        jumlahJam += jam;
    }

    void kurangiJam(int jam){
       if (jumlahJam < jam){
        jumlahJam = -1;
        return;
    }
    jumlahJam -=jam;
    }
}
