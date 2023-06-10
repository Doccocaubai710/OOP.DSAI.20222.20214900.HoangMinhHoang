package hust.soict.dsai.aims.media;
import java.util.Comparator;
public class MediaComparatorByCostTitle implements Comparator<Media>{

    @Override
    public int compare(Media media1, Media media2) {
        // TODO Auto-generated method stub
        int costComparison=Float.compare(media1.getCost(), media2.getCost());
        if (costComparison!=0){
            return costComparison;
        }
        else{
            return media1.getTitle().compareTo(media2.getTitle());
        }
    }    
}
    

