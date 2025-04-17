
/**
 * Write a description of class integers here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class integers
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int digit, integer;
        System.out.println("Enter 3 digits: ");
        digit = sc.nextInt();
    
        int sum = 0;
        
        while(digit > 0)
        {
            integer = digit % 10;
            sum = sum + integer;
            digit = digit / 10;
        }
        System.out.println("The sum of the digits is " + sum);
        
    }
    
}
