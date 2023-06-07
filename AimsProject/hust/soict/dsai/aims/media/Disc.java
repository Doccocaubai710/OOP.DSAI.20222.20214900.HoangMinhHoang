package hust.soict.dsai.aims.media;

public class Disc extends Media {
    private int length;
    private String director;
    public int getLength(){
        return length;
    }
    public String getDirector(){
        return director;
    }
    public void setDirector(String director){
        this.director=director;
    }
    public void setLength(int length){
        this.length=length;
    }
    public Disc(){
        super();
    }
    public Disc(int id,String title,String category,float cost ){
        super(id, title, category, cost);
    }

}
