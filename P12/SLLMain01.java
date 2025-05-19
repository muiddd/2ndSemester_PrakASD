package P12;

import java.util.Scanner;
public class SLLMain01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SingleLinkedList01 sll = new SingleLinkedList01();
        int pilih;

        do {
            System.out.println("\n===== Menu Linked List =====");
            System.out.println("1. Tambah data di awal");
            System.out.println("2. Tambah data di akhir");
            System.out.println("3. Tambah data setelah nama tertentu");
            System.out.println("4. Tambah data pada indeks tertentu");
            System.out.println("5. Tampilkan semua data");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    Mahasiswa01 mhsAwal = inputMhs01(sc);
                    sll.addFirst01(mhsAwal);
                    break;
                case 2:
                    Mahasiswa01 mhsAkhir = inputMhs01(sc);
                    sll.addLast01(mhsAkhir);
                    break;
                case 3:
                    System.out.print("Masukkan nama mahasiswa yang dicari: ");
                    String key = sc.nextLine();
                    Mahasiswa01 mhsAfter = inputMhs01(sc);
                    sll.insertAfter01(key, mhsAfter);
                    break;
                case 4:
                    System.out.print("Masukkan indeks: ");
                    int index = sc.nextInt();
                    sc.nextLine();
                    Mahasiswa01 mhsIndex = inputMhs01(sc);
                    sll.inserAt01(index, mhsIndex);
                    break;
                case 5:
                    sll.print01();
                    break;
                case 0:
                    System.out.println("Terimakasih.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilih!=0);
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