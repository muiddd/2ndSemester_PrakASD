package P12;

public class SLLMain01 {
    public static void main(String[] args) {
        Mahasiswa01 mhs1 = new Mahasiswa01("24212200", "Alvaro", "1A", 4);
        Mahasiswa01 mhs2 = new Mahasiswa01("23212201", "Bimon", "2B", 3.8);
        Mahasiswa01 mhs3 = new Mahasiswa01("22212202", "Cintia", "3C", 3.5);
        Mahasiswa01 mhs4 = new Mahasiswa01("21212203", "Dirga", "4D", 3.6);

        SingleLinkedList01 sll = new SingleLinkedList01();

        sll.print01();
        sll.addFirst01(mhs4);
        sll.print01();
        sll.addLast01(mhs1);
        sll.print01();
        sll.insertAfter01("Dirga", mhs3);
        sll.inserAt01(2, mhs2);
        sll.print01();

        System.out.println("data index 1 : ");
        sll.getData01(1);

        System.out.println("data mahasiswa an Bimon berada pada index : "+sll.indexOf01("bimon"));
        System.out.println();

        sll.removeFirst01();
        sll.removeLast01();
        sll.print01();
        sll.removeAt01(0);
        sll.print01();
    }
}