package P13.Tugas1;

public class DataVaksin01 {
    String nomor;
    String nama;

    public DataVaksin01 (String nmr, String nm){
        this.nomor = nmr;
        this.nama = nm;
    }

    public void TampilData01(){
        System.out.println("|" + nomor +"\t|" + nama + "\t|");
    }
}
