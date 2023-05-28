public class Store {
    private DigitalVideoDisc[] itemsInStore;
    private int count;
    public Store(){
        itemsInStore=new DigitalVideoDisc[100];
        count=0;
    }
    public void addDigitalVideoDisc(DigitalVideoDisc dvd){
        if (count<itemsInStore.length){
            itemsInStore[count]=dvd;
            count++;
            System.out.println("DVD has been added to store.");
        }
        else{
            System.out.println("Cannot add any more");
        }
    }
}
