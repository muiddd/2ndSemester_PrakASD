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
}
