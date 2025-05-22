package P13.Tugas2;

public class NodeFilm01 {
    Film01 data;
    NodeFilm01 prev, next;

    public NodeFilm01 (NodeFilm01 prev, Film01 data, NodeFilm01 next){
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
