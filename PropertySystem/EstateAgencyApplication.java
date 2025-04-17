
/**
 * Write a description of class EstateAgencyApplication here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class EstateAgencyApplication
{
    public static void main(String[] args){
        EstateAgent agent1 = new EstateAgent("Agent1");
        EstateAgent agent2 = new EstateAgent("Agent2");
        
        Property property1 = new SellProperty("13121220", agent1, 750000.00);
        Property property2 = new RentProperty("24141815", agent2, 2000.00, 12);
        
        displayPropertyDetails(property1, 5.0);
        displayPropertyDetails(property2, 2.5);
    }
    
    private static void displayPropertyDetails(Property property, double commissionPercentage){
        System.out.println("Property Code: " + property.propertyCode);
        System.out.println("Assigned Agent: " + property.agent.getName());
        System.out.println("Total Amount: R " + property.calculateTotalAmount());
        System.out.println("Commission: R " + property.calculateCommission(commissionPercentage));
        System.out.println("-------------------------------------------------------------");
    }
}
