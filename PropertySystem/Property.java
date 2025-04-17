
/**
 * Write a description of class Property here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Property
{
    protected String propertyCode;
    protected EstateAgent agent;
    
    public Property(String propertyCode, EstateAgent agent){
        this.propertyCode = propertyCode;
        this.agent = agent;
    }
    
    public abstract double calculateTotalAmount();
    public abstract double calculateCommission(double percentage);
}
