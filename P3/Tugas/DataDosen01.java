package Tugas;

public class DataDosen01 {
    int pria = 0;
    int wanita = 0;

    void dataSemuaDosen(Dosen01[] daftarDosen) {
        System.out.println("\n==Data Semua Dosen==");
        for (int i = 0; i < daftarDosen.length; i++) {
            System.out.println("Data dosen ke-" + (i+1) + (":"));
            System.out.println("Kode          : " + daftarDosen[i].kode);
            System.out.println("Nama          : " + daftarDosen[i].nama);
            System.out.println("Jenis Kelamin : " + (daftarDosen[i].jenisKelamin ? "Pria" : "Wanita"));
            System.out.println("Usia          : " + daftarDosen[i].usia);
        }
    }

    void jumlahDosenPerJenisKelamin(Dosen01[] daftarDosen){
        for (Dosen01 dosen : daftarDosen) {
            if(dosen.jenisKelamin){
                pria++;
            } else {
                wanita++;
            }
        }

        System.out.println("\n==Jumlah Dosen Per Jenis Kelamin==");
        System.out.println("Jumlah Pria: " + pria);
        System.out.println("Jumlah Wanita: " + wanita);
    }

    void rerataUsiaDosenPerJenisKelamin(Dosen01[] daftarDosen){
        int totalUsiaPria =0, totalUsiaWanita=0;
        for (int i = 0; i < daftarDosen.length; i++) {
            if(daftarDosen[i].jenisKelamin==true){
                totalUsiaPria += daftarDosen[i].usia;
            } else {
                totalUsiaWanita += daftarDosen[i].usia;
            }
        }

        System.out.println("\n==Rerata Usia Dosen Per Jenis Kelamin==");
        System.out.println("Rerata Usia Pria: " + totalUsiaPria/pria);
        System.out.println("Rerata Usia Wanita: " + totalUsiaWanita/wanita);
    }

    Dosen01 infoDosenPalingTua(Dosen01[] daftarDosen){
        System.out.println("\n==Data Dosen Paling Tua==");
        Dosen01 usiaTertua;
        usiaTertua = daftarDosen[0];
        for (int i = 0; i < daftarDosen.length; i++) {
            if(usiaTertua.usia < daftarDosen[i].usia){
                usiaTertua = daftarDosen[i];
            } 
        }
    return usiaTertua;    
    } 

    Dosen01 infoDosenPalingMuda(Dosen01[] daftarDosen){
        System.out.println("\n==Data Dosen Paling Muda==");
        Dosen01 usiaTermuda;
        usiaTermuda = daftarDosen[0];
        for (int i = 0; i < daftarDosen.length; i++) {
            if(usiaTermuda.usia > daftarDosen[i].usia){
                usiaTermuda = daftarDosen[i];
            }
        }
    return usiaTermuda;
    }
}
