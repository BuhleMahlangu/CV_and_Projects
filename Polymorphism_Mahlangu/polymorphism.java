
/**
 * Write a description of class polymorphism here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

class Cars{
    public void startCar(){
        System.out.println("Car just started.");
    }
}

class BMW extends Cars{
    
    private String name = "BMW";
    
    public String getCarName(){
        return name;
    }
}

class VW extends Cars{
    public void getCarName(){
        System.out.println("Car is VW.");
    }
}
public class polymorphism
{
    public static void main(String[] args){
        
        BMW car1 = new BMW();
        VW car2 = new VW();
        
        System.out.println("Car is " + car1.getCarName());
        car1.startCar();
        
        car2.getCarName();
        car2.startCar();
    }
}
