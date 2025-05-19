package P12;

public class SingleLinkedList01 {
    NodeMahasiswa01 head;
    NodeMahasiswa01 tail;

    boolean isEmpty01(){
        return (head == null);
    }

    public void print01 (){
        if (!isEmpty01()) {
            NodeMahasiswa01 tmp = head;
            System.out.println("Isi Linked List:\t");
            while (tmp != null) {
                tmp.data.tampilkanInformasi();
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked list kosong");
        }
    }

    public void addFirst01(Mahasiswa01 input){
        NodeMahasiswa01 ndinput = new NodeMahasiswa01(input,null);
        if (isEmpty01()) {
            head = ndinput;
            tail = ndinput;
        } else {
            ndinput.next = head;
            head = ndinput;
        }
    }

    public void addLast01(Mahasiswa01 input){
        NodeMahasiswa01 ndInput = new NodeMahasiswa01(input, null);
        if (isEmpty01()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    public void insertAfter01(String key, Mahasiswa01 input){
        NodeMahasiswa01 ndInput = new NodeMahasiswa01(input, null);
        NodeMahasiswa01 temp = head;
        do {
            if (temp.data.nama.equalsIgnoreCase(key)) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                }
                break;
            }
            temp = temp.next;
        } while (temp != null);
    }

    public void inserAt01(int index, Mahasiswa01 input){
        if (index < 0) {
            System.out.println("indeks salah");
        } else if (index == 0) {
            addFirst01(input);
        } else {
            NodeMahasiswa01 temp = head;
            for (int i = 0; i < index-1; i++) {
                temp = temp.next;
            }
            temp.next = new NodeMahasiswa01(input, temp.next);
            if (temp.next.next == null) {
                tail = temp.next;
            }
        }
    }

    public void getData01(int index){
        NodeMahasiswa01 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        tmp.data.tampilkanInformasi();
    }

    public int indexOf01(String key){
        NodeMahasiswa01 tmp = head;
        int index = 0;
        while (tmp != null && !tmp.data.nama.equalsIgnoreCase(key)) {
            tmp = tmp.next;
            index++;
        }

        if (tmp == null) {
            return -1;            
        } else {
            return index;
        }
    }

    public void removeFirst01(){
        if (isEmpty01()) {
            System.out.println("Linked List masih kosong, tidak dapat dihapus!");
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
    }

    public void removeLast01(){
        if (isEmpty01()) {
            System.out.println("Linked List masih kosong, tidak dapat dihapus!");
        } else if (head == tail) {
            head = tail = null;
        } else {
            NodeMahasiswa01 temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }

    public void remove01(String key){
        if (isEmpty01()) {
            System.out.println("Linked List masih kosong, tidak dapat dihapus!");
        } else {
            NodeMahasiswa01 temp = head;
            while (temp != null) {
                if ((temp.data.nama.equalsIgnoreCase(key))&& (temp == head)) {
                    this.removeFirst01();
                    break;
                } else if (temp.data.nama.equalsIgnoreCase(key)) {
                    temp.next = temp.next.next;
                    if (temp.next == null) {
                        tail = temp;
                    }
                    break;
                }
                temp = temp.next;
            }
        }
    }

    public void removeAt01(int index){
        if (index == 0) {
            removeFirst01();
        } else {
            NodeMahasiswa01 temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if (temp.next == null) {
                tail = temp;
            }
    }
    }
}
