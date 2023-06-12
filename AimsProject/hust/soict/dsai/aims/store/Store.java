package hust.soict.dsai.aims.store;

import java.util.ArrayList;

import hust.soict.dsai.aims.media.Media;

public class Store {
    private ArrayList<Media> itemsInStore=new ArrayList<Media>();
    
    
    public void addMedia(Media media){
        itemsInStore.add(media);
        System.out.println("Media has been added to store");
    }
    public void removeMedia(Media media){
        boolean foundMedia=itemsInStore.remove(media);
        if (foundMedia){
            System.out.println("The media has been removed");
        }
        else{
            System.out.println("Cannot find item to remove");
        }
    }
    public void display(){
        System.out.println("DVDs in Store:");
        for (Media media:itemsInStore){
            System.out.println(media.toString());
        }
        
    }
    public Media search(String title) {
    for (Media media : itemsInStore) {
        if (media.getTitle().equalsIgnoreCase(title)) {
            return media;
        }
    }
    return null; // Media not found
}
}
