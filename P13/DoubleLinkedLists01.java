package P13;

public class DoubleLinkedLists01 {
    Node01 head;
    int size;

    public DoubleLinkedLists01() {
        head = null;
        size = 0;
    }

    public boolean isEmpty01() {
        return head == null;
    }

    public void addFirst01(int item) {
        if (isEmpty01()) {
            head = new Node01(null, item, null);
        } else {
            Node01 newNode = new Node01(null, item, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast01(int item) {
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

    public void add01(int item, int index) throws Exception {
        if (isEmpty01()) {
            addFirst01(item);
        } else if (index < 0 || index > size) {
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

    public int size01() {
        return size;
    }

    public void clear01() {
        head = null;
        size = 0;
    }

    public void print01() {
        if (!isEmpty01()) {
            Node01 tmp = head;
            while (tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("\nberhasil diisi");
        } else {
            System.out.println("Linked List Kosong");
        }
    }

    public void removeFirst01() throws Exception {
        if (isEmpty01()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
        } else if (size == 1) {
            removeFirst01();
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public void removeLast01() throws Exception {
        if (isEmpty01()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
        } else if (head.next == null) {
            head = null;
            size--;
            return;
        }
        Node01 current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }

    public void remove01(int index) throws Exception {
        if (isEmpty01() || index >= size) {
            throw new Exception("Nilai indeks diluar batas");
        } else if (index == 0) {
            removeFirst01();
        } else {
            Node01 current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.next == null) {
                current.prev.next = null;
            } else if (current.prev == null) {
                current = current.next;
                current.prev = null;
                head = current;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            size--;
        }
    }

    public int getFirst01() throws Exception {
        if (isEmpty01()) {
            throw new Exception("Linked List kosong");
        }
        return head.data;
    }

    public int getLast01() throws Exception {
        if (isEmpty01()) {
            throw new Exception("Linked List kosong");
        }
        Node01 tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public int get01(int index) throws Exception {
        if (isEmpty01()|| index >= size) {
            throw new Exception("Nilai indeks diluar batas.");
        }
        Node01 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }
}
