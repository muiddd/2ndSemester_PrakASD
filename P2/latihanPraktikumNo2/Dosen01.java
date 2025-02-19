package latihanPraktikumNo2;

public class Dosen01 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    public Dosen01 (){        
    }

    public Dosen01 (String idDosen, String nama, boolean statusAktif, int tahunBergabung, String bidangKeahlian){
        this.idDosen = idDosen;
        this.nama = nama;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;
    }

    void tampilkanInformasi(){
        System.out.println("\nId Dosen       : " + idDosen);
        System.out.println("Nama dosen     : " + nama);
        System.out.println("Status aktif   : " + (statusAktif? "Aktif" : "Tidak aktif"));
        System.out.println("Tahun bergabung: " + tahunBergabung);
        System.out.println("Bidang keahlian: " + bidangKeahlian);
        hitungMasaKerja(tahunBergabung);
    }

    void setStatusAktif(boolean status){
        statusAktif = status;
    }

    void hitungMasaKerja(int thn){
        thn = 2025 - tahunBergabung;
        System.out.println("Lama kerja     : " + thn);
    }

    void ubahKeahlian(String keahlian){
        bidangKeahlian = keahlian;
    } 
}
