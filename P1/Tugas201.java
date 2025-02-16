import java.util.Scanner;
public class Tugas201 {
    public static double hitungVolume(double sisi) {
        return sisi * sisi * sisi;
    }
    
    public static double hitungLuasPermukaan(double sisi) {
        return 6 * (sisi * sisi);
    }
    
    public static double hitungKeliling(double sisi) {
        return 12 * sisi;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.println("Rumus Perhitungan Kubus:");
            System.out.println("1. Volume");
            System.out.println("2. Luas Permukaan");
            System.out.println("3. Keliling");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");
            
            int pilihan = sc.nextInt();
            if (pilihan == 4) {
                System.out.println("Terima kasih!");
                break;
            }

            if (pilihan < 1 || pilihan > 4) {
                System.out.println("Pilihan menu tidak valid!");
                continue;
            }            
            
            System.out.print("Masukkan panjang sisi kubus: ");
            double sisi = sc.nextDouble();
            
            switch (pilihan) {
                case 1:
                    System.out.println("Volume kubus: " + hitungVolume(sisi));
                    break;
                case 2:
                    System.out.println("Luas permukaan kubus: " + hitungLuasPermukaan(sisi));
                    break;
                case 3:
                    System.out.println("Keliling kubus: " + hitungKeliling(sisi));
                    break;
            }
        }
        
        sc.close();
    }
}
