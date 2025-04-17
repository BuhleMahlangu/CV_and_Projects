
/**
 * Write a description of class Investment here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
import java.util.Scanner;
import java.lang.Math.*;

public class Investment
{
    public static void main(String[] args)
    {     
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the investment amount: ");
        double InvestAmount = scan.nextDouble();
        
        System.out.println("Enter the annual interest rate: ");
        double annualInterest = scan.nextDouble();
        
        System.out.println("Enter the number of years to invest: ");
        int numYears = scan.nextInt();
        
        double monthlyInterest = annualInterest / 1200.0;
        double futureInvestment = InvestAmount * Math.pow(1 + monthlyInterest,numYears*12);
        
        System.out.printf("The future investment value is: R %.2f", futureInvestment);
        
        scan.close();
    }
}
