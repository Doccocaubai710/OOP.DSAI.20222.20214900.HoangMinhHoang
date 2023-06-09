package hust.soict.dsai.aims.screen;

import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.store.Store;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;

public class AddDigitalVideoDiscToStoreScreenController {
	private StoreScreen storeScreen;
	private Store store;
	
    @FXML
    private Button DVDAddButton;

    @FXML
    private TextField DVDCategory;

    @FXML
    private TextField DVDCost;

    @FXML
    private TextField DVDDirector;

    @FXML
    private TextField DVDLength;

    @FXML
    private TextField DVDTitle;
    @FXML
    private MenuItem viewBook;

    @FXML
    private MenuItem viewCD;

    @FXML
    private MenuItem viewCart;

    @FXML
    private MenuItem optionViewStore;
    public AddDigitalVideoDiscToStoreScreenController(StoreScreen storeScreen,Store store) {
    	this.storeScreen=storeScreen;
    	this.store=store;
    }

    @FXML
    void DVDButtonPressed(ActionEvent event) {
    	String category=DVDCategory.getText();
    	String director=DVDDirector.getText();
    	float cost=Float.parseFloat(DVDCost.getText());
    	int length=Integer.parseInt(DVDLength.getText());
    	String title=DVDTitle.getText();
    	DigitalVideoDisc digitalVideoDisc=new DigitalVideoDisc(title,category,length,director,cost);
    	store.addMedia(digitalVideoDisc);
    	
    	
    }

    @FXML
    void viewStorePressed(ActionEvent event) {
    	storeScreen.updateStoreContents();
    	storeScreen.setVisible(true);
    }
    @FXML
    void viewBookPressed(ActionEvent event) {
    	AddBookToStoreScreen newScreen=new AddBookToStoreScreen(storeScreen, store);
    	newScreen.setVisible(true);
    }

    @FXML
    void viewCDPressed(ActionEvent event) {
    	AddCompactDiscToStoreScreen newScreen=new AddCompactDiscToStoreScreen(storeScreen, store);
    	newScreen.setVisible(true);
    }

    @FXML
    void viewCartPressed(ActionEvent event) {
    	CartScreen newScreen=new CartScreen(storeScreen.getCart(), storeScreen);
    	newScreen.setVisible(true);
    }


}

