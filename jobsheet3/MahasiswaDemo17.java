package jobsheet3;

public class MahasiswaDemo17 {
    public static void main(String[] args) {
        Mahasiswa17 [] arrayOfMahasiswa17 = new Mahasiswa17[3];
        arrayOfMahasiswa17[0] = new Mahasiswa17();
        arrayOfMahasiswa17[0].nim = "3784972289743";
        arrayOfMahasiswa17[0].nama = "AGNES TITANIA KINANTI";
        arrayOfMahasiswa17[0].kelas = "SIB 1E";
        arrayOfMahasiswa17[0].ipk = (float) 3.75;

        arrayOfMahasiswa17[1] = new Mahasiswa17();
        arrayOfMahasiswa17[1].nim = "20498239084";
        arrayOfMahasiswa17[1].nama = "ACHMAD MAULANA HAMZAH";
        arrayOfMahasiswa17[1].kelas = "TI 2A";
        arrayOfMahasiswa17[1].ipk = (float) 3.36;

        arrayOfMahasiswa17[2] = new Mahasiswa17();
        arrayOfMahasiswa17[2].nim = "23487283947";
        arrayOfMahasiswa17[2].nama = "DIRHAMAWAN PURWANTO";
        arrayOfMahasiswa17[2].kelas = "TI 2E";
        arrayOfMahasiswa17[2].ipk = (float) 3.80;

        System.out.println("Nama    : "+arrayOfMahasiswa17[0].nama);
        System.out.println("NIM     : "+arrayOfMahasiswa17[0].nim);
        System.out.println("Kelas   : "+arrayOfMahasiswa17[0].kelas);
        System.out.println("IPK     : " + arrayOfMahasiswa17[0].ipk);
        System.out.println("------------------------------");
        System.out.println("Nama    : "+arrayOfMahasiswa17[1].nama);
        System.out.println("NIM     : "+arrayOfMahasiswa17[1].nim);
        System.out.println("Kelas   : "+arrayOfMahasiswa17[1].kelas);
        System.out.println("IPK     : "+arrayOfMahasiswa17[1].ipk);
        System.out.println("------------------------------");
        System.out.println("Nama    : "+arrayOfMahasiswa17[2].nama);
        System.out.println("NIM     : "+arrayOfMahasiswa17[2].nim);
        System.out.println("Kelas   : "+arrayOfMahasiswa17[2].kelas);
        System.out.println("IPK     : "+arrayOfMahasiswa17[2].ipk);
        System.out.println("------------------------------");
    }
    
}
