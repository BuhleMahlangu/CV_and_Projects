
/**
 * Write a description of class Shop here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Shop
{
    protected String name;
    protected String location;
    protected double totalRevenue;
    
    public Shop(String name, String location){
        this.name = name;
        this.location = location;
        this.totalRevenue = 0.0;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getLocation(){
        return location;
    }
    
    public void setLocation(String location){
        this.location = location;
    }
    
    public double getTotalRevenue(){
        return totalRevenue;
    }
    
    public abstract double calcRevenue();
    
    @Override
    public String toString(){
        return "Name: " + name + ", Location: " + location;
    }
}
