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
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            showMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    viewStoreMenu(scanner);
                    break;
                case 2:
                    updateStoreMenu(scanner);
                    break;
                case 3:
                    seeCurrentCartMenu(scanner);
                    break;
                case 0:
                    System.out.println("Exiting the program...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
    public static void showMenu() {
        System.out.println("AIMS:");
        System.out.println("--------------------------------");
        System.out.println("1. View store");
        System.out.println("2. Update store");
        System.out.println("3. See current cart");
        System.out.println("0. Exit");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3");
    }
    public static void viewStoreMenu(Scanner scanner) {
        store.display();
        System.out.println();

        while (true) {
            storeMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    seeMediaDetails(scanner);
                    break;
                case 2:
                    addMediaToCart(scanner);
                    break;
                case 3:
                    playMedia(scanner);
                    break;
                case 4:
                    seeCurrentCart();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void storeMenu() {
        System.out.println("Options:");
        System.out.println("--------------------------------");
        System.out.println("1. See a media's details");
        System.out.println("2. Add a media to cart");
        System.out.println("3. Play a media");
        System.out.println("4. See current cart");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4");
    }

    public static void seeMediaDetails(Scanner scanner) {
        System.out.println("Enter the title of the media: ");
        String title = scanner.nextLine();

        Media media = store.search(title);
        if (media != null) {
            media.toString();

            if (media instanceof Playable) {
                while (true) {
                    mediaDetailsMenu();
                    int choice = scanner.nextInt();
                    scanner.nextLine(); // Consume newline character

                    switch (choice) {
                        case 1:
                            cart.addMedia(media);
                            System.out.println("Added to cart.");
                            break;
                        case 2:
                            ((DigitalVideoDisc) media).play();
                            break;
                        case 0:
                            return;
                        default:
                            System.out.println("Invalid choice. Please try again.");
                    }
                }
            }
        } else {
            System.out.println("Media not found.");
        }
    }

    public static void mediaDetailsMenu() {
        System.out.println("Options:");
        System.out.println("--------------------------------");
        System.out.println("1. Add to cart");
        System.out.println("2. Play");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2");
    }

    public static void addMediaToCart(Scanner scanner) {
        System.out.println("Enter the title of the media: ");
        String title = scanner.nextLine();

        Media media = store.search(title);
        if (media != null) {
            cart.addMedia(media);
            System.out.println("Added to cart.");
        } else {
            System.out.println("Media not found.");
        }
    }

    public static void playMedia(Scanner scanner) {
        System.out.println("Enter the title of the media: ");
        String title = scanner.nextLine();

        Media media = store.search(title);
        if (media != null && media instanceof Playable) {
            media.toString();
        } else {
            System.out.println("Media not found or not playable.");
        }
    }

    public static void seeCurrentCart() {
        cart.printCart();
        Scanner scanner=new Scanner(System.in);

        while (true) {
            cartMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    filterMediaInCart(scanner);
                    break;
                case 2:
                    sortMediaInCart(scanner);
                    break;
                case 3:
                    removeMediaFromCart(scanner);
                    break;
                case 4:
                    playMediaFromCart(scanner);
                    break;
                case 5:
                    placeOrder();
                    return;
                case 0:
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void cartMenu() {
        System.out.println("Options:");
        System.out.println("--------------------------------");
        System.out.println("1. Filter medias in cart");
        System.out.println("2. Sort medias in cart");
        System.out.println("3. Remove media from cart");
        System.out.println("4. Play a media");
        System.out.println("5. Place order");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4-5");
    }

    public static void filterMediaInCart(Scanner scanner) {
        System.out.println("Choose filtering option:");
        System.out.println("1. Filter by ID");
        System.out.println("2. Filter by Title");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        if (choice == 1) {
            
            cart.sortbyTitleCost();
        } else if (choice == 2) {
            
            cart.sortByCostTiTle();
        } else {
            System.out.println("Invalid choice.");
        }
    }

    public static void sortMediaInCart(Scanner scanner) {
        System.out.println("Choose sorting option:");
        System.out.println("1. Sort by Title");
        System.out.println("2. Sort by Cost");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        if (choice == 1) {
            cart.sortbyTitleCost();
        } else if (choice == 2) {
            cart.sortByCostTiTle();
        } else {
            System.out.println("Invalid choice.");
        }
    }

    public static void removeMediaFromCart(Scanner scanner) {
        System.out.println("Enter the title of the media to remove: ");
        String title = scanner.nextLine();
    }


    public static void playMediaFromCart(Scanner scanner) {
        System.out.println("Enter the title of the media to play: ");
        String title = scanner.nextLine();
        
        
    }

    public static void placeOrder() {
        System.out.println("Order created.");
        
    }
}





