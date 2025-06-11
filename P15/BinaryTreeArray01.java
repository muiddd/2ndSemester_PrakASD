package P15;

public class BinaryTreeArray01 {
    Mahasiswa01[] dataMahasiswa;
    int idxLast;

    public BinaryTreeArray01() {
        this.dataMahasiswa = new Mahasiswa01[10];
        idxLast = -1;
    }

    void populateData01(Mahasiswa01 dataMhs[], int idxLast) {
        this.dataMahasiswa = dataMhs;
        this.idxLast = idxLast;
    }

    void traverseInOrder01(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                traverseInOrder01((2 * idxStart + 1));
                dataMahasiswa[idxStart].tampilInformasi();
                traverseInOrder01((2 * idxStart + 2));
            }
        }
    }

    public void add01(Mahasiswa01 data) {
        if (idxLast == dataMahasiswa.length - 1) {
            System.out.println("Tree sudah penuh!");
            return;
        }
        idxLast++;
        dataMahasiswa[idxLast] = data;
    }

    public void traversePreOrder01() {
        traversePreOrder01(0);
    }

    void traversePreOrder01(int idx) {
        if (idx > idxLast || dataMahasiswa[idx] == null) {
            return;
        }
        dataMahasiswa[idx].tampilInformasi();
        traversePreOrder01(2 * idx + 1);
        traversePreOrder01(2 * idx + 2);
    }
}
