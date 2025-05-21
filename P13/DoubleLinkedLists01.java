package P13;

public class DoubleLinkedLists01 {
    Node01 head;
    int size;

    public DoubleLinkedLists01(){
        head = null;
        size = 0;
    }

    public boolean isEmpty01(){
        return head == null;
    }

    public void addFirst01(int item){
        if (isEmpty01()) {
            head = new Node01(null, item, null);
        } else {
            Node01 newNode = new Node01(null, item, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast01 (int item){
        if (isEmpty01()) {
            addFirst01(item);
        } else {
            Node01 current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node01 newNode = new Node01(current, item, null);
            current.next = newNode;
            size++;
        }
    }

    public void add01 (int item, int index) throws Exception{
        if (isEmpty01()) {
            addFirst01(item);
        } else if (index < 0 || index >size) {
            throw new Exception("Nilai indeks diluar batas");
        } else {
            Node01 current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.prev == null) {
                Node01 newNode = new Node01(null, item, current);
                current.prev = newNode;
                head = newNode;
            } else {
                Node01 newNode = new Node01(current.prev, item, current);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
    }

    public int size01 (){
        return size;
    }

    public void clear01(){
        head = null;
        size = 0;
    }

    public void print01(){
        if (!isEmpty01()) {
            Node01 tmp = head;
            while (tmp!=null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("\nberhasil diisi");
        } else {
            System.out.println("Linked List Kosong");
        }
    }
}
