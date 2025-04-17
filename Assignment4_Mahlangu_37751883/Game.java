
/**
 * Write a description of class Game here.
 *
 * @author (BL Mahlangu 37751883)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Game
{
    public static void main(String[] args) {
        ArrayList<Card> list1 = new ArrayList<>(4);
        ArrayList<Card> list2 = new ArrayList<>(4);
        ArrayList<Card> list3 = new ArrayList<>(4);
        ArrayList<Card> list4 = new ArrayList<>(4);

        Random random = new Random();

        ArrayList<Integer> values = new ArrayList<>();
        for (int i = 1; i <= 8; i++) {
            values.add(i);
            values.add(i);
        }

        Collections.shuffle(values);

        for (int value : values) {
            Card card = new Card(value);

            if (!Card.isFull(list1)) {
                list1.add(card);
            } else if (!Card.isFull(list2)) {
                list2.add(card);
            } else if (!Card.isFull(list3)) {
                list3.add(card);
            } else if (!Card.isFull(list4)) {
                list4.add(card);
            }
        }
        
        boolean gameOver = false;
        Scanner scanner = new Scanner(System.in);

        while (!gameOver) {
            showAll(list1, list2, list3, list4);

            System.out.println("Enter the row and column for the first card (e.g., 1 2): ");
            int row1 = scanner.nextInt();
            int col1 = scanner.nextInt();
            
            System.out.println("Enter the row and column for the second card (e.g., 2 3): ");
            int row2 = scanner.nextInt();
            int col2 = scanner.nextInt();

            if (isValidInput(row1, col1, row2, col2) && !cardsAlreadyGuessed(row1, col1, row2, col2, list1, list2, list3, list4)) {
                // Retrieve the selected cards
                Card card1 = getCard(row1, col1, list1, list2, list3, list4);
                Card card2 = getCard(row2, col2, list1, list2, list3, list4);

                // Check if the cards match
                if (card1.getVal().equals(card2.getVal())) {
                    card1.setGuessed(true);
                    card2.setGuessed(true);
                    System.out.println("You found a match!");
                    
                    if (checkWin(list1, list2, list3, list4)) {
                        System.out.println("Congratulations! You win!");
                        gameOver = true;
                    }
                } else {
                    System.out.println("Sorry, no match. Try again.");
                }
            } else {
                System.out.println("Invalid input or card already guessed. Please try again.");
            }
        }
        
        scanner.close();
    }
    
    public static void showAll(ArrayList<Card>... lists) {
        for (ArrayList<Card> list : lists) {
            System.out.println(list);
        }
    }

    public static boolean checkWin(ArrayList<Card>... lists) {
        for (ArrayList<Card> list : lists) {
            for (Card card : list) {
                if (!card.isGuessed()) {
                    return false;
                }
            }
        }
        return true;
    }
    
    public static boolean isValidInput(int row1, int col1, int row2, int col2) {
        return row1 >= 0 && row1 < 4 && col1 >= 0 && col1 < 4 && row2 >= 0 && row2 < 4 && col2 >= 0 && col2 < 4;
    }
    
    public static boolean cardsAlreadyGuessed(int row1, int col1, int row2, int col2, ArrayList<Card>... lists) {
        Card card1 = getCard(row1, col1, lists);
        Card card2 = getCard(row2, col2, lists);

        return card1.isGuessed() || card2.isGuessed();
    }
    
    public static Card getCard(int row, int col, ArrayList<Card>... lists) {
        return lists[row].get(col);
    }

}
