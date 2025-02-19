public class MataKuliahMain01 {
    public static void main(String[] args) {
        MataKuliah01 mk1 = new MataKuliah01();
        mk1.kodeMK = "ALSD";
        mk1.nama = "Algoritma Stuktur Data";
        mk1.sks = 3;
        mk1.jumlahJam = 6;

        mk1.tampilkanInformasi();
        mk1.ubahSks(4);

        MataKuliah01 mk2 = new MataKuliah01("SISOP", "Sistem informasi", 2, 4);
        mk2.tampilkanInformasi();
        mk2.kurangJam(6);

        MataKuliah01 mk3 = new MataKuliah01("BD", "Basis Data", 3, 2);
        mk3.tampilkanInformasi();
        mk3.tambahJam(4);
    }
}
