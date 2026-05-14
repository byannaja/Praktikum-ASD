import java.util.Scanner;

public class SuratDemo17 {
    public static void main(String[] args) {
        StackSurat17 stack = new StackSurat17(5);
        Scanner scan = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat");
            System.out.print("Pilih: ");
            pilih = scan.nextInt();
            scan.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("ID Surat: ");
                    String idSurat = scan.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String namaMahasiswa = scan.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = scan.nextLine();
                    System.out.print("Jenis Izin (S/I): ");
                    char jenisIzin = scan.nextLine().charAt(0);
                    System.out.print("Durasi (hari): ");
                    int durasi = scan.nextInt();
                    scan.nextLine();
                    Surat17 surat = new Surat17(idSurat, namaMahasiswa, kelas, jenisIzin, durasi);
                    stack.push(surat);
                    System.out.printf("Surat %s berhasil diterima\n", surat.namaMahasiswa);
                    break;
                case 2:
                    Surat17 diproses = stack.pop();
                    if (diproses != null) {
                        System.out.println("Memproses surat dari " + diproses.namaMahasiswa);
                        System.out.println("ID Surat\t: " + diproses.idSurat);
                        System.out.println("Kelas\t\t: " + diproses.kelas);
                        System.out.println("Jenis Izin\t: " + diproses.jenisIzin);
                        System.out.println("Durasi\t\t: " + diproses.durasi + " hari");
                        System.out.println("Surat berhasil diproses.");
                    }
                    break;
                case 3:
                    Surat17 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Surat terakhir masuk dari " + lihat.namaMahasiswa);
                        System.out.println("ID Surat\t: " + lihat.idSurat);
                        System.out.println("Kelas\t\t: " + lihat.kelas);
                        System.out.println("Jenis Izin\t: " + lihat.jenisIzin);
                        System.out.println("Durasi\t\t: " + lihat.durasi + " hari");
                    }
                    break;
                case 4:
                    System.out.print("Masukkan nama mahasiswa yang dicari: ");
                    String cari = scan.nextLine();
                    stack.cariSurat(cari);
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih >= 1 && pilih <= 4);
    }
}