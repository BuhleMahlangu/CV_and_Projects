
/**
 * Write a description of class AnimalTest here.
 *
 * @author (BL Mahlangu 37751883)
 * @version (a version number or a date)
 */
import java.util.Arrays;

public class AnimalTest
{
    public static void main(String[] args) {
        Dog dog1 = new Dog("Buddy", 5, "Labrador");
        Cat cat1 = new Cat("Whiskers", 2, true);
        Dog dog2 = new Dog("Max", 3, "German Shepherd");

        // Create a MyLinkedList to store the animals
        MyLinkedList<Animal> animalList = new MyLinkedList<>();

        // Add animals to the linked list
        animalList.append(dog1);
        animalList.append(cat1);
        animalList.append(dog2);

        // Print the list of animals
        System.out.println("Animal List: " + animalList);

        // Access and manipulate animals in the list
        Animal firstAnimal = animalList.getFirst();
        System.out.println("First Animal: " + firstAnimal);

        // Remove an animal from the list
        animalList.delete(cat1);
        System.out.println("Animal List after removing cat: " + animalList);
    }
}
