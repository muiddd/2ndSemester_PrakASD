package latihanPraktikumNo2;

public class DosenMain01 {
    public static void main(String[] args) {
        Dosen01 dsn1 = new Dosen01();        
        dsn1.idDosen = "022";
        dsn1.nama = "Bayu Fernandes S.Kom., M.Kom";
        dsn1.statusAktif = true;
        dsn1.tahunBergabung = 2015;
        dsn1.bidangKeahlian = "Graphic Designer";
        
        dsn1.tampilkanInformasi();
        dsn1.ubahKeahlian("UI UX");
        dsn1.tampilkanInformasi();

        Dosen01 dsn2 = new Dosen01("031", "Aldo Julianto S.T., M.T", false, 2003, "Game Developer");
        dsn2.tampilkanInformasi();

    }
}
