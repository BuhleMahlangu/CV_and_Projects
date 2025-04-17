
/**
 * Write a description of class Guess here.
 *
 * @author (BL Mahlangu 37751883)
 * @version (a version number or a date)
 */

import java.util.ArrayList;

public class Card
{
   private int val; 
   private boolean guessed;
   
   public Card(int i)
   {
      val=i;
      guessed=false;
   }
   public void setGuessed(boolean b)
   {
      guessed = b; 
   }
   public boolean isGuessed()
   {
      return guessed; 
   }
   
   public Integer getVal()
   {
      return val; 
   }
   
   
   @Override
   public boolean equals(Object e)
   {
       Card c=(Card)e;
       if(val==c.getVal())
       return true;
       else return false;
   }
   
   public int getCount(ArrayList<Card> cardList) {
        int count = 0;
        for (Card card : cardList) {
            if (this.equals(card)) {
                count++;
            }
        }
        return count;
    }
    
    public boolean isAllGuessed(ArrayList<Card> cardList) {
        for (Card card : cardList) {
            if (!card.isGuessed()) {
                return false;
            }
        }
        return true;
    }

    public static boolean isFull(ArrayList<Card> cardList) {
        return cardList.size() >= 4;
    }

   public String toString()
   {
       String r="";
       if(guessed)
        return r+val;
       else return r; 
   }
}
