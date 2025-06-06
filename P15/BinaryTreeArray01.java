package P15;

public class BinaryTreeArray01 {
    Mahasiswa01 [] dataMahasiswa;
    int idxLast;

    public BinaryTreeArray01() {
        this.dataMahasiswa = new Mahasiswa01[10];
    }

    void populateData01(Mahasiswa01 dataMhs [], int idxLast) {
        this.dataMahasiswa = dataMhs;
        this.idxLast = idxLast;
    }

    void traverseInOrder01(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                traverseInOrder01((2*idxStart+1));
                dataMahasiswa[idxStart].tampilInformasi();
                traverseInOrder01((2*idxStart+2));
            }
        }
    }
}
