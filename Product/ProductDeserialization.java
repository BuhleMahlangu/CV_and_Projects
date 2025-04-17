
/**
 * Write a description of class ProductDeserialization here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ProductDeserialization
{
    public static void main(String[] args){
        try{
            double totalCost = 0;
            int totalWeight = 0;
            
            FileInputStream fileIn = new FileInputStream("products.ser");
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            
            while(true){
                try{
                    Product product = (Product) objectIn.readObject();
                    
                    System.out.println("Barcode: " + product.getBarcode() + ", Name: " + product.getName() + ", Cost: R" + String.format("%.2f", product.calculateCost() / 100.0));
                    
                    totalCost += product.calculateCost();
                    
                    if(product instanceof WeightBasedProduct){
                        totalWeight += ((WeightBasedProduct) product).getWeight();
                    }
                }
                catch (ClassNotFoundException e){
                    break;
                }
            }
            objectIn.close();
            fileIn.close();
            
            System.out.println("End of file reached.");
            System.out.println("Total cost of products: R" + String.format("%.2f", totalCost / 100.0));
            System.out.println("Total wieght of weight-based products: " + totalWeight + " grams");
                
        }
        catch (IOException e){
            e.printStackTrace();
        }
        
    }
}
