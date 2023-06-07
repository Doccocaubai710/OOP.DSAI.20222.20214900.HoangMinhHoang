package hust.soict.dsai.aims.media;

public class Track implements Playable{
    private String title;
    private int length;
    public String getTitle() {
        return title;
    }
    public int getLength() {
        return length;
    }
    public Track(String title,int length){
        this.title=title;
        this.length=length;
    }
    public boolean equals(Object obj){
        if (this==obj){
            return true;
        }
        if (obj instanceof Track){
            Track other=(Track) obj;
            return (title.equals(other.title))&& (length==(other.length));
        }
        return false;
    }
    @Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Playing DVD: "+this.getTitle());
		System.out.println("DVD length: " + this.getLength());

	}
    
}
