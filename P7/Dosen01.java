package P7;

public class Dosen01 {
    String kode;
    String nama;
    Boolean jenisKelamin;
    int usia;

    Dosen01(String kd, String nm, Boolean jk, int age) {
        kode = kd;
        nama = nm;
        jenisKelamin = jk;
        usia = age;
    }

    void tampilInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Kode: " + kode);     
        System.out.println("Jenis Kelamin: " + (jenisKelamin ? "Laki-laki" : "Perempuan"));
        System.out.println("Usia: " + usia);
    }
}
