package P10;

public class StackKonversi01 {
    int[] tumpukanBiner;
    int size;
    int top;

    public StackKonversi01(){
        this.size = 32;
        tumpukanBiner = new int[size];
        top = -1;
    }

    public boolean isEmpty01(){
        return top == -1;
    }

    public boolean isFull01(){
        return top == size-1;
    }

    public void push01(int data){
        if (isFull01()) {
            System.out.println("Stack penuh");
        } else {
            top++;
            tumpukanBiner[top]=data;
        }
    }

    public int pop01(){
        if (isEmpty01()) {
            System.out.println("Stack kosong");
            return -1;
        } else {
            int data = tumpukanBiner[top];
            top--;
            return data;
        }
    }
}
