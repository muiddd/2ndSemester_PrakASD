package P11.Percobaan2;
import java.util.Scanner;
public class LayananAkademikSIAKAD01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianLayanan01 antrian = new AntrianLayanan01(5);
        int pilihan;

        do {
            System.out.println("\n=== Menu Antrian Layanan Akademik ===");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Layani Mahasiswa");
            System.out.println("3. Lihat Mahasiswa Terdepan");
            System.out.println("4. Lihat Semua Antrian");
            System.out.println("5. Jumlah Mahasiswa dalam Antrian");
            System.out.println("6. Cek antrian paling belakang");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt(); sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("NIM    : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama   : ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi  : ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas  : ");
                    String kelas = sc.nextLine();
                    Mahasiswa01 mhs = new Mahasiswa01(nim, nama, prodi, kelas);
                    antrian.tambahAntrian01(mhs);
                    break;
                case 2:
                    Mahasiswa01 dilayani = antrian.layaniMahasiswa01();
                    if (dilayani != null) {
                        System.out.print("Melayani mahasiswa: ");
                        dilayani.tampilkanData();
                    }
                    break;
                case 3:
                    antrian.lihatTerdepan01();
                    break;
                case 4: 
                    antrian.tampilkanSemua01();
                    break;
                case 5: 
                    System.out.println("Jumlah dalam antrian: " + antrian.getJumlahAntrian01());
                    break;
                case 6:
                    antrian.lihatAkhir01();
                    break;
                case 0: 
                    System.out.println("Terima kasih.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan !=0);
        sc.close();
    }
}
