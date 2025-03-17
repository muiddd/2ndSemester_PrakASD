package P5;

public class MainTugas01 {
    public static void main(String[] args) {
        Tugas01[] mhs = {
            new Tugas01("Ahmad", "220101001", 2022, 78, 82),
            new Tugas01("Budi", "220101002", 2022, 85, 88),
            new Tugas01("Cindy", "220101003", 2021, 90, 87),
            new Tugas01("Dian", "220101004", 2021, 76, 79),
            new Tugas01("Eko", "220101005", 2020, 92, 95),
            new Tugas01("Fajar", "220101006", 2023, 88, 85),
            new Tugas01("Gina", "220101007", 2023, 80, 83),
            new Tugas01("Hadi", "220101008", 2020, 82, 84)
        };

        int maxUTSDC = Tugas01.maxUTSDC(mhs, 0, mhs.length - 1);
        int minUTSDC = Tugas01.minUTSDC(mhs, 0, mhs.length - 1);
        double rataUAS = Tugas01.rataRataUASBF(mhs);

        System.out.println("Nilai UTS Tertinggi : " + maxUTSDC);
        System.out.println("Nilai UTS Terendah : " + minUTSDC);
        System.out.println("Rata-rata Nilai UAS : " + rataUAS);
    }
}
