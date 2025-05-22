package P13.Tugas1;

public class DLLQVaksin01 {
    NodeVaksin01 front;
    int size;

    public DLLQVaksin01() {
        front = null;
        size = 0;
    }

    public boolean isEmpty01() {
        return front == null;
    }

    public void Enqueue01(DataVaksin01 item) {
        if (isEmpty01()) {
            front = new NodeVaksin01(null, item, null);
            size++;
        } else {
            NodeVaksin01 tmp = front;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            NodeVaksin01 newNode = new NodeVaksin01(tmp, item, null);
            tmp.next = newNode;
            size++;
        }
    }

    public void Dequeue01() {
        if (isEmpty01()) {
            System.out.println("Antrian masih kosong!");
        } else if (size == 1) {
            System.out.println(front.data.nama + " telah selesai divaksinasi");
            front = null;
            size--;
        } else {
            System.out.println(front.data.nama + " telah selesai divaksinasi");
            front = front.next;
            front.prev = null;
            size--;
        }
    }

    public void Print01() {
        if (!isEmpty01()) {
            NodeVaksin01 tmp = front;
            System.out.println("+++++++++++++++++++++++");
            System.out.println("Daftar Pengantri Vaksin");
            System.out.println("+++++++++++++++++++++++");
            System.out.println("|No.\t|nama\t|");
            while (tmp != null) {
                tmp.data.TampilData01();
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Antrian masih kosong!");
        }
        System.out.println("Sisa Antrian: " + size());
    }

    public int size() {
        return size;
    }
}
