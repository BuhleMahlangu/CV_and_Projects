
/**
 * Write a description of class ItemBasedProduct here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ItemBasedProduct extends Product
{
    private String manufacturer;
    
    public ItemBasedProduct(String barcode, String name, int unitPrice, String manufacturer){
        super(barcode, name, unitPrice);
        this.manufacturer = manufacturer;
    }
    
    public String getManufacturer(){
        return manufacturer;
    }
    
    @Override
    public int calculateCost(){
        double cost = getUnitPrice()*1.15;
        return (int) Math.round(cost);
    }
}
