package P11.Tugas;

public class Mahasiswa01 {
    String nim;
    String nama;
    String prodi;
    String kelas;

    public Mahasiswa01(String nim, String nama, String prodi, String kelas){
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.kelas = kelas;
    }

    public void tampilkanData01(){
        System.out.println(nim + " - " + nama + " - " + prodi + " - " + kelas);
    }
}
