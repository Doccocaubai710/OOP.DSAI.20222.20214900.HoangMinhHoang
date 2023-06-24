package hust.soict.dsai.aims.media;

import hust.soict.dsai.aims.exception.PlayerException;

public class DigitalVideoDisc extends Disc implements Playable{

	public static int nbDigitalVideoDisc;
	public DigitalVideoDisc(){
		super();
		nbDigitalVideoDisc+=1;
		this.setId(nbDigitalVideoDisc);
	}
	public DigitalVideoDisc(String title) {
        super();
        nbDigitalVideoDisc += 1;
        this.setId(nbDigitalVideoDisc);
        this.setTitle(title);
    }

    public DigitalVideoDisc(String title, String category , float cost) {
        super();
        nbDigitalVideoDisc += 1;
        this.setId(nbDigitalVideoDisc);
        this.setCategory(category);
        this.setCost(cost);
        this.setTitle(title);
    }
    
    public DigitalVideoDisc(String title, String category,int length, String director, float cost) {
        super();
        this.setCategory(category);
        this.setCost(cost);
        this.setLength(length);
        this.setTitle(title);;
        nbDigitalVideoDisc += 1;
        this.setId(nbDigitalVideoDisc);
        this.setDirector(director);
    }
    
    
    @Override
	public String toString(){
        return "dvd"+"-"+this.getDirector()+"-"+ this.getTitle() + " - " + this.getCategory()+"-"+this.getLength()  + " :"  + this.getCost() + " $";
    }

    public boolean isMatch(String titleToCompare){
		return this.getTitle().equalsIgnoreCase(titleToCompare);
	}
	@Override
	public void play() throws PlayerException{
		// TODO Auto-generated method stub
		if (this.getLength()>0) {
			System.out.println("Playing DVD: "+this.getTitle());
			System.out.println("DVD length: " + this.getLength());
		}
		else throw new PlayerException("ERROR: Length cannot be non-positive!");

	}
	
    

    
    
}
