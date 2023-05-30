package hust.soict.dsai.aims.store;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

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
    public void removeDigitalVideoDisc(DigitalVideoDisc dvd){
        boolean foundDisc=false;
        for (int i=0;i<count;i++){
            if (itemsInStore[i]==dvd){
                foundDisc=true;
                for (int j=i;j<count-1;j++){
                        itemsInStore[j]=itemsInStore[j+1];
                }
                itemsInStore[count-1]=null;
                count--;
                System.out.println("The items has been removed");
                break;
            }
        }
        if (!foundDisc){
            System.out.println("Cannot found item to remove");
        }
    }
    public void display(){
        System.out.println("DVDs in Store:");
        for (int i=0;i<count;i++){
            System.out.println(itemsInStore[i].toString());
        }
        
    }
}
