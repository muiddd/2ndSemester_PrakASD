package P10;

public class StackSurat01 {
    Surat01[] stack;
    int size;
    int top;

    public StackSurat01(int size){
        this.size = size;
        stack = new Surat01[size];
        top = -1;
    }

    public boolean isFull01() {
        return top == size - 1;
    }

    public boolean isEmpty01() {
        return top == -1;
    }

    public void push01(Surat01 surat) {
        if (!isFull01()) {
            stack[++top] = surat;
            System.out.println("Surat berhasil ditambahkan.");
        } else {
            System.out.println("Stack penuh! Tidak bisa menambah surat.");
        }
    }

    public Surat01 pop01() {
        if (!isEmpty01()) {
            return stack[top--];
        } else {
            System.out.println("Stack kosong! Tidak ada surat untuk diproses.");
            return null;
        }
    }

    public Surat01 peek01() {
        if (!isEmpty01()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada surat.");
            return null;
        }
    }

    public void print01() {
        if (!isEmpty01()) {
            System.out.println("Daftar semua surat:");
            for (int i = top; i >= 0; i--) {
                stack[i].tampil01();
                System.out.println();
            }
        } else {
            System.out.println("Stack kosong! Tidak ada surat.");
        }
    }

    public Surat01 cariSurat01(String nama) {
        for (int i = 0; i <= top; i++) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                stack[i].tampil01();
            } else {
                System.out.println("Data tidak ditemukan");
            }
        }
        return null;
    }
}
