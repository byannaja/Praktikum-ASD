import java.util.Scanner;

public class Tugas2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah jadwal: ");
        int n = input.nextInt();
        input.nextLine();

        String[][] jadwal = new String[n][4];

        for (int i = 0; i < n; i++) {
            System.out.println("\nJadwal ke-" + (i + 1));

            System.out.print("Nama Mata Kuliah: ");
            jadwal[i][0] = input.nextLine();

            System.out.print("Ruang: ");
            jadwal[i][1] = input.nextLine();

            System.out.print("Hari: ");
            jadwal[i][2] = input.nextLine();

            System.out.print("Jam: ");
            jadwal[i][3] = input.nextLine();
        }

        System.out.println("\n===== Semua Jadwal =====");
        System.out.printf("%-20s %-10s %-10s %-10s\n",
                "Mata Kuliah", "Ruang", "Hari", "Jam");

        for (int i = 0; i < n; i++) {
            System.out.printf("%-20s %-10s %-10s %-10s\n",
                    jadwal[i][0],
                    jadwal[i][1],
                    jadwal[i][2],
                    jadwal[i][3]);
        }

        System.out.print("\nCari berdasarkan hari: ");
        String cariHari = input.nextLine();

        System.out.println("Hasil:");
        for (int i = 0; i < n; i++) {
            if (jadwal[i][2].equalsIgnoreCase(cariHari)) {
                System.out.printf("%-20s %-10s %-10s %-10s\n",
                        jadwal[i][0],
                        jadwal[i][1],
                        jadwal[i][2],
                        jadwal[i][3]);
            }
        }

        System.out.print("\nCari berdasarkan mata kuliah: ");
        String cariMK = input.nextLine();

        System.out.println("Hasil:");
        for (int i = 0; i < n; i++) {
            if (jadwal[i][0].equalsIgnoreCase(cariMK)) {
                System.out.printf("%-20s %-10s %-10s %-10s\n",
                        jadwal[i][0],
                        jadwal[i][1],
                        jadwal[i][2],
                        jadwal[i][3]);
            }
        }

        input.close();
    }
}
