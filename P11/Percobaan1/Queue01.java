package P11.Percobaan1;

public class Queue01 {
    int[] data;
    int front;
    int rear;
    int size;
    int max;

    public Queue01(int n){
        max = n;
        data = new int[max];
        size = 0;
        front = rear = -1;
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

    public void peek01(){
        if (!isEmpty01()) {
            System.out.println("Elemen terdepan: " + data[front]);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void print01(){
        if (isEmpty01()) {
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.print(data[i] + " ");
                i = (i + 1) % max;
            }
            System.out.println(data[i] + " ");
            System.out.println("Jumlah elemen = " + size);
        }
    }

    public void clear01(){
        if (!isEmpty01()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void Enqueue01(int dt){
        if (isFull01()) {
            System.out.println("Queue sudah penuh");
        } else {
            if (isEmpty01()) {
                front = rear = 0;
            } else {
                if (rear == max -1) {
                    rear = 0;
                } else {
                    if (rear == max -1) {
                        rear = 0;
                    } else {
                        rear++;
                    }
                }
            }
            data[rear] = dt;
            size++;
        }
    }

    public int Dequeue01(){
        int dt = 0;
        if (isEmpty01()) {
            System.out.println("Queue masih kosong");
        } else {
            dt = data[front];
            size--;
            if (isEmpty01()) {
                front = rear = -1;
            } else {
                if (front == max -1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return dt;
    }

    public void menu01(){
        System.out.println("Masukkan operasi yang diinginkan:");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. Clear");
        System.out.println("--------------------");
    }
}
