package minggu11;

public class QueueLLTugas17 {
    NodeTugas17 head;
    NodeTugas17 tail;
    int size;

    public QueueLLTugas17() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    // d. Cek antrian kosong
    public boolean isEmpty() {
        return head == null;
    }

    // d. Cek antrian penuh (Linked list bersifat dinamis sehingga teoritis tidak penuh)
    public boolean isFull() {
        return false;
    }

    // e. Menambahkan antrian (Enqueue)
    public void enqueue(MahasiswaTugas17 input) {
        NodeTugas17 ndInput = new NodeTugas17(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
        size++;
        System.out.println(input.nama + " berhasil masuk ke antrian.");
    }

    // f. Memanggil/mengeluarkan antrian terdepan (Dequeue)
    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian sudah kosong!");
            return;
        }
        System.out.println("Memanggil antrian mahasiswa:");
        head.data.tampilInformasi();
        
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
    }

    // g. Menampilkan antrian terdepan dan paling akhir
    public void peek() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.println("=== Antrian Terdepan ===");
            head.data.tampilInformasi();
            System.out.println("=== Antrian Paling Akhir ===");
            tail.data.tampilInformasi();
        }
    }

    // h. Menampilkan daftar antrian & jumlah mahasiswa yang masih mengantre
    public void displayQueue() {
        if (isEmpty()) {
            System.out.println("Tidak ada mahasiswa dalam antrian.");
            return;
        }
        System.out.println("--- Daftar Antrian Saat Ini ---");
        NodeTugas17 temp = head;
        int no = 1;
        while (temp != null) {
            System.out.println("[" + no + "]");
            temp.data.tampilInformasi();
            System.out.println("------------------------");
            temp = temp.next;
            no++;
        }
        System.out.println("Jumlah mahasiswa dalam antrian: " + size + " orang.");
    }

    // d. Mengosongkan seluruh antrian
    public void clear() {
        head = null;
        tail = null;
        size = 0;
        System.out.println("Antrian berhasil dikosongkan!");
    }
}
