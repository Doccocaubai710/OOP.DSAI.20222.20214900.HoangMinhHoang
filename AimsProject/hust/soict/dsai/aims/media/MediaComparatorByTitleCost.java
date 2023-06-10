package hust.soict.dsai.aims.media;
import java.util.Comparator;
public class MediaComparatorByTitleCost implements Comparator<Media>{

    @Override
    public int compare(Media media1, Media media2) {
        // TODO Auto-generated method stub
        int titleComparison=media1.getTitle().compareToIgnoreCase(media2.getTitle());
        if (titleComparison!=0){
            return titleComparison;
        }
        else {
            return Float.compare(media1.getCost(), media2.getCost());
        }
    }
    
    
}
