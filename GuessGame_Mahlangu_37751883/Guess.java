
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.util.Random;

/**
 * Write a description of JavaFX class Guess here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class Guess extends Application
{
    private Random random = new Random();
    private int randomNumber;
    private int totalGuesses;

    private Label guessLabel;
    private TextField guessTextField;
    private Button generateButton;
    private Button checkButton;
    private TextArea messageTextArea;

    @Override
    public void start(Stage primaryStage) {
        guessLabel = new Label("Enter your guess (1-10):");
        guessTextField = new TextField();
        generateButton = new Button("Random Number");
        checkButton = new Button("Check Match");
        messageTextArea = new TextArea();

        generateButton.setOnAction(e -> generateRandomNumber());
        checkButton.setOnAction(e -> checkMatch());

        GridPane gridPane = new GridPane();
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.setPadding(new Insets(10));
        gridPane.add(guessLabel, 0, 0);
        gridPane.add(guessTextField, 1, 0);
        gridPane.add(generateButton, 0, 1);
        gridPane.add(checkButton, 1, 1);

        VBox vbox = new VBox(10);
        vbox.getChildren().addAll(gridPane, messageTextArea);
        vbox.setAlignment(Pos.CENTER);

        Scene scene = new Scene(vbox, 300, 200);
        primaryStage.setTitle("Guess Game");
        primaryStage.setScene(scene);
        primaryStage.show();

        guessTextField.requestFocus();
    }

    private void generateRandomNumber() {
        randomNumber = random.nextInt(10) + 1;
        totalGuesses = 0;
        messageTextArea.clear();
        guessTextField.clear();
        guessTextField.requestFocus();
    }

    private void checkMatch() {
        if (randomNumber == Integer.parseInt(guessTextField.getText())) {
            totalGuesses++;
            messageTextArea.appendText("Correct! The number was " + randomNumber + ". Total guesses: " + totalGuesses + "\n");
            generateButton.setDisable(true);
            checkButton.setDisable(true);
        } else {
            totalGuesses++;
            if (Integer.parseInt(guessTextField.getText()) > randomNumber) {
                messageTextArea.appendText(guessTextField.getText() + " is too high.\n");
            } else {
                messageTextArea.appendText(guessTextField.getText() + " is too low.\n");
            }
            guessTextField.clear();
            guessTextField.requestFocus();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }

}
