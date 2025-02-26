import java.util.Scanner;

public class MataKuliah01 {
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    public MataKuliah01(){

    }

    public MataKuliah01(String kode, String nama, int sks, int jumlahJam){
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    void tambahData(){
        Scanner sc = new Scanner(System.in);
            System.out.print("Kode         : ");
            kode = sc.nextLine();
            System.out.print("Nama         : ");
            nama = sc.nextLine(); 
            System.out.print("Sks          : ");
            String dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah jam   : ");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("---------------------------------");
    }
}
