package P15;

public class BinaryTreeMain01 {
    public static void main(String[] args) {
        BinaryTree01 bst = new BinaryTree01();

        bst.addRekursif01(new Mahasiswa01("244160121", "Ali", "A", 3.57));
        bst.addRekursif01(new Mahasiswa01("244160221", "Badar", "B", 3.85));
        bst.addRekursif01(new Mahasiswa01("244160185", "Candra", "C", 3.21));
        bst.addRekursif01(new Mahasiswa01("244160220", "Dewi", "B", 3.54));

        System.out.println("\nDaftar semua mahasiswa (in order traversal):");
        bst.traverseInOrder01(bst.root);

        System.out.println("\nPencarian Data mahasiswa:");
        System.out.print("Cari mahasiswa dengan ipk: 3.54 : ");
        String hasilCari = bst.find01(3.54) ? "Ditemukan" : "Tidak ditemukan";
        System.out.println(hasilCari);

        System.out.print("Cari mahasiswa dengan ipk: 3.22 : ");
        hasilCari = bst.find01(3.22) ? "Ditemukan" : "Tidak ditemukan";
        System.out.println(hasilCari);

        bst.addRekursif01(new Mahasiswa01("244160131", "Devi", "A", 3.72));
        bst.addRekursif01(new Mahasiswa01("244160205", "Ehsan", "D", 3.37));
        bst.addRekursif01(new Mahasiswa01("244160170", "Fizi", "B", 3.46));
        System.out.println("\nDaftar semua mahasiswa setelah penambahan 3 mahasiswa:");
        System.out.println("\nInOrder Traversal:");
        bst.traverseInOrder01(bst.root);
        System.out.println("\nPreOrder Traversal:");
        bst.traversePreOrder01(bst.root);
        System.out.println("\nPostOrder Traversal:");
        bst.traversePostOrder01(bst.root);

        System.out.println("\nPenghapusan data mahasiswa");
        bst.delete01(3.57);
        System.out.println("\nDaftar semua mahasiswa setelah penghapusan 1 mahasiswa (in order traversal):");
        bst.traverseInOrder01(bst.root);

        System.out.println("\nMahasiswa dengan IPK minimum:");
        Mahasiswa01 mhsMin = bst.cariMinIPK();
        if (mhsMin != null) {
            mhsMin.tampilInformasi();
        } else {
            System.out.println("Data kosong.");
        }

        System.out.println("\nMahasiswa dengan IPK maksimum:");
        Mahasiswa01 mhsMax = bst.cariMaxIPK();
        if (mhsMax != null) {
            mhsMax.tampilInformasi();
        } else {
            System.out.println("Data kosong.");
        }

        System.out.println("\nMahasiswa dengan IPK di atas 3.50:");
        bst.tampilMhsdiatasIPK(3.50);
    }
}
