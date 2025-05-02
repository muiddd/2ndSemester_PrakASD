package P10;

public class Surat01 {
    String idSurat;
    String namaMahasiswa;
    String kelas;
    char jenisIzin;
    int durasi;

    public Surat01 (){

    }

    public Surat01 (String idsSurat, String namaMahasiswa, String kelas, char jenisIzin, int durasi){
        this.idSurat= idsSurat;
        this.namaMahasiswa= namaMahasiswa;
        this.kelas= kelas;
        this.jenisIzin= jenisIzin;
        this.durasi= durasi;
    }

    public void tampil01() {
        System.out.println("ID Surat     : " + idSurat);
        System.out.println("Nama         : " + namaMahasiswa);
        System.out.println("Kelas        : " + kelas);
        System.out.println("Jenis Izin   : " + (jenisIzin == 'S' ? "Sakit" : "Izin Keperluan"));
        System.out.println("Durasi       : " + durasi + " hari");
    }
}
