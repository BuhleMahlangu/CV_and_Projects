
/**
 * Write a description of class LinkedListPalindromeChecker here.
 *
 * @author (BL Mahlangu 37751883)
 * @version (a version number or a date)
 */
public class LinkedListPalindromeChecker
{
    public static boolean[] isPalindrome(String[] strings) {
        boolean[] result = new boolean[strings.length];

        for (int i = 0; i < strings.length; i++) {
            String str = strings[i];
            LinkedListStack stack = new LinkedListStack();
            LinkedListQueue queue = new LinkedListQueue();

            for (char c : str.toCharArray()) {
                String charStr = String.valueOf(c);
                stack.push(charStr);
                queue.enqueue(charStr);
            }

            boolean isPalindrome = true;
            while (!stack.isEmpty() && !queue.isEmpty()) {
                if (!stack.pop().equals(queue.dequeue())) {
                    isPalindrome = false;
                    break;
                }
            }
            
            result[i] = isPalindrome;
        }

        return result;
    }
    
    public static void main(String[] args) {
        String[] input = {"peep", "car", "rat", "otto"};
        boolean[] palindromeResults = isPalindrome(input);

        for (boolean isPalin : palindromeResults) {
            System.out.println(isPalin);
        }
    }
}
