
/**
 * Write a description of class MemoryGame here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.*;

public class MemoryGame
{
    public static void main(String[] args) {
        int gridSize = 4;
        Card[][] grid = new Card[gridSize][gridSize];
        List<Integer> values = generateRandomValues(gridSize * gridSize / 2);
        Collections.shuffle(values);

        int index = 0;
        for (int row = 0; row < gridSize; row++) {
            for (int col = 0; col < gridSize; col++) {
                int value = values.get(index);
                Card card = new Card(value);
                grid[row][col] = card;
                index++;
            }
        }
        
        playGame(grid);
    }
    
    private static List<Integer> generateRandomValues(int count) {
        List<Integer> values = new ArrayList<>();
        for (int i = 1; i <= count; i++) {
            values.add(i);
            values.add(i); 
        }
        return values;
    }
    
    private static void playGame(Card[][] grid) {
        Scanner scanner = new Scanner(System.in);
        int gridSize = grid.length * grid[0].length;
        int moves = 0;

        while (!allCardsGuessed(grid)) {
            printGrid(grid);

            System.out.print("Enter the row number: ");
            int row = scanner.nextInt();
            System.out.print("Enter the column number: ");
            int col = scanner.nextInt();

            Card selectedCard = grid[row][col];
            
            if (!selectedCard.isGuessed()) {
                selectedCard.setGuessed(true);
                moves++;
            }
        }

      System.out.println("Congratulations! You've won the game in " + moves + " moves.");
    }
    
    private static boolean allCardsGuessed(Card[][] grid) {
        for (Card[] row : grid) {
            for (Card card : row) {
                if (!card.isGuessed()) {
                    return false;
                }
            }
        }
        return true;
    }
    
    private static void printGrid(Card[][] grid) {
        for (Card[] row : grid) {
            for (Card card : row) {
                System.out.print(card + " ");
            }
            System.out.println();
        }
    }
}
