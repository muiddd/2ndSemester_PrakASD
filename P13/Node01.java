package P13;

public class Node01 {
    int data;
    Node01 prev, next;

    Node01(Node01 prev, int data, Node01 next){
        this.prev=prev;
        this.data=data;
        this.next=next;
    }
}
