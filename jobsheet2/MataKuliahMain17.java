package jobsheet2;

public class MataKuliahMain17 {
    public static void main(String[] args) {
      MataKuliah17 mk1 = new MataKuliah17();
      mk1.nama = "fas";
      mk1.kodeMK = "A897S";
      mk1.sks = 3;
      mk1.jumlahJam = 4;

      mk1.tampilkanInformasi();
      mk1.ubahSKS(2);
      mk1.kurangiJam(5);
      mk1.tambahJam(8);
      mk1.tampilkanInformasi();

      MataKuliah17 mk2 = new MataKuliah17("34875Y", "San", 2, 8);
      mk2.tampilkanInformasi();
      mk2.kurangiJam(3);
      mk2.tampilkanInformasi();

      MataKuliah17 mk3 = new MataKuliah17("48975UY", "Iyan", 3, 2);
      mk3.tampilkanInformasi();
      mk3.kurangiJam(4);
      mk3.ubahSKS(4);
      mk3.tampilkanInformasi();
    }
}