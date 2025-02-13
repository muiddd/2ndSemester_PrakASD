import java.util.Scanner;
public class Pemilihan01{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        double nilaiTugas,nilaiKuis,nilaiUts,nilaiUas,nilaiAkhir;

        System.out.println("Program menghitung nilai akhir");
        System.out.println("==============================");
        System.out.print("Masukkan nilai tugas: ");
        nilaiTugas= sc.nextDouble();
        System.out.print("Masukkan nilai kuis: ");
        nilaiKuis= sc.nextDouble();
        System.out.print("Masukkan nilai UTS: ");
        nilaiUts= sc.nextDouble();
        System.out.print("Masukkan nilai UAS: ");
        nilaiUas= sc.nextDouble();
        System.out.println("==============================");
        System.out.println("==============================");

        if (nilaiTugas < 0 || nilaiTugas > 100 || nilaiKuis < 0 || nilaiKuis > 100 || nilaiUts < 0 || nilaiUts > 100 || nilaiUas < 0 || nilaiUas > 100) {
            System.out.println("Nilai tidak valid!");
            System.out.println("==============================");
            System.out.println("==============================");
            sc.close();
            return;
        }
        
        nilaiAkhir = (nilaiTugas*0.2)+(nilaiKuis*0.2)+(nilaiUts*0.3)+(nilaiUas*0.4);
        System.out.println("Nilai akhir :" + nilaiAkhir);

        if (nilaiAkhir > 80){
            System.out.println("Nilai huruf : A");
        } else if (nilaiAkhir > 73 && nilaiAkhir <= 80){
            System.out.println("Nilai huruf : B+");
        } else if (nilaiAkhir > 65 && nilaiAkhir <= 73){
            System.out.println("Nilai huruf : B");
        } else if (nilaiAkhir > 60 && nilaiAkhir <= 65){
            System.out.println("Nilai huruf : C+");
        } else if (nilaiAkhir > 50 && nilaiAkhir <= 60){
            System.out.println("Nilai huruf : C");
        } else if (nilaiAkhir > 39 && nilaiAkhir <= 50){
            System.out.println("Nilai huruf : D");
        } else if (nilaiAkhir <= 39){
            System.out.println("Nilai huruf : E");
        }

        System.out.println("==============================");
        System.out.println("==============================");

        if (nilaiAkhir <= 100 && nilaiAkhir > 50) { 
            System.out.println("SELAMAT ANDA LULUS");
        } else if (nilaiAkhir <= 50 && nilaiAkhir>0) {
            System.out.println("ANDA TIDAK LULUS TETAP SEMANGAT");
        }

        sc.close();
    }
}