package P12;

public class Mahasiswa01 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    public Mahasiswa01(String nm, String name, String kls, double ip){
        this.nim = nm;
        this.nama = name;
        this.kelas = kls;
        this.ipk = ip;
    }

    public void tampilkanInformasi(){
        System.out.printf("%-10s %-10s %-5s %.1f\n", nama, nim, kelas, ipk);
    }
}
