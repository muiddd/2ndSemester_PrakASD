package P12.Tugas;

public class SLLQ01 {
    NodeMahasiswa01 front, rear;
    int size;

    public SLLQ01() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    public boolean isEmpty01() {
        return front == null;
    }

    public void Enqueue01(Mahasiswa01 input) {
        NodeMahasiswa01 ndInput = new NodeMahasiswa01(input, null);
        if (isEmpty01()) {
            front = ndInput;
            rear = ndInput;
        } else {
            rear.next = ndInput;
            rear = ndInput;
        }
        size++;
    }

    public void Dequeue01() {
        if (isEmpty01()) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.println("Memanggil antrian:");
            front.data.tampilkanInformasi();
            if (front == rear) {
                front = rear = null;
            } else {
                front = front.next;
            }
            size--;
        }
    }

    public void Print01() {
        if (isEmpty01()) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.println("Daftar Antrian: ");
            NodeMahasiswa01 temp = front;
            while (temp != null) {
                temp.data.tampilkanInformasi();
                temp = temp.next;
            }
        }
    }

    public void PeekFirst01() {
        if (isEmpty01()) {
            System.out.println("Antrian kosong!");
        } else {
            front.data.tampilkanInformasi();
        }
    }

    public void PeekLast01() {
        if (isEmpty01()) {
            System.out.println("Antrian kosong!");
        } else {
            rear.data.tampilkanInformasi();
        }
    }

    public void clear01() {
        if (isEmpty01()) {
            System.out.println("Antrian kosong!");
        } else {
            front = rear = null;
            size = 0;
            System.out.println("Antrian dikosongkan");
        }
    }

    public int jmlAntrian01() {
        return size;
    }
}