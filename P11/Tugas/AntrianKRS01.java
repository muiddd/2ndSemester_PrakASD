package P11.Tugas;

public class AntrianKRS01 {
    Mahasiswa01[] data;
    int front;
    int rear;
    int size;
    int max;
    int totalDiproses;
    int maxDiproses = 30;

    public AntrianKRS01(int max){
        this.max = max;
        this.data = new Mahasiswa01[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
        this.totalDiproses = 0;
    }

     public boolean isEmpty01(){
        return size == 0;
    }

    public boolean isFull01(){
        return size == max;
    }

    public void tambahAntrian01(Mahasiswa01 mhs){
        if (isFull01()) {
            System.out.println("Antrian penuh, tidak dapat menambah mahasiswa.");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " berhasil masuk ke antrian.");
    }

    public void prosesKRS01() {
        if (size < 2) {
            System.out.println("Belum cukup mahasiswa dalam antrian untuk diproses.");
        } else if (totalDiproses + 2 > maxDiproses) {
            System.out.println("Kuota maksimal proses KRS oleh DPA sudah tercapai.");
        } else {
            System.out.println("Memproses KRS untuk 2 mahasiswa:");
            for (int i = 0; i < 2; i++) {
                Mahasiswa01 mhs = layaniMahasiswa01();
                if (mhs != null) {
                    mhs.tampilkanData01();
                    totalDiproses++;
                }
            }
        }
    }

    public Mahasiswa01 layaniMahasiswa01(){
        if (isEmpty01()) {
            System.out.println("Antrian kosong.");
            return null;
        }
        Mahasiswa01 mhs = data[front];
        front = (front + 1) % max;
        size--;
        return mhs;
    }

    public void lihatDuaTerdepan01() {
    if (size < 2) {
        System.out.println("Antrian kurang dari 2, tidak bisa menampilkan 2 terdepan.");
    } else {
        System.out.println("2 Mahasiswa Terdepan:");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        data[front].tampilkanData01();
        data[(front + 1) % max].tampilkanData01();
    }
}

    public void lihatAkhir01(){
        if (isEmpty01()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Mahasiswa terakhir:");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[rear].tampilkanData01();
        }
    }

    public void tampilkanSemua01(){
        if (isEmpty01()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Daftar Mahasiswa dalam Antrian:");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData01();
        }
    }

    public int getJumlahAntrian01(){
        return size;
    }

    public int getJumlahSudahProses01(){
        return totalDiproses;
    }

    public int getJumlahBelumProses01(){
        return maxDiproses - totalDiproses;
    }

    public void kosongkanAntrian01() {
        front = 0;
        rear = -1;
        size = 0;
        System.out.println("Antrian telah dikosongkan.");
    }
}
