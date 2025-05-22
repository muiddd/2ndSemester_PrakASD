package P13.Tugas2;

public class Film01 {
    String id;
    String judul;
    double rating;

    public Film01(String id, String judul, double rating){
        this.id = id;
        this.judul = judul;
        this.rating = rating;
    }

    public void tampilInformasi01(){
       System.out.println("ID: " + id);
       System.out.println("Judul: "+ judul);
       System.out.println("Rating: "+ rating); 
    }
}
