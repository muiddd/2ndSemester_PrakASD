package P7;

public class DataDosen01 {
    Dosen01 [] dataDosen = new Dosen01[10];
    int idx = 0;

    void tambah(Dosen01 dsn){
        if (idx < dataDosen.length) {
            dataDosen[idx] = dsn;
            idx++;
        }
    }

    void tampil(){
        if (idx == 0) {
            System.out.println("Belum ada data dosen");
        } else {
            for (int i = 0; i < idx; i++) {
                System.out.println("Data Dosen ke-" +(i+1) +" : ");
                dataDosen[i].tampilInfo();
            }
        }
    }

    void sortingASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (dataDosen[j].usia > dataDosen[j + 1].usia) {
                    Dosen01 temp = dataDosen[j];
                    dataDosen[j] = dataDosen[j + 1];
                    dataDosen[j + 1] = temp;
                }
            }
        }
    }

    void sortingDSC() {
        for (int i = 0; i < idx - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < idx; j++) {
                if (dataDosen[j].usia > dataDosen[maxIdx].usia) {
                    maxIdx = j;
                }
            }
            Dosen01 temp = dataDosen[maxIdx];
            dataDosen[maxIdx] = dataDosen[i];
            dataDosen[i] = temp;
        }
    }

    void cariDataSequential(String nama){
        boolean temukan = false;
        int hitung = 0;
        for (int i = 0; i < idx; i++) {
            if (dataDosen[i].nama.equalsIgnoreCase(nama)){
                System.out.println("data dosen ditemukan: ");
                dataDosen[i].tampilInfo();
                temukan = true;
                hitung++;
            }
        }
        if (!temukan){
            System.out.println("data dosen tidak ditemukan");
        } else if (hitung > 1) {
            System.out.println("peringatan! ditemukan terdapat data dengan nama yang sama!");
        }
    }

    void cariDataBinary(int usia){
        sortingASC();
        int left=0, rigth = idx-1;
        boolean temukan = false;
        int hitung=0;

        while (left <= rigth) {
            int mid = left + (rigth-left)/2;
            if (dataDosen[mid].usia == usia){
                for (int i = mid; i >= 0 && dataDosen[i].usia == usia; i--) {
                    dataDosen[i].tampilInfo();
                    temukan = true;
                    hitung ++;
                }
                for (int i = mid+1; i < idx && dataDosen[i].usia == usia; i--) {
                    dataDosen[i].tampilInfo();
                    temukan = true;
                    hitung ++;
                }
                break;
            }
            if (dataDosen[mid].usia < usia) {
                left = mid + 1;
            } else {
                rigth = mid - 1;
            }
        }  
        if (!temukan){
            System.out.println("data dosen tidak ditemukan");
        } else if (hitung > 1) {
            System.out.println("peringatan! ditemukan lebih dari satu data dosen dengan usia " + usia);
        }
    }
}
