package P10;

import java.util.Scanner;

public class SuratDemo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackSurat01 stack = new StackSurat01(100);
        int pilih;

        do {
            System.out.println("\n=== MENU SURAT IZIN MAHASISWA ===");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("ID Surat        : ");
                    String id = sc.nextLine();
                    System.out.print("Nama Mahasiswa  : ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas           : ");
                    String kelas = sc.nextLine();
                    System.out.print("Jenis Izin (S/I): ");
                    char jenis = sc.nextLine().toUpperCase().charAt(0);
                    System.out.print("Durasi (hari)   : ");
                    int durasi = sc.nextInt();
                    sc.nextLine();
                    stack.push01(new Surat01(id, nama, kelas, jenis, durasi));
                    break;

                case 2:
                    Surat01 suratProses = stack.pop01();
                    if (suratProses != null) {
                        System.out.println("Surat diproses:");
                        suratProses.tampil01();
                    }
                    break;

                case 3:
                    Surat01 suratTerakhir = stack.peek01();
                    if (suratTerakhir != null) {
                        System.out.println("Surat terakhir:");
                        suratTerakhir.tampil01();
                    }
                    break;

                case 4:
                    System.out.print("Masukkan nama mahasiswa: ");
                    String cari = sc.nextLine();
                    stack.cariSurat01(cari);
                    break;

                case 5:
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih != 5);

        sc.close();
    }
}
