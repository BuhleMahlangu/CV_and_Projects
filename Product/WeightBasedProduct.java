
/**
 * Write a description of class WeightBasedProduct here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WeightBasedProduct extends Product
{
    private int weight;
    
    public WeightBasedProduct(String barcode, String name, int unitPrice, int weight){
        super(barcode, name, unitPrice);
        this.weight = weight;
    }
    
    public int getWeight(){
        return weight;
    }
    
    @Override
    public int calculateCost(){
        double cost = (getUnitPrice() * weight / 1000) * 1.15;
        return (int) Math.round(cost);
    }
    
}
