
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList<>();
        list.append("peep");
        list.append("car");
        list.append("rat");
        list.append("otto");

        // Check if each string in the list is a palindrome
        boolean[] results = new boolean[list.size()];
        Node<String> current = list.getHead(); // Use the getHead method
        for (int i = 0; i < results.length; i++) {
            results[i] = current.isPalindrome();
            current = current.next;
        }

        // Print the results
        System.out.println(Arrays.toString(results));
    }
}
