package P13.Tugas1;

import java.util.Scanner;

public class DLLQVaksinMain01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DLLQVaksin01 Q = new DLLQVaksin01();
        int pilih;

        do {
            System.out.println("\n+++++++++++++++++++++++++++++");
            System.out.println("PENGANTRI VAKSIN EXTRAVAGANZA");
            System.out.println("+++++++++++++++++++++++++++++");
            System.out.println("1. Tambah Data Penerima Vaksin");
            System.out.println("2. Hapus Data Pengantri Vaksin");
            System.out.println("3. Daftar Penerima Vaksin");
            System.out.println("4. Keluar");
            System.out.println("+++++++++++++++++++++++++++++");
            pilih = sc.nextInt();sc.nextLine();
            
            switch (pilih) {
                case 1:
                    System.out.println("-----------------------------");
                    System.out.println("Masukkan Data Penerima Vaksin");
                    System.out.println("-----------------------------");
                    System.out.println("Nomor Antrian: ");
                    String nomor = sc.nextLine();
                    System.out.println("Nama Penerima: ");
                    String nama = sc.nextLine();
                    DataVaksin01 dt = new DataVaksin01(nomor, nama);
                    Q.Enqueue01(dt);
                    break;
                case 2:
                    Q.Dequeue01();
                    Q.Print01();
                    break;
                case 3:
                    Q.Print01();
                    break;
                case 4:
                    System.out.println("Terima Kasih");
                    break;
                default:
                    System.out.println("Pilihan Tidak valid");
                    break;
            }
        } while (pilih != 4);
        sc.close();
    }
}
