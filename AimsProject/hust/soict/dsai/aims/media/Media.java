package hust.soict.dsai.aims.media;

public abstract class Media {
    private int id;
    private String title;
    private String category;
    private float cost;
    public Media(){
        
    }
    public Media(int id,String title, String category,float cost){
        this.id=id;
        this.title=title;
        this.category=category;
        this.cost=cost;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public float getCost() {
        return cost;
    }
    public void setCost(float cost) {
        this.cost = cost;
    }
    public String toString(){
        return "DVD - " + this.getTitle() + " - " + this.getCategory()  + " :"  + this.getCost() + " $";
    }
    public boolean equals(Object obj){
        if (this==obj){
            return true;
        }
        if (obj instanceof Media){
            Media other=(Media) obj;
            return title.equals(other.title);
        }
        return false;
    }
}
