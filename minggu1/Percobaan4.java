public class Percobaan4 {

    public static void main(String[] args) {

        int[] stok = {
            10,5,15,7,
            6,11,9,12,
            2,10,10,5,
            5,7,12,9
        };

        int[] harga = {75000, 50000, 60000, 10000};

        String[] cabang = {
            "RoyalGarden 1",
            "RoyalGarden 2",
            "RoyalGarden 3",
            "RoyalGarden 4"
        };

        int index = 0;

        for (int i = 0; i < 4; i++) {

            int total = 0;

            for (int j = 0; j < 4; j++) {
                total += stok[index] * harga[j];
                index++;
            }

            System.out.println(cabang[i]);
            System.out.println("Pendapatan: Rp " + total);

            if (total > 1500000) {
                System.out.println("Status: Sangat Baik");
            } else {
                System.out.println("Status: Perlu Evaluasi");
            }

            System.out.println("----------------------");
        }
    }
}
