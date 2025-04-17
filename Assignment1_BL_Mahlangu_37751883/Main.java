
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String[] args){
        Shop onlineShop = new OnlineShop("Takealot", "www.takealot.com", 10000.0);
        Shop physicalShop = new PhysicalShop("Mr Price", "3 Col Gordon St Vanderbijlpark", 200, 50.0);
        
        Shop[] shops = {onlineShop, physicalShop};
        
        for(Shop shop : shops){
            System.out.println("Online Shop: " + shop); 
            System.out.println("Physical Shop: " + shop.toString()); 
            System.out.println("Annual Revenue: $" + shop.calcRevenue());
            System.out.println("Annual Revenue: R" + shop.calcRevenue());
            System.out.println();
        }
    }
}
