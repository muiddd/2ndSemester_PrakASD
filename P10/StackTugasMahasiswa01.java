package P10;

public class StackTugasMahasiswa01 {
    Mahasiswa01[] stack;
    int top;
    int size;
    int totalTugas;

    public StackTugasMahasiswa01(int size){
        this.size = size;
        stack = new Mahasiswa01[size];
        top = -1;
        totalTugas = 0;
    }

    public boolean isFull01(){
        if (top == size -1){
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty01(){
        if (top == -1){
            return true;
        } else {
            return false;
        }
    }

    public void push01(Mahasiswa01 mhs){
        if (!isFull01()){
            top++;
            stack[top] = mhs;
            totalTugas++;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambah tugas lagi.");
        }
    }

    public Mahasiswa01 pop01(){
        if (!isEmpty01()) {
            Mahasiswa01 m = stack[top];
            top--;
            return m;
        } else {
            System.out.println("Stack kosong! Tidak ada tugas untuk dinilai.");
            return null;
        }
    }

    public Mahasiswa01 peek01(){
        if (!isEmpty01()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas untuk dikumpulkan");
            return null;
        }
    }

    public void print01(){
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
        }
        System.out.println("");
    }

    public Mahasiswa01 peekBottom01(){
        if (!isEmpty01()) {
            return stack[0];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas untuk dikumpulkan");
            return null;
        }
    }

    public int hitungTotalTugas01(){
        return totalTugas;
    }
}