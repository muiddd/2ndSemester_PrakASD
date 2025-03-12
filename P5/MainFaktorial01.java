package P5;

import java.util.Scanner;

public class MainFaktorial01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai: ");
        int nilai = input.nextInt();

        Faktorial01 fk = new Faktorial01();
        System.out.println("Nilai faktorial "+ nilai + " menggunakan BF: "+ fk.faktoriaBF(nilai));
        System.out.println("Nilai faktorial "+ nilai + " menggunakan DC: "+ fk.faktorialDC(nilai));
        input.close();
}    
}

