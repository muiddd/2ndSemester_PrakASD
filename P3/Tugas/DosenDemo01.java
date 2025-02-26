package Tugas;

import java.util.Scanner;

public class DosenDemo01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah dosen: ");
        int jml = sc.nextInt();
        sc.nextLine();
        
        Dosen01 [] daftarDosen = new Dosen01[jml];

        for (int i = 0; i < daftarDosen.length; i++) {
            System.out.println("Masukkan data dosen ke-" + (i + 1) + ":");
            daftarDosen[i] = new Dosen01();
            daftarDosen[i].tambahData();
        }

        DataDosen01 dataDosen = new DataDosen01();
        dataDosen.dataSemuaDosen(daftarDosen);
        dataDosen.jumlahDosenPerJenisKelamin(daftarDosen);
        dataDosen.rerataUsiaDosenPerJenisKelamin(daftarDosen);

        Dosen01 dosenTertua = new Dosen01();
        dosenTertua = dataDosen.infoDosenPalingTua(daftarDosen);
        dosenTertua.cetakInfo();

        Dosen01 dosenTermuda = new Dosen01();
        dosenTermuda = dataDosen.infoDosenPalingMuda(daftarDosen);
        dosenTermuda.cetakInfo();

        sc.close();
    }
}
