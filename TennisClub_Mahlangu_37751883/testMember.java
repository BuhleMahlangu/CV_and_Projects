
/**
 * Write a description of class testMember here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class testMember
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        
        System.out.println("Enter the number of matches won: ");
        int matches = sc.nextInt();
        
        Member theMember = new Member(name, age);
        theMember.setMatches(matches);
        
        System.out.println(theMember.toString());
        
        String category = theMember.determineCategory();
        String rating = theMember.determineRating();
        
        System.out.println("Category: " + category);
        System.out.println("Rating: " + rating);
    }
}
