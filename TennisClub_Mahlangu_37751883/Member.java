
/**
 * Write a description of class Member here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Member
{
    private String name;
    private int age;
    private int matches;
    
    public Member(){}
    
    public Member(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    public String getName(){
        return name;
    }
    
    public int getAge(){
        return age;
    }
    
    public int getMatches(){
        return matches;
    }
    
    public void setMatches(int matches){
        this.matches = matches;
    }
    
    public String determineCategory(){
        if(age < 16){
            return "Junior";
        }
        else if(age > 45){
            return "Retired";
        }
        else{
            return "Senior";
        }
    }
    
    public String determineRating(){
        switch(matches){
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return "E";
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                return "D";
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                return "C";
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
                return "B";
            default:
                return "A";
        }
    }
    
    @Override
    public String toString(){
        return "Name: " + name + "\nAge: " + age + "\nNumber of matches won: " + matches;
    }
}
