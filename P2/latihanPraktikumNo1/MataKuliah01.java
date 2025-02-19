public class MataKuliah01 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    public MataKuliah01(){        
    }

    public MataKuliah01(String kode, String nama, int sks, int jumlahJam){   
        kodeMK= kode;
        this.nama= nama;
        this.sks= sks;
        this.jumlahJam= jumlahJam;     
    }

    void tampilkanInformasi(){
        System.out.println("\nKode Mata Kuliah: " + kodeMK);
        System.out.println("Nama Mata Kuliah: " + nama);
        System.out.println("Sks: " + sks);
        System.out.println("Jumlah jam: " + jumlahJam);
    }

    void ubahSks(int sksBaru){
        sks = sksBaru;
        System.out.println("Sks telah diubah menjadi: " + sks);
    }

    void tambahJam(int jam){
        jumlahJam += jam;
        System.out.println("Jumlah jam setelah ditambah: " + jumlahJam);
    }

    void kurangJam(int jam){
        if (jumlahJam < jam){
            System.out.println("Jumlah jam tidak cukup untuk dikurangi");
        } else {
            jumlahJam -= jam;
            System.out.println("Jumlah jam setelah dikurangi: " + jumlahJam);
        }
    }
}
