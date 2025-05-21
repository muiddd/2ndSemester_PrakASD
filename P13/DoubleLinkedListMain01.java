package P13;

public class DoubleLinkedListMain01 {
    public static void main(String[] args) throws Exception {
        DoubleLinkedLists01 dll = new DoubleLinkedLists01();
        dll.print01();
        System.out.println("Size : " + dll.size);
        System.out.println("=============================");
        dll.addFirst01(3);
        dll.addLast01(4);
        dll.addFirst01(7);
        dll.print01();
        System.out.println("Size : " + dll.size);
        System.out.println("=============================");
        dll.add01(40, 1);
        dll.print01();
        System.out.println("Size : " + dll.size);
        System.out.println("=============================");
        dll.clear01();
        dll.print01();
        System.out.println("Size : " + dll.size);
        System.out.println("=============================");
        
        dll.addLast01(50);
        dll.addLast01(40);
        dll.addLast01(10);
        dll.addLast01(20);
        dll.print01();
        System.out.println("Size : " + dll.size);
        System.out.println("=============================");
        dll.removeFirst01();
        dll.print01();
        System.out.println("Size : " + dll.size);
        System.out.println("=============================");
        dll.removeLast01();
        dll.print01();
        System.out.println("Size : " + dll.size);
        System.out.println("=============================");
        dll.remove01(1);
        dll.print01();
        System.out.println("Size : " + dll.size);
    }
}
