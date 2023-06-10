package hust.soict.dsai.test.cart;
import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.DigitalVideoDisc;

public class CartTest{
    public static void main(String[] args){
    	// Create some instances of DigitalVideoDisc
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lord of the Rings", "Peter Jackson",19.99f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Inception", "Christopher Nolan",15.99f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Pulp Fiction", "Quentin Tarantino",12.99f);

        // Create a cart and add the discs
        Cart cart = new Cart();
        cart.addMedia(dvd1);
        cart.addMedia(dvd2);
        cart.addMedia(dvd3);

        // Display the unsorted cart items
        System.out.println("Unsorted Cart:");
        cart.printCart();

        // Sort the cart by title and cost
        cart.sortbyTitleCost();
        System.out.println("Sorted Cart (Title, Cost):");
        cart.printCart();

        // Sort the cart by cost and title
        cart.sortByCostTiTle();
        System.out.println("Sorted Cart (Cost, Title):");
        cart.printCart();
		
    }

}