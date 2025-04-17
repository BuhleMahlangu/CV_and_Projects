
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.io.Serializable;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.lang.ClassNotFoundException;
import java.io.FileNotFoundException;

public class Main
{
    public static void main(String[] args) throws IOException, ClassNotFoundException, FileNotFoundException{
        User user = null;
        
        FileInputStream fileIn = new FileInputStream("C:\\Users\\User\\Desktop\\Serialization\\userInfo.ser");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        user = (User) in.readObject();
        in.close();
        fileIn.close();
        
        System.out.println(user.name);
        System.out.println(user.password);
        user.sayHello();
    }
}
