package P6;

import java.util.Scanner;

public class MahasiswaDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nMasukkan jumlah Mahasiswa: ");
        int jml = sc.nextInt();
        sc.nextLine();

        MahasiswaBerprestasi01 list = new MahasiswaBerprestasi01(jml);
        
        for (int i = 0; i < jml; i++) {
            System.out.println("\nMasukkan data mahasiswa ke-"+ (i+1));
            System.out.print("NIM: ");
            String nim = sc.nextLine();
            System.out.print("Nama: ");
            String nama = sc.nextLine();
            System.out.print("Kelas: ");
            String kelas = sc.nextLine();
            System.out.print("IPK: ");
            double ipk = sc.nextDouble();
            sc.nextLine();
            
            Mahasiswa01 m = new Mahasiswa01(nim,nama,kelas,ipk);
            list.tambah(m);
        }
        
        
        System.out.println("\nData Mahasiswa setelah sorting berdasarkan IPK (DESC): ");
        list.bubbleSort();
        list.tampil();

        System.out.println("\nData yang sudah terurut menggunakan SELECTION SORT (ASC): ");
        list.selectionSort();
        list.tampil();

        sc.close();
    }
}
