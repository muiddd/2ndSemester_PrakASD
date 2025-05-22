package P13.Tugas1;

public class NodeVaksin01 {
    DataVaksin01 data;
    NodeVaksin01 prev,next;

    public NodeVaksin01(NodeVaksin01 prev, DataVaksin01 data, NodeVaksin01 next){
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
