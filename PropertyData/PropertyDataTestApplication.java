
/**
 * Write a description of class PropertyDataTestApplication here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

public class PropertyDataTestApplication
{
    private static final int Max_Properties = 25;
    
    public static void main(String[] args){
        Property[] properties = new Property[Max_Properties];
        int propertyCount = 0;
        
        try(BufferedReader br = new BufferedReader(new FileReader("propertydata.txt"))){
            String line;
            
            if(data.length == 3){
                String propertyCode = data[0];
                String estateAgent = data[1];
                double sellingPrice = Double.parseDouble(data[2]);
                
                properties[propertyCount] = new SellProperty(propertyCode, estateAgent, sellingPrice);
                
            }
            else if (data.length == 4) {
                    // RentProperty object
                String propertyCode = data[0];
                String estateAgent = data[1];
                double rentPerMonth = Double.parseDouble(data[2]);
                int contractDuration = Integer.parseInt(data[3]);

                properties[propertyCount] = new RentProperty(propertyCode, estateAgent, rentPerMonth, contractDuration);
            }
            else{
                continue;
            }
            
            propertyCount++;
        }
        catch (IOException e){
            System.out.println("Error reading the property data file: " + e.getMessage());
        }
        catch (NumberFormatException e){
            System.out.println("Error parsing numeric data: " + e.getMessage());
        }
        
        for (int i = 0; i < propertyCount; i++) {
            System.out.println(properties[i]);
        }
    }

}
