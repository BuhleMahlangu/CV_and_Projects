
/**
 * Write a description of class User here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.io.Serializable;

public class User implements Serializable
{
    String name;
    String password;
    
    public void sayHello(){
        System.out.println("Hello " + name);
    }
}
