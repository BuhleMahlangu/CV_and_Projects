
/**
 * Write a description of class booking here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class booking
{
    String surname;
    char typeRoom;
    int numNights;
    int dinners;
    String refCode;
    int numObjects;
    double calcCost;
    
    public booking(String surname, char typeRoom, int numNights, int dinners, String refCode, int NumObjects, double calcCost){
        this.surname = surname;
        this.typeRoom = typeRoom;
        this.numNights = numNights;
        this.dinners = dinners;
        this.refCode = refCode;
        this.numObjects = numObjects;
        this.calcCost = calcCost;
    }
    
    public String getSurname(){
        return surname;
    }
    
    public char getTypeRoom(){
        return typeRoom;
    }
    
    public int getNumNights(){
        return numNights;
    }
    
    public int getDinners(){
        return dinners;
    }
    
    public String getRefCode(){
        return refCode;
    }
    
    public int getNumObjects(){
        return numObjects;
    }
    
    public double getCalcCost(){
        return calcCost;
    }
    
    void setRefCode(){
        
    }
    
    void setDinners(){
        
    }
    
    
}
