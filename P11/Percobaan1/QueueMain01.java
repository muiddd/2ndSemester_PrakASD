package P11.Percobaan1;

import java.util.Scanner;
public class QueueMain01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan kapasitas queue: ");
        int n = sc.nextInt();
        Queue01 Q = new Queue01(n);
        int pilih;

        do {
            Q.menu01();
            pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("Masukkan data baru: ");
                    int dataMasuk = sc.nextInt();
                    if (Q.isFull01()) {
                        System.out.println("Queue Overflow! Program dihentikan.");
                        return;
                    }
                    Q.Enqueue01(dataMasuk);            
                    break;
                case 2:
                    if (Q.isEmpty01()) {
                        System.out.println("Queue Underflow! Program dihentikan.");
                        return;
                    }
                    int dataKeluar = Q.Dequeue01();
                    if (dataKeluar != 0) {
                        System.out.println("Data yang dikeluarkan: " + dataKeluar);
                    }
                    break;
                case 3:
                    Q.print01();
                    break;
                case 4:
                    Q.peek01();
                    break;
                case 5:
                    Q.clear01();
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5);
        sc.close();
    }
}