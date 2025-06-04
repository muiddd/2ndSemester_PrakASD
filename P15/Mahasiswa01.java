package P15;

public class Mahasiswa01 {
    String nim;
    String nama;
    String kelas;
    Double ipk;

    public Mahasiswa01 (){
    }

    public Mahasiswa01 (String nim, String nama, String kelas, Double ipk){
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    public void tampilInformasi(){
        System.out.println("NIM: "+this.nim+" "+
        "Nama: "+this.nama+" "+
        "Kelas: "+this.kelas+" "+
        "IPK: "+this.ipk);
    }
}
