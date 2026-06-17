package Minggu10Tugas;

public class Mahasiswa17 {
    String nim;
    String nama;
    String prodi;
    String kelas;

    public Mahasiswa17(String nim, String nama, String prodi, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.kelas = kelas;
    }

    public void tampilkanData() {
        System.out.printf("%-12s | %-15s | %-8s | %-6s\n", nim, nama, prodi, kelas);
    }
}