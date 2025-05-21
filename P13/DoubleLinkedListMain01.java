package P13;

public class DoubleLinkedListMain01 {
    public static void main(String[] args) throws Exception {
        DoubleLinkedLists01 dll = new DoubleLinkedLists01();

        //percobaan1
        /*dll.print01();
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
        */
        
        //percobaan2
        /*dll.addLast01(50);
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
        */

        //percobaan3
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
        System.out.println("Data awal pada Linked List adalah: "+ dll.getFirst01());
        System.out.println("Data akhir pada Linked List adalah: "+ dll.getLast01());
        System.out.println("Data indeks ke-1 pada Linked List adalah: "+ dll.get01(1));
    }
}
