import java.util.Scanner;
public class Array01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String matkul[]= {
            "Pancasila", 
            "Konsep Teknologi Informasi", 
            "Critical Thinking dan Problem Solving", 
            "Matermatika Dasar", 
            "Bahasa Inggris", 
            "Dasar Pemrograman", 
            "Praktikum Dasar Pemrograman", 
            "Keselamatan dan Kesehatan Kerja"
        };

        int sks[]= {2,2,2,3,2,2,3,2};
        int nilaiAngka[] = new int[matkul.length]; 
        String nilaiHuruf[] = new String[matkul.length];
        double bobotNilai[] = new double[matkul.length];

        System.out.println("=====================================");
        System.out.println("Program menghitung IP semester");
        System.out.println("=====================================");

        double totalBobotNilai = 0;
        int totalSKS = 0;
        int nilaimatkul;

        for (int i = 0; i < matkul.length; i++) {
            System.out.print ("Masukkan nilai angka untuk MK " + matkul [i] + " : ");
            nilaimatkul = sc.nextInt();

            if ((nilaimatkul > 80) && (nilaimatkul <= 100)) {
                nilaiHuruf[i] = "A";
                bobotNilai[i] = 4;
            } else if ((nilaimatkul > 73) && (nilaimatkul <= 80)) {
                nilaiHuruf[i] = "B+";
                bobotNilai[i] = 3.5;
            } else if ((nilaimatkul > 65) && (nilaimatkul <= 73)) {
                nilaiHuruf[i] = "B";
                bobotNilai[i] = 3;
            } else if ((nilaimatkul > 60) && (nilaimatkul <= 65)) {
                nilaiHuruf[i] = "C+";
                bobotNilai[i] = 2.5;
            } else if ((nilaimatkul > 50) && (nilaimatkul <= 60)) {
                nilaiHuruf[i] = "C";
                bobotNilai[i] = 2;
            } else if ((nilaimatkul > 39) && (nilaimatkul <=50)) {
                nilaiHuruf[i] = "D";
                bobotNilai[i] = 1;
            } else if (nilaimatkul <= 39) {
                nilaiHuruf[i] = "E";
                bobotNilai[i] = 0;
            } 
        
        nilaiAngka[i]=nilaimatkul; 
        totalBobotNilai += bobotNilai[i] * sks[i];
        totalSKS += sks[i];   
         
        }

        double ipSemester = totalBobotNilai / totalSKS;

        System.out.println("=====================================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("=====================================");
        System.out.printf("%-40s %-15s %-15s %-15s\n", "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");

        for (int i = 0; i < matkul.length; i++) {
            System.out.printf("%-40s %-15s %-15s %-15s\n", matkul[i], nilaiAngka[i], nilaiHuruf[i], bobotNilai[i]);
        }

        System.out.println("=====================================");
        System.out.println("IP Semester Anda: " + ipSemester);
        System.out.println("=====================================");

        sc.close();
    }
}
