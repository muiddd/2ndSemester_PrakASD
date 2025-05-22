package P13.Tugas2;

public class DLLFilm01 {
    NodeFilm01 head;
    int size;

    public boolean isEmpty01() {
        return head == null;
    }

    public void addFirst01(Film01 item) {
        if (isEmpty01()) {
            head = new NodeFilm01(null, item, null);
        } else {
            NodeFilm01 ndInput = new NodeFilm01(null, item, head);
            head.prev = ndInput;
            head = ndInput;
        }
        size++;
    }

    public void addLast01(Film01 item) {
        if (isEmpty01()) {
            addFirst01(item);
        } else {
            NodeFilm01 tmp = head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            NodeFilm01 newNode = new NodeFilm01(tmp, item, null);
            tmp.next = newNode;
            size++;
        }
    }

    public void add01(Film01 item, int index) {
        if (isEmpty01()) {
            addFirst01(item);
        } else if (index < 0 || index > size) {
            System.out.println("Nilai indeks diluar batas");
            return;
        } else {
            NodeFilm01 tmp = head;
            for (int i = 0; i < index; i++) {
                tmp = tmp.next;
            }
            if (tmp == null) {
                addLast01(item);
            } else {
                NodeFilm01 newNode = new NodeFilm01(tmp.prev, item, tmp);
                if (tmp.prev != null) {
                    tmp.prev.next = newNode;
                }
                tmp.prev = newNode;
                size++;
            }
        }
        size++;
    }

    public int size01() {
        return size;
    }

    public void removeFirst01() {
        if (isEmpty01()) {
            System.out.println("List masih kosong, tidak bisa dihapus!");
        } else if (head.next == null) {
            head = null;
            size--;
            System.out.println("Data pertama berhasil dihapus.");
        } else {
            head = head.next;
            head.prev = null;
            size--;
            System.out.println("Data pertama berhasil dihapus.");
        }
    }

    public void removeLast01() {
        if (isEmpty01()) {
            System.out.println("List masih kosong, tidak bisa dihapus!");
        } else if (head.next == null) {
            head = null;
            size--;
            System.out.println("Data terakhir berhasil dihapus.");
        } else {
            NodeFilm01 tmp = head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.prev.next = null;
            size--;
            System.out.println("Data terakhir berhasil dihapus.");
        }
    }

    public void remove01(int index) {
        if (isEmpty01() || index < 0 || index >= size) {
            System.out.println("Nilai indeks di luar batas");
        } else if (index == 0) {
            removeFirst01();
        } else if (index == size - 1) {
            removeLast01();
        } else {
            NodeFilm01 tmp = head;
            for (int i = 0; i < index; i++) {
                tmp = tmp.next;
            }

            tmp.prev.next = tmp.next;
            tmp.next.prev = tmp.prev;
            size--;

            System.out.println("Data pada index ke-" + index + " berhasil dihapus.");
        }
    }

    public void print01() {
        if (!isEmpty01()) {
            System.out.println("Cetak Data");
            NodeFilm01 tmp = head;
            while (tmp != null) {
                tmp.data.tampilInformasi01();
                System.out.println("---------------------");
                tmp = tmp.next;
            }
        } else {
            System.out.println("Linked List Kosong");
        }
    }

    public void searching01(String id) {
        if (isEmpty01()) {
            System.out.println("Linked list kosong");
            return;
        }

        NodeFilm01 tmp = head;
        int index = 0;
        boolean ditemukan = false;

        while (tmp != null) {
            if (tmp.data.id.equals(id)) {
                System.out.println("Data ID Film: " + id + " berada di node ke- " + (index + 1));
                System.out.println("IDENTITAS:");
                System.out.println("ID Film   : " + tmp.data.id);
                System.out.println("Judul Film: " + tmp.data.judul);
                System.out.println("IMDB Rating: " + tmp.data.rating);
                ditemukan = true;
                break;
            }
            tmp = tmp.next;
            index++;
        }

        if (!ditemukan) {
            System.out.println("Data dengan ID " + id + " tidak ditemukan.");
        }
    }

    public void sorting01() {
        if (isEmpty01() || head.next == null)
            return;

        for (NodeFilm01 i = head; i != null; i = i.next) {
            NodeFilm01 max = i;
            for (NodeFilm01 j = i.next; j != null; j = j.next) {
                if (j.data.rating > max.data.rating) {
                    max = j;
                }
            }
            if (max != i) {
                Film01 temp = i.data;
                i.data = max.data;
                max.data = temp;
            }
        }
        System.out.println("Data berhasil diurutkan berdasarkan rating (desc).");
    }
}
