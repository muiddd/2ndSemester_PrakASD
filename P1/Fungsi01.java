public class Fungsi01 {    
    static int[][] stok = {
        {10, 5, 15, 7},  
        {6, 11, 9, 12},   
        {2, 10, 10, 5},   
        {5, 7, 12, 9}     
    };
    static int[] harga = {75000, 50000, 60000, 10000};
    static String[] bunga = {"Aglonema", "Keladi", "Alocasia", "Mawar"};
    static int[] stokMati = {-1, -2, 0, -5};

    public static void tampilPendapatan() {
        System.out.println("Pendapatan Setiap Cabang Ketika Semua Bunga Terjual Habis:");
        for (int i = 0; i < stok.length; i++) {
            int totalPendapatan = 0;
            for (int j = 0; j < stok[i].length; j++) {
                totalPendapatan += stok[i][j] * harga[j];
            }
            System.out.println("RoyalGarden " + (i + 1) + ": Rp " + totalPendapatan);
        }
        System.out.println();
    }    

    public static void kurangiStok() {
        System.out.println("Stok RoyalGarden 4 Setelah Dikurangi Karena Bunga Mati:");
        for (int j = 0; j < stok[3].length; j++) {
            stok[3][j] += stokMati[j];
            System.out.print(bunga[j] + " = " + stok[3][j] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        tampilPendapatan();
        kurangiStok();
    }
}
