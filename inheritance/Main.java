
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String[] args){
        Car car = new Car();
    
        car.go();
        
        Bicycle bike = new Bicycle();
        
        bike.stop();
        
        System.out.println(car.speed);
        System.out.println(bike.speed);
        
        System.out.println(car.wheels);
        System.out.println(car.doors);
        
        System.out.println(bike.pedals);
    }
    
}
