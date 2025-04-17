
/**
 * Write a description of class part1 here.
 *
 * @author (BL Mahlangu 37751883)
 * @version (a version number or a date)
 */

import java.io.*;
import java.util.*;
import java.util.ArrayList;

public class part1
{
   public static void main(String args[])
    {
        ArrayList<Card> l1 = new ArrayList();
        
        Card c1 = new Card(1);
        Card c2 = new Card(2);
        Card c3 = new Card(3);
        Card c4 = new Card(4);
        Card c5 = new Card(1);
        Card c6 = new Card(1);
        
        c1.setGuessed(true);
        c2.setGuessed(true);
        c3.setGuessed(true);
        c4.setGuessed(true);
        c5.setGuessed(true);
        c6.setGuessed(true);
        
        l1.add(0,c1);
        l1.add(1,c2);
        l1.add(2,c3);
        l1.add(3,c4);
        l1.add(4,c5);
        
        
        System.out.println(l1);
        System.out.println(c6.getCount(l1));
    }   
}
