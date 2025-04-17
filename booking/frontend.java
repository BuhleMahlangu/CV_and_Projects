

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * Write a description of JavaFX class frontend here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class frontend extends Application
{
    // We keep track of the count, and label displaying the count:
    private int count = 0;
    private Label myLabel = new Label("0");

    /**
     * The start method is the main entry point for every JavaFX application. 
     * It is called after the init() method has returned and after 
     * the system is ready for the application to begin running.
     *
     * @param  stage the primary stage for this application.
     */
    @Override
    public void start(Stage stage)
    {
        // Create a Button or any control item
        Button myButton = new Button("Count");
        Button myButton2 = new Button("Reset");
        Label myLabel1 = new Label("The Booking System");
        Label myLabel2 = new Label("First Name");
        Label myLabel3 = new Label("Last Name");
        //TextField mytxt1 = new TextField();
        // Create a new grid pane
        GridPane pane = new GridPane();
        pane.setPadding(new Insets(10, 10, 10, 10));
        pane.setMinSize(300, 300);
        pane.setVgap(10);
        pane.setHgap(10);

        //set an action on the button using method reference
        myButton.setOnAction(this::buttonClick);
       
        // Add the button and label into the pane
        pane.add(myLabel1, 1, 0);
        pane.add(myLabel2, 0, 1);
        pane.add(myLabel3, 0, 2);
        pane.add(myButton, 3, 1);
        pane.add(myButton2, 3, 2);
        
        //introducing the textfield
        final TextField name = new TextField();
        final TextField name2 = new TextField();
        name.setPromptText("Enter your first name.");
        name.setPrefColumnCount(10);
        name.getText();
        GridPane.setConstraints(name, 1, 1);
        pane.getChildren().add(name);
        
        name2.setPromptText("Enter your last name.");
        name2.setPrefColumnCount(10);
        name2.getText();
        GridPane.setConstraints(name2, 1, 2);
        pane.getChildren().add(name2);
        
        // JavaFX must have a Scene (window content) inside a Stage (window)
        Scene scene = new Scene(pane, 300,100);
        stage.setTitle("JavaFX Example");
        stage.setScene(scene);

        // Show the Stage (window)
        stage.show();
    }

    /**
     * This will be executed when the button is clicked
     * 
     */
    private void buttonClick(ActionEvent event)
    {
        // Counts number of button clicks and shows the result on a label
        
         //myButton.setOnAction(new EventHandler<ActionEvent>() 

          // public void handle(ActionEvent event) {
           //     textField.clear();}//
        
        count = count + 1;
        myLabel.setText(Integer.toString(count));
    }
}

    public String toString() {
        return "Name: " + name + "\nAge: " + age + "\nNumber of matches won: " + matchesWon;
    }
}
