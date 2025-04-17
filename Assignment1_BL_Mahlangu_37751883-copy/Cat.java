
/**
 * Write a description of class Cat here.
 *
 * @author (BL Mahlangu 37751883)
 * @version (a version number or a date)
 */
public class Cat extends Animal
{
    private boolean isIndoor;

    public Cat(String name, int age, boolean isIndoor) {
        super(name, age);
        this.isIndoor = isIndoor;
    }

    public boolean isIndoor() {
        return isIndoor;
    }

    public void setIndoor(boolean isIndoor) {
        this.isIndoor = isIndoor;
    }

    @Override
    public void makeSound() {
        System.out.println("The cat meows.");
    }
    
    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isIndoor=" + isIndoor +
                '}';
    }
}
