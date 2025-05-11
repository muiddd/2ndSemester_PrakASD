package P11.Percobaan2;

public class AntrianLayanan01 {
    Mahasiswa01[] data;
    int front;
    int rear;
    int size;
    int max;

    public AntrianLayanan01(int max){
        this.max = max;
        this.data = new Mahasiswa01[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public boolean isEmpty01(){
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull01(){
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void lihatTerdepan01(){
        if (isEmpty01()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.print("Mahasiswa terdepan: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[front].tampilkanData();
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
            data[index].tampilkanData();
        }
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

    public Mahasiswa01 layaniMahasiswa01(){
        if (isEmpty01()) {
            System.out.println("Antrian kosong.");
            return null;
        }
        Mahasiswa01 mhs = data[front];
        front = (front+1) % max;
        size--;
        return mhs;
    }

    public int getJumlahAntrian01(){
        return size;
    }
}
