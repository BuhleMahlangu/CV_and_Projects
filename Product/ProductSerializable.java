
/**
 * Write a description of class ProductSerializable here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.io.Serializable;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ProductSerializable
{
    public static void main(String[] args){
        try{
            Product[] products = new Product[25];
            int productCount = 0;
            
            FileOutputStream fileOut = new FileOutputStream("products.ser");
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            
            for(int i = 0; i < productCount; i++){
                objectOut.writeObject(products[i]);
            }
            
            objectOut.close();
            fileOut.close();
            System.out.println("Serialization complete. Objects saved to products.ser file.");
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
