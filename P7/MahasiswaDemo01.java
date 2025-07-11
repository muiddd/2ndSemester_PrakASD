package P7;

import java.util.Scanner;

public class MahasiswaDemo01 {
    public static void main(String[] args) {        
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumMhs = sc.nextInt();
        sc.nextLine();
        MahasiswaBerprestasi01 list = new MahasiswaBerprestasi01(jumMhs);
    
        for (int i = 0; i < jumMhs; i++) {
            System.out.println("Masukkan data mahasiswa ke-"+ (i+1));
            System.out.print("NIM: ");
            String nim = sc.nextLine();
            System.out.print("Nama: ");
            String nama = sc.nextLine();
            System.out.print("Kelas: ");
            String kelas = sc.nextLine();
            System.out.print("IPK: ");
            String ip = sc.nextLine();
            double ipk = Double.parseDouble(ip);
            System.out.println("-----------------------------");
            list.tambah(new Mahasiswa01(nim,nama,kelas,ipk));
        }
        
        list.tampil();
        //melakukan pencarian data sequential
        System.out.println("---------------------------------------------------");
        System.out.println("Pencarian data");
        System.out.println("---------------------------------------------------");
        System.out.println("Masukkan ipk mahasiswa yang ingin dicari:");
        System.out.print("IPK: ");
        double cari = sc.nextDouble();

        System.out.println("menggunakan sequential searching");
        double posisi = list.sequentialSearching(cari);
        int pss= (int)posisi;
        list.tampilPosisi(cari, pss);
        list.tampilDataSearch(cari, pss);

        //melakukan pencarian data binary
        System.out.println("---------------------------------------------------");
        System.out.println("Pencarian data");
        System.out.println("---------------------------------------------------");
        System.out.println("Masukkan ipk mahasiswa yang ingin dicari:");
        System.out.print("IPK: ");
        cari = sc.nextDouble();

        System.out.println("menggunakan binary searching");
        double posisi2 = list.findBinarySearch(cari, 0, jumMhs-1);
        int pss2= (int)posisi2;
        list.tampilPosisi(cari, pss2);
        list.tampilDataSearch(cari, pss2);

        sc.close();
    }
}
