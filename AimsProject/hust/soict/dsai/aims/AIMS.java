package hust.soict.dsai.aims;

import java.util.ArrayList;
import java.util.List;


import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.media.Track;
public class AIMS{
    public static void main(String[] args){
    	
		List<Media> mediae=new ArrayList<Media>();
    	List<Track> tracks = new ArrayList<>();
		tracks.add(new Track("Track 1", 240));
		tracks.add(new Track("Track 2", 180));
		tracks.add(new Track("Track 3", 210));

		Media cd = new CompactDisc(4, "Album Title", "Music", 29.99f, "Artist Name", 140,"Hoang");
		mediae.add(cd);
    	
    	Media dvd=new DigitalVideoDisc("Star Wars","Science Fiction",87,"George Lucas",24.95f);
    	mediae.add(dvd);

		List<String> authors=new ArrayList<>();
		authors.add("Minh Hoang");
		authors.add("Hoang Minh");
    	Media book=new Book(3,"Aladin","Animation",18.99f,authors);
    	mediae.add(book);
		for (Media media:mediae){
			System.out.println(media.toString());
		}
		
    }
}
