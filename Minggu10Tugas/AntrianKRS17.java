package Minggu10Tugas;

public class AntrianKRS17 {
    Mahasiswa17[] data;
    int front;
    int rear;
    int size;
    int max;
    int totalSudahKRS;
    int kuotaDPA;

    public AntrianKRS17(int n) {
        max = n;
        data = new Mahasiswa17[max];
        size = 0;
        front = 0;
        rear = -1;
        totalSudahKRS = 0;
        kuotaDPA = 30;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void clear() {
        if (!isEmpty()) {
            front = 0;
            rear = -1;
            size = 0;
            System.out.println("Antrian KRS berhasil dikosongkan.");
        } else {
            System.out.println("Antrian sudah kosong.");
        }
    }

    public void tambahAntrian(Mahasiswa17 mhs) {
        if (isFull()) {
            System.out.println("Gagal: Antrian sudah penuh! (Maksimal " + max + " mahasiswa)");
        } else {
            rear = (rear + 1) % max;
            data[rear] = mhs;
            size++;
            System.out.println(mhs.nama + " berhasil mendaftar ke antrian KRS.");
        }
    }

    public void panggilProsesKRS() {
        if (size < 2) {
            System.out.println("Gagal: Proses KRS membutuhkan minimal 2 mahasiswa di dalam antrian.");
        } else {
            System.out.println("--- MEMPROSES KRS UNTUK 2 MAHASISWA ---");
            for (int k = 0; k < 2; k++) {
                Mahasiswa17 mhs = data[front];
                System.out.print("Diproses -> ");
                mhs.tampilkanData();
                
                front = (front + 1) % max;
                size--;
                totalSudahKRS++;
            }
            System.out.println("Status: 2 Mahasiswa selesai divalidasi oleh DPA.");
        }
    }

    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("\n=== DAFTAR SELURUH ANTRIAN KRS ===");
            System.out.printf("%-3s | %-12s | %-15s | %-8s | %-6s\n", "No", "NIM", "Nama", "Prodi", "Kelas");
            System.out.println("---------------------------------------------------------");
            for (int i = 0; i < size; i++) {
                int index = (front + i) % max;
                System.out.printf("%-3d | ", (i + 1));
                data[index].tampilkanData();
            }
            System.out.println("Jumlah mahasiswa dalam antrian aktif: " + size);
        }
    }

    public void tampilkanDuaTerdepan() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else if (size == 1) {
            System.out.println("\n=== 2 ANTRIAN TERDEPAN ===");
            System.out.print("1. ");
            data[front].tampilkanData();
            System.out.println("(Hanya ada 1 mahasiswa di antrian)");
        } else {
            System.out.println("\n=== 2 ANTRIAN TERDEPAN ===");
            int index1 = front;
            int index2 = (front + 1) % max;
            System.out.print("1. ");
            data[index1].tampilkanData();
            System.out.print("2. ");
            data[index2].tampilkanData();
        }
    }

    public void tampilkanPalingAkhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("\n=== ANTRIAN PALING AKHIR ===");
            data[rear].tampilkanData();
        }
    }

    public void cetakStatistik() {
        int belumKRS = kuotaDPA - totalSudahKRS;
        System.out.println("\n========= STATISTIK KRS DPA =========");
        System.out.println("Jumlah Antrian Aktif saat ini : " + size);
        System.out.println("Mahasiswa SUDAH proses KRS    : " + totalSudahKRS);
        System.out.println("Sisa Kuota Mahasiswa BELUM KRS: " + belumKRS + " / " + kuotaDPA);
        System.out.println("=====================================");
    }
}
