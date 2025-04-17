
/**
 * Write a description of class QueueSorter here.
 *
 * @author (BL Mahlangu 37751883)
 * @version (a version number or a date)
 */

import java.util.LinkedList;

public class QueueSorter<E>
{
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
