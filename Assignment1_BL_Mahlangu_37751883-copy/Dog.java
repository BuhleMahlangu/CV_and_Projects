
/**
 * Write a description of class Dog here.
 *
 * @author (BL Mahlangu 37751883)
 * @version (a version number or a date)
 */
public class Dog extends Animal implements Comparable<Dog>
{
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("The dog barks.");
    }
    
    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", breed='" + breed + '\'' +
                '}';
    }
    
    @Override
    public int compareTo(Dog otherDog) {
        return this.breed.compareTo(otherDog.breed);
    }
}
