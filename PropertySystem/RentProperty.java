
/**
 * Write a description of class RentProperty here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RentProperty extends Property
{
    private double monthlyRent;
    private int contractDuration;
    
    public RentProperty(String propertyCode, EstateAgent agent, double monthlyRent, int contractDuration){
        super(propertyCode, agent);
        this.monthlyRent = monthlyRent;
        this.contractDuration = contractDuration;
    }
    
    @Override
    public double calculateTotalAmount(){
        return monthlyRent * contractDuration;
    }
    
    @Override
    public double calculateCommission(double percentage){
        return monthlyRent * (percentage / 100.0);
    }
}
