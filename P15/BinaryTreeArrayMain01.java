package P15;

public class BinaryTreeArrayMain01 {
    public static void main(String[] args) {
        BinaryTreeArray01 bta = new BinaryTreeArray01();

        bta.add01(new Mahasiswa01("244160121", "Ali", "A", 3.57));
        bta.add01(new Mahasiswa01("244160185", "Candra", "C", 3.41));
        bta.add01(new Mahasiswa01("244160221", "Badar", "B", 3.75));
        bta.add01(new Mahasiswa01("244160220", "Dewi", "B", 3.35));
        bta.add01(new Mahasiswa01("244160131", "Devi", "A", 3.48));
        bta.add01(new Mahasiswa01("244160205", "Ehsan", "D", 3.61));
        bta.add01(new Mahasiswa01("244160170", "Fizi", "B", 3.86));

        System.out.println("\nPreOrder Traversal Mahasiswa:");
        bta.traversePreOrder01(0); 
    }
}
