
/**
 * Write a description of class Card here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Objects;

public class Card
{
    private int value;
    private boolean guessed;

    public Card(int value) {
        this.value = value;
        this.guessed = false;
    }

    public int getValue() {
        return value;
    }

    public boolean isGuessed() {
        return guessed;
    }
    
    public void setGuessed(boolean guessed) {
        this.guessed = guessed;
    }

    @Override
    public String toString() {
        if (guessed) {
            return Integer.toString(value);
        } else {
            return "X";
        }
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Card card = (Card) obj;
        return value == card.value;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
