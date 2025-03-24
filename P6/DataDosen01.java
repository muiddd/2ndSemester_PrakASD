package P6;

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
}
