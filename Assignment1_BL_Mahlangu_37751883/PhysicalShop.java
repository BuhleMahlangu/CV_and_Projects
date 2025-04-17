
/**
 * Write a description of class PhysicalShop here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PhysicalShop extends Shop
{
    private int customers;
    private double averagePurchases;
    
    public PhysicalShop(String name, String location, int customers, double averagePurchases){
        super(name, location);
        this.customers = customers;
        this.averagePurchases = averagePurchases;
    }
    
    public int getCustomers(){
        return customers;
    }
    
    public void setCustomers(int customers){
        this.customers = customers;
    }
    
    public double getAveragePurchases(){
        return averagePurchases;
    }
    
    public void setAveragePurchases(double averagePurchases){
        this.averagePurchases = averagePurchases;
    }
    
    @Override
    public double calcRevenue(){
        return customers * averagePurchases * 365;
    }
    
    @Override
    public String toString(){
        return super.toString() + ", Customers: " + customers + ", Average Purchases: R" + averagePurchases;
    }
}
