package P6;

import java.util.Scanner;

public class DosenDemo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen01 data = new DataDosen01();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampil Data Dosen");
            System.out.println("3. Sorting ASC (Usia Muda ke Tua)");
            System.out.println("4. Sorting DSC (Usia Tua ke Muda)");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            int pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.println("\n==Tambah data dosen==");
                    if (data.idx >= 10) {
                        System.out.println("data penuh");
                        break;
                    }
                    System.out.print("Masukkan Kode: ");
                    String kode = sc.nextLine();
                    System.out.print("Masukkan Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan Jenis Kelamin: ");
                    String jk = sc.nextLine();
                    boolean jenisKelamin = jk.equalsIgnoreCase("Laki-laki") ? true : false;
                    System.out.print("Masukkan Usia: ");
                    int usia = sc.nextInt();
                    sc.nextLine();
                    Dosen01 dsn = new Dosen01(kode, nama, jenisKelamin, usia);
                    data.tambah(dsn);
                    System.out.println("Data berhasil ditambahkan");
                    break;

                case 2:
                    System.out.println("\n==Daftar data semua dosen==");
                    data.tampil();
                    break;

                case 3:
                    data.sortingASC();
                    System.out.println("\n==Data dosen usia termuda sampai tertua==");
                    data.tampil();
                    break;

                case 4:
                    data.sortingDSC();
                    System.out.println("\n==Data dosen usia tertua sampai termuda==");
                    data.tampil();
                    break;

                case 5:
                    System.out.println("Terima kasih");
                    sc.close();
                    return;

                default:
                    System.out.println("Pilihan tidak valid");
            }
        }
    }
}
