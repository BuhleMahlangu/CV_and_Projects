
/**
 * Write a description of class Part1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.io.*;

public class Part1
{
    private int value;
    private boolean guessed;
    
    public Part1(int value){
        this.value = value;
        this.guessed = false;
    }
    
    public int getValue(){
        return value;
    }
    
    public boolean isGuessed(){
        return guessed;
    }
    
    public void setGuessed(boolean guessed){
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
    public boolean equals(Object obj){
        if(this==obj) return true;
        if(obj==null || getClass() != obj.getClass()) return false;
        
        Part1 part1 = (Part1) obj;
        return value == part1.value;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(value);
    }    
}
