import java.util.Scanner;

public class MataKuliahDemo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah Matakuliah : ");
        int jml = sc.nextInt();
        MataKuliah01[] arrayOfMataKuliah = new MataKuliah01[jml];

        for (int i = 0; i < arrayOfMataKuliah.length; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i+1));
            arrayOfMataKuliah[i] = new MataKuliah01();
            arrayOfMataKuliah[i].tambahData();
        }

        for (int i = 0; i < arrayOfMataKuliah.length; i++) {
            System.out.println("Data Matakuliah ke-" + (i+1));
            arrayOfMataKuliah[i].cetakInfo();
        }

        sc.close();
    }
}
