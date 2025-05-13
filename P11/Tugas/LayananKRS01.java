package P11.Tugas;

import java.util.Scanner;

public class LayananKRS01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianKRS01 antrian = new AntrianKRS01(10);
        int pilihan;

        do {
            System.out.println("\n=== Menu Antrian KRS ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Proses KRS (2 Mahasiswa)");
            System.out.println("3. Lihat 2 Mahasiswa Terdepan");
            System.out.println("4. Lihat Mahasiswa Terakhir");
            System.out.println("5. Tampilkan Semua Antrian");
            System.out.println("6. Cek Antrian Kosong");
            System.out.println("7. Cek Antrian Penuh");
            System.out.println("8. Kosongkan Antrian");
            System.out.println("9. Jumlah Antrian");
            System.out.println("10. Sudah Proses KRS");
            System.out.println("11. Belum Proses KRS");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilihan = sc.nextInt(); sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("NIM   : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama  : ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi : ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = sc.nextLine();
                    Mahasiswa01 mhs = new Mahasiswa01(nim, nama, prodi, kelas);
                    antrian.tambahAntrian01(mhs);
                    break;
                case 2:
                    antrian.prosesKRS01();
                    break;
                case 3:
                    antrian.lihatDuaTerdepan01();
                    break;
                case 4:
                    antrian.lihatAkhir01();
                    break;
                case 5:
                    antrian.tampilkanSemua01();
                    break;
                case 6:
                    System.out.println(antrian.isEmpty01()? "Antrian saat ini kosong" : "Antrian tidak kosong");
                    break;
                case 7:
                    System.out.println(antrian.isFull01()? "Antrian saat ini penuh" : "Antrian belum penuh");
                    break;
                case 8:
                    antrian.kosongkanAntrian01();
                    break;
                case 9:
                    System.out.println("Jumlah dalam antrian: " + antrian.getJumlahAntrian01());
                    break;
                case 10:
                    System.out.println("Jumlah sudah proses KRS: " + antrian.getJumlahSudahProses01());
                    break;
                case 11:
                    System.out.println("Sisa kuota proses KRS: " + antrian.getJumlahBelumProses01());
                    break;
                case 0:
                    System.out.println("Terima Kasih.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);
        sc.close();
    }
}
