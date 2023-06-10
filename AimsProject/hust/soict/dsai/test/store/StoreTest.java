package hust.soict.dsai.test.store;

import java.util.Scanner;

import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.store.Store;

public class StoreTest{
    static Store store=new Store();
    static Cart cart=new Cart();
    public static void showMenu(){
        System.out.println("AIMS: "); 
        System.out.println("--------------------------------"); 
        System.out.println("1. View store"); 
        System.out.println("2. Update store"); 
        System.out.println("3. See current cart"); 
        System.out.println("0. Exit"); 
        System.out.println("--------------------------------"); 
        System.out.println("Please choose a number: 0-1-2-3"); 
    }

    public void viewStore(Scanner scanner){
        store.display();
        storeMenu(scanner);
    }
    public static void storeMenu(Scanner scanner){
        System.out.println("Options: "); 
        System.out.println("--------------------------------"); 
        System.out.println("1. See a media’s details"); 
        System.out.println("2. Add a media to cart"); 
        System.out.println("3. Play a media"); 
        System.out.println("4. See current cart"); 
        System.out.println("0. Back"); 
        System.out.println("--------------------------------"); 
        System.out.println("Please choose a number: 0-1-2-3-4"); 

        int choice=scanner.nextInt();
        scanner.nextLine();
        switch (choice) {
            case 1:
                seeMediaDetails(scanner);
                break;
            case 2:
                addMediaToCart();
                break;
            case 3:
                playMedia();
                break;
            case 4:
                seeCurrentCart();
                break;
            case 0:
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }

    }

    public static void seeMediaDetails(Scanner scanner){
        System.out.println("Enter the title of the media:");
        
    }
    public static void mediaDetailsMenu(Scanner scanner, Media media) {
        System.out.println("Options:");
        System.out.println("--------------------------------");
        System.out.println("1. Add to cart");
        if (media instanceof DigitalVideoDisc || media instanceof CompactDisc) {
            System.out.println("2. Play");
        }
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1" + (media instanceof DigitalVideoDisc || media instanceof CompactDisc ? "-2" : ""));

        int choice = scanner.nextInt();
        scanner.nextLine();
        switch (choice){
            case 1: 
            cart.addMedia(media);
            break;
            case 2:
            System.out.println("Play the media");
            break;
            default:
            System.out.println("Invalid media");


        }
    }
    public static void addMediaToCart(){
        System.out.println("Add the media to cart");
    }
    public static void playMedia(){
        System.out.println(" Play the Media");
    }
    public static void seeCurrentCart(){
        System.out.println("See the current cart");
    }
    

    public static void main(String[] args){
        
        Scanner scanner=new Scanner(System.in);

    }
}
