package P13.Tugas2;

import java.util.Scanner;

public class DLLFilmMain01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DLLFilm01 dll = new DLLFilm01();
        int pilih;

        do {
            System.out.println("\n=============================");
            System.out.println("DATA FILM LAYAR LEBAR");
            System.out.println("=============================");
            System.out.println("1. Tambah Data Awal");
            System.out.println("2. Tambah Data Akhir");
            System.out.println("3. Tambah Data Index Tertentu");
            System.out.println("4. Hapus Data Pertama");
            System.out.println("5. Hapus Data Terakhir");
            System.out.println("6. Hapus Data Tertentu");
            System.out.println("7, Cetak");
            System.out.println("8. Cari ID Film");
            System.out.println("9. Urut Data Rating Film-DESC");
            System.out.println("10. Keluar");
            System.out.println("=============================");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt(); sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.println("Masukkan Data Film Posisi Awal");
                    Film01 film = inputFilm01(sc);
                    dll.addFirst01(film);
                    break;
                case 2:
                    System.out.println("Masukkan Data Film Posisi Akhir");
                    film = inputFilm01(sc);
                    dll.addLast01(film);
                    break;
                case 3:
                    System.out.print("Masukkan Data Film\nUrutan ke- : ");
                    int index = sc.nextInt(); sc.nextLine();
                    film = inputFilm01(sc);
                    System.out.println("Data Film ini akan masuk di urutan ke- " + index);
                    dll.add01(film, index);
                    break;
                case 4:
                    dll.removeFirst01();
                    break;
                case 5:
                    dll.removeLast01();
                    break;
                case 6:
                    System.out.print("Masukkan index yang ingin dihapus: ");
                    int idx = sc.nextInt(); sc.nextLine();
                    dll.remove01(idx);
                    break;
                case 7:
                    dll.print01();
                    break;
                case 8:
                    System.out.println("Cari Data");
                    System.out.print("Masukkan ID Film yang dicari: ");
                    String cariId = sc.nextLine();
                    dll.searching01(cariId);
                    break;
                case 9:
                    dll.sorting01();
                    break;
                case 10:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan menu tidak valid");
                    break;
            }
        } while (pilih != 10);
        sc.close();
    }

    public static Film01 inputFilm01(Scanner sc) {
        System.out.print("ID Film     : ");
        String id = sc.nextLine();
        System.out.print("Judul Film  : ");
        String judul = sc.nextLine();
        System.out.print("Rating Film : ");
        double rating = sc.nextDouble();
        sc.nextLine();
        return new Film01(id, judul, rating);
    }
}
