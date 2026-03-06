package jobsheet3;

public class DataDosen17 {
    int wanita = 0, pria = 0;
    void dataSemuaDosen(Dosen17[] arrayOfDosen){
        for (Dosen17 dsn : arrayOfDosen){

        String jk;
        if (dsn.jenisKelamin){
            jk = "Wanita";
        }
        else {
            jk = "Pria";
        }
        System.out.println("Kode          : "+dsn.kode);
        System.out.println("Nama          : "+dsn.nama);
        System.out.println("Jenis Kelamin : "+jk);
        System.out.println("Usia          : "+dsn.usia);
        System.out.println("-------------------------------");

    }
}
    
    void jumlahDosenPerJenisKelamin(Dosen17[] arrayOfDosen){
        
        for (Dosen17 dsn : arrayOfDosen){
        if (dsn.jenisKelamin){
            wanita++;
        }
        else {
            pria++;
        }
        }
        System.out.println("Jumlah Wanita : "+wanita);
        System.out.println("Jumlah Pria   : "+pria);
    }
    void rerataUsiaDosenPerJenisKelamin(Dosen17[] arrayOfDosen){
        int jumlahUMRW = 0, jumlahUMRP = 0;
        double rataP = 0, rataw = 0;
        for (Dosen17 dsn : arrayOfDosen){
            if (dsn.jenisKelamin){
            jumlahUMRW += dsn.usia;
        }
            else {
            jumlahUMRP += dsn.usia;
            }
        }
            rataw = (double) jumlahUMRW / wanita;
            rataP = (double) jumlahUMRP / pria;

         if (wanita!=0)  { System.out.println("Rata usia Wanita : "+rataw);}
        if (pria !=0){  System.out.println("Rata usia Pria   : "+rataP);}
        }
    void infoDosenPalingTua(Dosen17[] arrayOfDosen){
        Dosen17 tertua = arrayOfDosen[0];

        for (Dosen17 dsn : arrayOfDosen){
        if (dsn.usia > tertua.usia){
            tertua = dsn;
        }
    }

        String jk;
        if (tertua.jenisKelamin){
            jk = "Pria";
        } else {
            jk = "Wanita";
    }

            System.out.println("------------------------------");
            System.out.println("Dosen Paling Tua");
            System.out.println("Kode          : " + tertua.kode);
            System.out.println("Nama          : " + tertua.nama);
            System.out.println("Jenis Kelamin : " + jk);
            System.out.println("Usia          : " + tertua.usia);
        }
       void infoDosenPalingMuda(Dosen17[] arrayOfDosen){
            Dosen17 termuda =  arrayOfDosen[0];
            for (Dosen17 dsn : arrayOfDosen){
                if (dsn.usia < termuda.usia){
                    termuda = dsn;
                }
            }
            String jk;
        if (termuda.jenisKelamin){
            jk = "Pria";
        } else {
            jk = "Wanita";
    }

            System.out.println("------------------------------");
            System.out.println("Dosen Paling muda");
            System.out.println("Kode          : " + termuda.kode);
            System.out.println("Nama          : " + termuda.nama);
            System.out.println("Jenis Kelamin : " + jk);
            System.out.println("Usia          : " + termuda.usia);
        }
}
