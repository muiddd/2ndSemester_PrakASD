package Tugas;

import java.util.Scanner;

public class Dosen01 {
    String kode;
    String nama;
    boolean jenisKelamin;
    int usia;

    public Dosen01(){

    }

    public Dosen01(String kode,String nama,boolean jenisKelamin,int usia){
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }

    void tambahData(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Kode          : ");
        kode = sc.nextLine();
        System.out.print("Nama          : ");
        nama = sc.nextLine();
        System.out.print("Jenis Kelamin : ");
        String dummy = sc.nextLine();
        jenisKelamin = dummy.equalsIgnoreCase("Pria");
        System.out.print("Usia          : ");
        usia = sc.nextInt();
        sc.nextLine();
        System.out.println("------------------------------");
    }

    void cetakInfo(){
        System.out.println("Kode          : " + kode);
        System.out.println("Nama          : "+ nama);
        System.out.println("Jenis Kelamin : "+ (jenisKelamin?"Pria" : "Wanita"));
        System.out.println("Usia          : "+ usia);
    }
}