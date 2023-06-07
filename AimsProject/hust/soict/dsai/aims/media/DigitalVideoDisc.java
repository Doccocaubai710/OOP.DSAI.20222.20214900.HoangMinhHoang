package hust.soict.dsai.aims.media;
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
    }

    public DigitalVideoDisc(String title, String category , float cost) {
        super();
        nbDigitalVideoDisc += 1;
        this.setId(nbDigitalVideoDisc);
    }
    
    public DigitalVideoDisc(String title, String category, String director, float cost) {
        super();
        nbDigitalVideoDisc += 1;
        this.setId(nbDigitalVideoDisc);
        this.setDirector(getDirector());
    }
    
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super();
        nbDigitalVideoDisc += 1;
        this.setId(nbDigitalVideoDisc);
        this.setDirector(getDirector());
        this.setLength(getLength());
    }
	public String toString(){
        return "dvd"+"-"+this.getDirector()+"-"+ this.getTitle() + " - " + this.getCategory()+"-"+this.getLength()  + " :"  + this.getCost() + " $";
    }

    public boolean isMatch(String titleToCompare){
		return this.getTitle().equalsIgnoreCase(titleToCompare);
	}
	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Playing DVD: "+this.getTitle());
		System.out.println("DVD length: " + this.getLength());

	}
	
    

    
    
}
