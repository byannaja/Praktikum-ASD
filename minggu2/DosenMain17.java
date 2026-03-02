package jobsheet2;

public class DosenMain17 {
    public static void main(String[] args) {
        Dosen17 ds1 = new Dosen17();
        ds1.nama = "Supri";
        ds1.idDosen ="3489758937";
        ds1.statusAktif = true;
        ds1.tahunBergabung = 2009;
        ds1.bidangKeahlian = "Berenang";
        ds1.tampilanInformasi();
        ds1.hitungMasaKerja(2018);
        
        ds1.ubahKeahlian("Berlari");
        ds1.tampilanInformasi();
        ds1.hitungMasaKerja(2018);

        Dosen17 ds2 = new Dosen17("Dian", "847239847", false, 2012, "Menembak");
        ds2.tampilanInformasi();
        ds2.hitungMasaKerja(2018);

        ds2.ubahKeahlian("Memasak");
        ds2.tampilanInformasi();
        ds2.hitungMasaKerja(2018);

    }
    
}
