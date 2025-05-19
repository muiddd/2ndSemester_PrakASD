package P12.Tugas;

import java.util.Scanner;
public class SLLQMain01 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    SLLQ01 Q = new SLLQ01();
    int pilih;

    do {
        System.out.println("\n==== ANTRIAN LAYANAN UNIT KEMAHASISWAAAN ====");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Cek Antrian Kosong");
            System.out.println("4. Kosongkan Antrian");
            System.out.println("5. Tampilkan Semua Antrian");
            System.out.println("6. Tampilkan Antrian terdepan");
            System.out.println("7. Tampilkan Antrian terakhir");
            System.out.println("8. Tampilkan Jumlah Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt(); sc.nextLine();

            switch (pilih) {
                case 1:
                    Mahasiswa01 mhs = inputMhs01(sc);
                    Q.Enqueue01(mhs);
                    break;
                case 2:
                    Q.Dequeue01();
                    break;
                case 3:
                    System.out.println(Q.isEmpty01()?"Antrian kosong!":"Terdapat Antrian!");
                    break;
                case 4:
                    Q.clear01();
                    break;
                case 5: 
                    Q.Print01();
                    break;
                case 6:
                    Q.PeekFirst01();
                    break;
                case 7:
                    Q.PeekLast01();
                    break;
                case 8:
                    System.out.println("Jumlah Antrian: " + Q.jmlAntrian01());
                    break;
                case 0:
                    System.out.println("Terimakasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
                    break;
            }
    } while (pilih != 0);
    sc.close();
    }

    public static Mahasiswa01 inputMhs01(Scanner sc) {
        System.out.print("NIM     : ");
        String nim = sc.nextLine();
        System.out.print("Nama    : ");
        String nama = sc.nextLine();
        System.out.print("Kelas   : ");
        String kelas = sc.nextLine();
        System.out.print("IPK     : ");
        double ipk = sc.nextDouble();
        sc.nextLine();

        return new Mahasiswa01(nim, nama, kelas, ipk);
    }
}