public class StackSurat17 {
    Surat17[] stack;
    int size;
    int top;

    public StackSurat17(int size) {
        this.size = size;
        stack = new Surat17[size];
        top = -1;
    }

    public boolean isFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(Surat17 surat) {
        if (!isFull()) {
            top++;
            stack[top] = surat;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan surat lagi.");
        }
    }

    public Surat17 pop() {
        if (!isEmpty()) {
            Surat17 s = stack[top];
            top--;
            return s;
        } else {
            System.out.println("Stack kosong! Tidak ada surat untuk diproses.");
            return null;
        }
    }

    public Surat17 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada surat yang masuk.");
            return null;
        }
    }

    public void cariSurat(String namaMahasiswa) {
        boolean ditemukan = false;
        for (int i = 0; i <= top; i++) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(namaMahasiswa)) {
                System.out.println("Surat ditemukan!");
                System.out.println("ID Surat\t: " + stack[i].idSurat);
                System.out.println("Nama\t\t: " + stack[i].namaMahasiswa);
                System.out.println("Kelas\t\t: " + stack[i].kelas);
                System.out.println("Jenis Izin\t: " + stack[i].jenisIzin);
                System.out.println("Durasi\t\t: " + stack[i].durasi + " hari");
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Surat atas nama " + namaMahasiswa + " tidak ditemukan.");
        }
    }
}