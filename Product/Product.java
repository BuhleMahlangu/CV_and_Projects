
/**
 * Write a description of class Product here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.io.Serializable;

public abstract class Product implements Serializable, Comparable<Product>
{
    private String barcode;
    private String name;
    private int unitPrice;
    
    public Product(String barcode, String name, int unitPrice){
        this.barcode = barcode;
        this.name = name;
        this.unitPrice = unitPrice;
    }
    
    public abstract int calculateCost();
    
    public int getUnitPrice(){
        return unitPrice;
    }
    
    public String getBarcode(){
        return barcode;
    }
    
    public String getName(){
        return name;
    }
    
    @Override
    public int compareTo(Product other){
        return this.name.compareTo(other.name);
    }
}


