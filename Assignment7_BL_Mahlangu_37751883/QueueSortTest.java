
/**
 * Write a description of class QueueSortTest here.
 *
 * @author (BL Mahlangu 37751883)
 * @version (a version number or a date)
 */
public class QueueSortTest
{
    public static void main(String[] args) {
        QueueAsMyLinkedList list1 = new QueueAsMyLinkedList();
        list1.enqueue(3);
        list1.enqueue(5);
        list1.enqueue(8);
        list1.enqueue(7);
        list1.enqueue(1);

        int size = 5;
        QueueAsMyLinkedList sortedList = method(list1, size);

        System.out.print("Sorted List: [");
        for (int i = 0; i < size; i++) {
            System.out.print(sortedList.dequeue());
            if (i < size - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static QueueAsMyLinkedList method(QueueAsMyLinkedList pl, int x) {
        if (x <= 1) {
            return pl;
        }

        QueueAsMyLinkedList sortedQueue = new QueueAsMyLinkedList();
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < x; i++) {
            int element = (int) pl.dequeue();
            if (element < min) {
                if (min != Integer.MAX_VALUE) {
                    pl.enqueue(min);
                }
                min = element;
            } else {
                pl.enqueue(element);
            }
        }

        sortedQueue.enqueue(min);

        pl = method(pl, x - 1);

        while (x > 1) {
            sortedQueue.enqueue(pl.dequeue());
            x--;
        }

        return sortedQueue;
    }

}
