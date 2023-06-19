package hust.soict.dsai.aims;
import hust.soict.dsai.aims.store.Store;
import hust.soict.dsai.aims.screen.StoreScreen;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import java.util.List;
import java.util.ArrayList;
import hust.soict.dsai.aims.media.Book;
public class AnotherTest {
    public static void main(String[] args){
        
        Store store = new Store();

        Media cd1 = new CompactDisc(4, "Album Title 1", "Music", 29.99f, "Artist Name 1", 140, "Hoang");
        store.addMedia(cd1);

        Media cd2 = new CompactDisc(5, "Album Title 2", "Music", 19.99f, "Artist Name 2", 120, "Hoang");
        store.addMedia(cd2);

        Media dvd1 = new DigitalVideoDisc("Star Wars 1", "Science Fiction", 87, "George Lucas", 24.95f);
        store.addMedia(dvd1);

        Media dvd2 = new DigitalVideoDisc("Star Wars 2", "Science Fiction", 112, "George Lucas", 29.95f);
        store.addMedia(dvd2);

        List<String> authors1 = new ArrayList<>();
        authors1.add("Author 1");
        authors1.add("Author 2");
        Media book1 = new Book(1, "Book Title 1", "Fantasy", 12.99f, authors1);
        store.addMedia(book1);

        List<String> authors2 = new ArrayList<>();
        authors2.add("Author 3");
        authors2.add("Author 4");
        Media book2 = new Book(2, "Book Title 2", "Mystery", 14.99f, authors2);
        store.addMedia(book2);

        // Add 3 more instances of media here

        StoreScreen storeScr = new StoreScreen(store);
    }
}
