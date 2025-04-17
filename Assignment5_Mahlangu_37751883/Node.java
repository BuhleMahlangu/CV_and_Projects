
/**
 * Write a description of class Node here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Node<E>
{
    E element;
    Node<E> next;

    public Node(E element) {
        this.element = element;
        next = null;
    }
}
