package P5;

public class Tugas01 {
    String nama;
    String nim;
    int tahunMasuk;
    int nilaiUTS;
    int nilaiUAS;

    public Tugas01(String nama, String nim, int tahunMasuk, int nilaiUTS, int nilaiUAS) {
        this.nama = nama;
        this.nim = nim;
        this.tahunMasuk = tahunMasuk;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }

    public static int maxUTSDC(Tugas01[] arr, int l, int r) {
        if (l == r) {
            return arr[l].nilaiUTS;
        }
        int mid = (l + r) / 2;
        int lMax = maxUTSDC(arr, l, mid);
        int rMax = maxUTSDC(arr, mid + 1, r);

        if (lMax > rMax) {
            return lMax;
        } else {
            return rMax;
        }        
    }

    public static int minUTSDC(Tugas01[] arr, int l, int r) {
        if (l == r) {
            return arr[l].nilaiUTS;
        }
        int mid = (l + r) / 2;
        int lMin = minUTSDC(arr, l, mid);
        int rMin = minUTSDC(arr, mid + 1, r);
        
        if (lMin < rMin) {
            return lMin;
        } else {
            return rMin;
        }
    }

    public static double rataRataUASBF(Tugas01[] arr) {
        int total = 0;
        for (Tugas01 mhs : arr) {
            total += mhs.nilaiUAS;
        }
        return (double) total / arr.length;
    }
}

