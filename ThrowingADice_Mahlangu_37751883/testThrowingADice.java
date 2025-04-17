
/**
 * Write a description of class testThrowingADice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Random;

public class testThrowingADice
{
    public static void main(String[] args)
    {
        Random random = new Random();
        int numThrows = 0;
        
        while(numThrows < 10)
        {
            int value = random.nextInt(6) + 1;
            System.out.println(value);
            
            if(value == 6)
            {
                System.out.println("A 6 has been thrown within " + numThrows + " throws");
                break;
                
            }
            numThrows++;
            
        }
        if(numThrows == 10)
        {
            System.out.println("You have reached the maximum number of throws");
        }
    }
}
