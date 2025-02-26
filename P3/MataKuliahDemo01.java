public class MataKuliahDemo01 {
    public static void main(String[] args) {
        MataKuliah01[] arrayOfMataKuliah = new MataKuliah01[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i+1));
            arrayOfMataKuliah[i] = new MataKuliah01();
            arrayOfMataKuliah[i].tambahData();
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Data Matakuliah ke-" + (i+1));
            arrayOfMataKuliah[i].cetakInfo();
        }
    }
}
