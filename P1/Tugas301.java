import java.util.Scanner;
public class Tugas301 {    
    public static void tampilkanSeluruhJadwal(String[] namaMK, int[] sks, int[] semester, String[] hariKuliah) {
        System.out.println("\nJadwal Kuliah:");
        for (int i = 0; i < namaMK.length; i++) {
            System.out.println("Nama mata kuliah: " + namaMK[i] + ", SKS: " + sks[i] + ", Semester: " + semester[i] + ", Hari: " + hariKuliah[i]);
        }
    }

    public static void tampilkanJadwalBerdasarkanHari(String[] namaMK, int[] sks, int[] semester, String[] hariKuliah) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nMasukkan hari: ");
        String hari = sc.nextLine();
        for (int i = 0; i < namaMK.length; i++) {
            if (hariKuliah[i].equalsIgnoreCase(hari)) {
                System.out.println("Jadwal Kuliah Hari " + hari + ":");
                System.out.println("Nama mata kuliah: " + namaMK[i] + ", SKS: " + sks[i] + ", Semester: " + semester[i]);
                return;
            } else {
                System.out.println("Jadwal Kuliah Hari " + hari + " tidak ada." );
                return;
            }
        }
    }

    public static void tampilkanJadwalBerdasarkanSemester(String[] namaMK, int[] sks, int[] semester, String[] hariKuliah) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nMasukkan semester: ");
        int sem = sc.nextInt();
        for (int i = 0; i < namaMK.length; i++) {
            if (semester[i] == sem) {
                System.out.println("Jadwal Kuliah Semester " + sem + ":");
                System.out.println("Nama mata kuliah: " + namaMK[i] + ", SKS: " + sks[i] + ", Hari: " + hariKuliah[i]);
                return;
            } else {
                System.out.println("Jadwal Kuliah Semester " + sem + " tidak ada.");
                return;
            }
        }
    }

    public static void cariMatkul(String[] namaMK, int[] sks, int[] semester, String[] hariKuliah) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nama mata kuliah yang dicari: ");
        String nama = sc.nextLine();

        for (int i = 0; i < namaMK.length; i++) {
            if (namaMK[i].equalsIgnoreCase(nama)) {
                System.out.println("\nData Mata Kuliah:");
                System.out.println("Nama mata kuliah: " + namaMK[i] + ", SKS: " + sks[i] + ", Semester: " + semester[i] + ", Hari: " + hariKuliah[i]);
                return;
            } else {
                System.out.println("Mata kuliah tidak ditemukan.");
                return;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jmlMK = sc.nextInt();

        String[] namaMK = new String[jmlMK];
        int[] sks = new int[jmlMK];
        int[] semester = new int[jmlMK];
        String[] hariKuliah = new String[jmlMK];

        for (int i = 0; i < jmlMK; i++) {
            System.out.println("\nMasukkan data mata kuliah ke-" + (i + 1));
            System.out.print("Semester: ");
            semester[i] = sc.nextInt();
            sc.nextLine();
            System.out.print("Nama Mata Kuliah: ");
            namaMK[i] = sc.nextLine();
            System.out.print("Jumlah SKS: ");
            sks[i] = sc.nextInt();
            sc.nextLine();
            System.out.print("Hari Kuliah: ");
            hariKuliah[i] = sc.nextLine();
        }

        while (true) {
            System.out.println("\nMenu");
            System.out.println("1. Tampilkan seluruh jadwal kuliah");
            System.out.println("2. Tampilkan berdasarkan hari");
            System.out.println("3. Tampilkan berdasarkan semester");
            System.out.println("4. Cari mata kuliah");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");
            int pilihan = sc.nextInt();
            
            switch (pilihan) {
                case 1:
                    tampilkanSeluruhJadwal(namaMK, sks, semester, hariKuliah);
                    break;
                case 2:
                    tampilkanJadwalBerdasarkanHari(namaMK, sks, semester, hariKuliah);
                    break;
                case 3:
                    tampilkanJadwalBerdasarkanSemester(namaMK, sks, semester, hariKuliah);
                    break;
                case 4:
                    cariMatkul(namaMK, sks, semester, hariKuliah);
                    break;
                case 5:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan menu tidak valid!");

            }
        }
    }
}
