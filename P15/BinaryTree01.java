package P15;

public class BinaryTree01 {
    Node01 root;

    public BinaryTree01() {
        root = null;
    }

    public boolean isEmpty01() {
        return root == null;
    }

    public void add01(Mahasiswa01 mahasiswa) {
        Node01 newNode = new Node01(mahasiswa);
        if (isEmpty01()) {
            root = newNode;
        } else {
            Node01 current = root;
            Node01 parent = null;
            while (true) {
                parent = current;
                if (mahasiswa.ipk < current.mahasiswa.ipk) {
                    current = current.left;
                    if (current == null) {
                        parent.left = newNode;
                        return;
                    }
                } else {
                    current = current.right;
                    if (current == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    boolean find01(double ipk) {
        boolean result = false;
        Node01 current = root;
        while (current != null) {
            if (current.mahasiswa.ipk == ipk) {
                result = true;
                break;
            } else if (ipk > current.mahasiswa.ipk) {
                current = current.right;
            } else {
                current = current.left;
            }
        }
        return result;
    }

    void traversePreOrder01(Node01 node) {
        if (node != null) {
            node.mahasiswa.tampilInformasi();
            traversePreOrder01(node.left);
            traversePreOrder01(node.right);
        }
    }

    void traverseInOrder01(Node01 node) {
        if (node != null) {
            traverseInOrder01(node.left);
            node.mahasiswa.tampilInformasi();
            traverseInOrder01(node.right);
        }
    }

    void traversePostOrder01(Node01 node) {
        if (node != null) {
            traversePostOrder01(node.right);
            traversePostOrder01(node.left);
            node.mahasiswa.tampilInformasi();
        }
    }

    Node01 getSuccessor01(Node01 del) {
        Node01 succesor = del.right;
        Node01 succesorParent = del;
        while (succesor.left != null) {
            succesorParent = succesor;
            succesor = succesor.left;
        }
        if (succesor != del.right) {
            succesorParent.left = succesor.right;
            succesor.right = del.right;
        }
        return succesor;
    }

    void delete01(double ipk) {
        if (isEmpty01()) {
            System.out.println("Binary tree kosong");
            return;
        }
        // cari Node (tmp) yang akan dihapus
        Node01 parent = root;
        Node01 current = root;
        boolean isLeftChild = false;
        while (current != null) {
            if (current.mahasiswa.ipk == ipk) {
                break;
            } else if (ipk < current.mahasiswa.ipk) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else if (ipk > current.mahasiswa.ipk) {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }
        // penghapusan
        if (current == null) {
            System.out.println("mahasiswa tidak ditemukan");
            return;
        } else {
            // jika tidak ada anak (leaf), maka Node dihapus
            if (current.left == null && current.right == null) {
                if (current == root) {
                    root = null;
                } else {
                    if (isLeftChild) {
                        parent.left = null;
                    } else {
                        parent.right = null;
                    }
                }
            } else if (current.left == null) {// jika hanya punya 1 anak (kanan)
                if (current == root) {
                    root = current.right;
                } else {
                    if (isLeftChild) {
                        parent.left = current.right;
                    } else {
                        parent.right = current.right;
                    }
                }
            } else if (current.right == null) {// jika hanya punya 1 anak (kiri)
                if (current == root) {
                    root = current.left;
                } else {
                    if (isLeftChild) {
                        parent.left = current.left;
                    } else {
                        parent.right = current.left;
                    }
                }
            } else {// jika punya 2 anak
                Node01 succesor = getSuccessor01(current);
                System.out.println("Jika 2 anak, tmp = ");
                succesor.mahasiswa.tampilInformasi();
                if (current == root) {
                    root = succesor;
                } else {
                    if (isLeftChild) {
                        parent.left = succesor;
                    } else {
                        parent.right = succesor;
                    }
                }
                succesor.left = current.left;
            }
        }
    }

    public void addRekursif01(Mahasiswa01 data) {
        root = addRekursif01(root, data);
    }

    Node01 addRekursif01(Node01 tmp, Mahasiswa01 data) {
        if (tmp == null) {
            return new Node01(data);
        }

        if (data.ipk < tmp.mahasiswa.ipk) {
            tmp.left = addRekursif01(tmp.left, data);
        } else {
            tmp.right = addRekursif01(tmp.right, data);
        }

        return tmp;
    }
}
