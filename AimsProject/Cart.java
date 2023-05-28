
public class Cart {
	public static final int MAX_NUMBERS_ORDERED=20;
	private DigitalVideoDisc itemsOrdered[]=new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	private int qtyOrdered=0;
	public Cart() {
		qtyOrdered=0;
	}
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyOrdered<MAX_NUMBERS_ORDERED) {
			itemsOrdered[qtyOrdered]=disc;
			qtyOrdered++;
			System.out.println("The disc has been added");
				}
		else {
			System.out.println("The cart is almost full");
			
		}		
	}
    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList){
        for (int i = 0; i<dvdList.length; i++){
            this.addDigitalVideoDisc(dvdList[i]);
        }
    }
    // public void addDigitalVideoDisc(DigitalVideoDisc... dvds) {
    //     for (DigitalVideoDisc dvd : dvds) {
    //         this.addDigitalVideoDisc(dvd);
    //     }
    // }
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2){
        this.addDigitalVideoDisc(dvd1);
        this.addDigitalVideoDisc(dvd2);
    }
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        boolean found=false;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i] == disc) {
                found = true;
                for (int j = i; j < qtyOrdered - 1; j++) {
                    itemsOrdered[j] = itemsOrdered[j + 1];
                }
                itemsOrdered[qtyOrdered - 1] = null;
                qtyOrdered--;
                System.out.println("The disc has been removed.");
                break;
            }
        }
	}
	public float totalCost() {
        float total = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            total += itemsOrdered[i].getCost();
        }
        return total;
    }
    public void printCart() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:\n");
    
        for (int i = 0; i < qtyOrdered; i++) {
            System.out.println((i + 1) + ". " + itemsOrdered[i].toString());
        }
    
        float totalCost = totalCost();
        System.out.println("\nTotal cost: " + totalCost);
        System.out.println("***************************************************");
    }

    public void searchCart(DigitalVideoDisc[] itemsToBeSearched){
        boolean found=false;
        for (DigitalVideoDisc item:itemsToBeSearched){
            for (int i=0;i<qtyOrdered;i++){
                if (itemsOrdered[i].isMatch(item.getTitle())){
                    System.out.println("Found items in Cart:"+ itemsOrdered[i].getTitle());
                    found=true;

                }
            }
        if (!found){
            System.out.println("Items not found") ;
        }

        }
    }
  
			
}
