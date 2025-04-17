
/**
 * Write a description of class OnlineShop here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class OnlineShop extends Shop
{
    private double monthlySales;
    
    public OnlineShop(String name, String location, double monthlySales){
        super(name, location);
        this.monthlySales = monthlySales;
    }
    
    public double getMonthlySales(){
        return monthlySales;
    }
    
    public void setMonthlySales(double monthlySales){
        this.monthlySales = monthlySales;
    }
    
    @Override
    public double calcRevenue(){
        return monthlySales * 12;
    }
    
    @Override
    public String toString(){
        return super.toString() + ", Sales per month: R" + monthlySales;
    }
}
