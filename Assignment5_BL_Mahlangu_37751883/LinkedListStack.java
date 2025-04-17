
/**
 * Write a description of class LinkedListStack here.
 *
 * @author (BL Mahlangu 37751883)
 * @version (a version number or a date)
 */
public class LinkedListStack
{
    private ListNode top;

    public void push(String value) {
        ListNode newNode = new ListNode(value);
        newNode.next = top;
        top = newNode;
    }

    public String pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        String value = top.value;
        top = top.next;
        return value;
    }
    
    public boolean isEmpty() {
        return top == null;
    }
}
