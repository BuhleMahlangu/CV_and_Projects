
/**
 * Write a description of class SellProperty here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SellProperty extends Property
{
    private double sellingPrice;
    
    public SellProperty(String propertyCode, EstateAgent agent, double sellingPrice){
        super(propertyCode, agent);
        this.sellingPrice = sellingPrice;
    }
    
    @Override
    public double calculateTotalAmount(){
        double taxAmount = 0.0;
        if(sellingPrice > 1000000.00){
            taxAmount = 0.15 * sellingPrice;
        }
        else if(sellingPrice >= 500000.00){
            taxAmount = 0.10 * sellingPrice;
        }
        return sellingPrice + taxAmount;
    }
    
    @Override
    public double calculateCommission(double percentage){
        return calculateTotalAmount() * (percentage / 100.0);
    }
}
