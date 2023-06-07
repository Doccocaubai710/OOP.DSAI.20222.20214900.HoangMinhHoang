package hust.soict.dsai.aims.cart;

import java.util.ArrayList;

import hust.soict.dsai.aims.media.Media;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED=20;
	private ArrayList<Media> itemsOrdered=new ArrayList<Media>();

	public void addMedia(Media media){
        itemsOrdered.add(media);
    }
    public void removeMedia(Media media){
        itemsOrdered.remove(media);
    }

	
	
	public float totalCost() {
        float total = 0;
        for (Media media:itemsOrdered) {
            total += media.getCost();
        }
        return total;
    }
    public void printCart() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:\n");
    
        for (Media media:itemsOrdered) {
            System.out.println(media.toString());
        }
    
        float totalCost = totalCost();
        System.out.println("\nTotal cost: " + totalCost);
        System.out.println("***************************************************");
    }

    
			
}
