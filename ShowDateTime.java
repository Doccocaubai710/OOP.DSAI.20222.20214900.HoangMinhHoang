import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ShowDateTime extends Application {

    private TextField dateTimeField;

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Date Time App");

        // Create a button to show the date and time
        Button showDateTimeButton = new Button("Show Date Time");
        showDateTimeButton.setOnAction(e -> showDateTime());

        // Create a text field to display the date and time
        dateTimeField = new TextField();
        dateTimeField.setEditable(false);
        // Create a layout and add the components
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(10));
        layout.getChildren().addAll(showDateTimeButton, dateTimeField);

        // Create a scene and set it on the stage
        Scene scene = new Scene(layout, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void showDateTime() {
        // Get the current date and time
        LocalDateTime now = LocalDateTime.now();

        // Format the date and time
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss.SSS");
        String formattedDateTime = now.format(formatter);

        // Set the formatted date and time in the text field
        dateTimeField.setText(formattedDateTime);
    }

    public static void main(String[] args) {
        launch(args);
    }
}