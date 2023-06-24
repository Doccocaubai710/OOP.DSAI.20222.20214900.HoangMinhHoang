package hust.soict.dsai.aims.media;

import hust.soict.dsai.aims.exception.PlayerException;

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
	public void play() throws PlayerException {
		// TODO Auto-generated method stub
    	if (this.getLength()>0) {
		System.out.println("Playing DVD: "+this.getTitle());
		System.out.println("DVD length: " + this.getLength());
    	} else throw new PlayerException("Error: Length cannot be non-positive!");

	}
    
}
