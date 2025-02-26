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

        int i=1;
        for (Dosen01 dosen01 : daftarDosen) {
            System.out.println("Data dosen ke-" + (i));
            dosen01.cetakInfo();
            i++;
        }

        sc.close();
    }
}
