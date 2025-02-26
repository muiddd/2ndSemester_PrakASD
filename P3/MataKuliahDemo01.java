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
            System.out.println("Kode         : "+ arrayOfMataKuliah[i].kode);
            System.out.println("Nama         : "+ arrayOfMataKuliah[i].nama);
            System.out.println("Sks          : "+ arrayOfMataKuliah[i].sks);
            System.out.println("Jumlah jam   : "+ arrayOfMataKuliah[i].jumlahJam);
            System.out.println("----------------------------------");
        }
    }
}
