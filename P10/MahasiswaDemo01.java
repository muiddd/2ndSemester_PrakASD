package P10;

import java.util.Scanner;

public class MahasiswaDemo01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        StackTugasMahasiswa01 stack = new StackTugasMahasiswa01(5);
        int pilih;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Mengumpulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Melihat Tugas Teratas");
            System.out.println("4. Melihat Tugas Terbawah");
            System.out.println("5. Melihat Daftar Tugas");
            System.out.print("PIlih: ");
            pilih = scan.nextInt();
            scan.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = scan.nextLine();
                    System.out.print("NIM: ");
                    String nim = scan.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = scan.nextLine();
                    Mahasiswa01 mhs = new Mahasiswa01(nama, nim, kelas);
                    stack.push01(mhs);
                    System.out.printf("Tugas %s berhasil dikumpulkan\n", mhs.nama);
                    break;
                case 2:
                    Mahasiswa01 dinilai = stack.pop01();
                    if (dinilai != null) {
                        System.out.println("Menilai tugas dari " + dinilai.nama);
                        System.out.print("Masukkan nilai (0-100): ");
                        int nilai = scan.nextInt();
                        dinilai.tugasDinilai01(nilai);
                        System.out.printf("Nilai Tugas %s adalah %d\n", dinilai.nama, nilai);
                    }
                    break;
                case 3:
                    Mahasiswa01 lihat = stack.peek01();
                    if (lihat != null) {
                        System.out.println("Tugas terakhir dikumpulkan oleh " + lihat.nama);
                    }
                    break;
                case 4:
                    Mahasiswa01 lihatBottom = stack.peekBottom01();
                    if (lihatBottom != null) {
                        System.out.println("Tugas pertama dikumpulkan oleh " + lihatBottom.nama);
                    }
                    break;
                case 5:
                    System.out.println("Daftar semua tugas");
                    System.out.println("Nama\tNIM\tKelas");
                    stack.print01();
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih >= 1 && pilih <= 4);

        scan.close();
    }
}
