package hust.soict.dsai.javafxx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class PainterController {

    @FXML
    private Pane drawingAreaPane;
    @FXML
    private RadioButton eraserRadioButton;

    @FXML
    private ToggleGroup identical;

    @FXML
    private RadioButton penRadioButton;
    

    @FXML
    void clearButtonPressed(ActionEvent event) {
    	drawingAreaPane.getChildren().clear();
    }

    @FXML
    void drawingAreaMouseDragged(MouseEvent event) {
    	if (isEraserSelected()) {
    		Circle newCircle=new Circle(event.getX(),event.getY(),4,Color.WHITE);
    		drawingAreaPane.getChildren().add(newCircle);
    	}
    	else {
    		Circle newCircle=new Circle(event.getX(),event.getY(),4,Color.BLACK);
    		drawingAreaPane.getChildren().add(newCircle);
    	}
    }
    private boolean isEraserSelected() {
    	RadioButton selectedRadioButton=(RadioButton) identical.getSelectedToggle();
    	return selectedRadioButton==eraserRadioButton;
    }

}



