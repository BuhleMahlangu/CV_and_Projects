
/**
 * Write a description of class LinkedListQueue here.
 *
 * @author (BL Mahlangu 37751883)
 * @version (a version number or a date)
 */
public class LinkedListQueue
{
    private ListNode front;
    private ListNode rear;

    public void enqueue(String value) {
        ListNode newNode = new ListNode(value);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }
    
    public String dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        String value = front.value;
        front = front.next;
        return value;
    }

    public boolean isEmpty() {
        return front == null;
    }
}
