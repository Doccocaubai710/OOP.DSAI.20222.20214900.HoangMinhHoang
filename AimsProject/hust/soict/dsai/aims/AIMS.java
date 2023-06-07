package hust.soict.dsai.aims;
import java.util.ArrayList;
import java.util.List;


import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;
public class AIMS{
    public static void main(String[] args){
    	
		List<Media> mediae=new ArrayList<Media>();
    	Media cd=new CompactDisc();
		mediae.add( cd);
    	
    	Media dvd=new DigitalVideoDisc("Star Wars","Science Fiction","George Lucas",87,24.95f);
    	mediae.add(dvd);
    	Media book=new Book(3,"Aladin","Animation",18.99f);
    	mediae.add(book);
		for (Media media:mediae){
			System.out.println(media.toString());
		}
		
    }
}