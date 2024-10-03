import java.util.NoSuchElementException;

/**
    Add a method firstToLast to this implementation of a queue.
    The method moves the element at the head of the queue to
    the tail of the queue. The element that was second in line
    will now be at the head.
*/
public class LinkedListQueue
{
    private Node head;
    private Node tail;

    /**
        Constructs an empty queue.
    */
    public LinkedListQueue()
    {
        head = null;
        tail = null;
    }

    /**
        Moves the head of the queue to the tail.
    */
    public void firstToLast()
    {
        if(empty()){
            throw new NoSuchElementException();
        }
        Node newNode = head;// creates a new node and assigns it to head
        head = head.next;//makes the head = to the next node in the list
        tail.next = newNode;//makes the tail lead to the old head 
        tail = newNode;//makes the old head the new tail
        tail.next = null;//makes sure the tail doesn't lead to the new head
    }

    /**
        Checks whether this queue is empty.
        @return true if this queue is empty
    */
    public boolean empty()
    {
        return head == null;
    }

    /**
        Adds an element to the tail of this queue.
        @param newElement the element to add
    */
    public void add(Object newElement)
    {
        if (tail == null)    // head must also be null
        {
            Node newNode = new Node();
            newNode.data = newElement;
            newNode.next = null;
            tail = newNode;
            head = newNode;
        }
        else
        {
            Node newNode = new Node();
            newNode.data = newElement;
            newNode.next = null;
            tail.next = newNode;
            tail = newNode;
        }
    }

    /**
        Removes an element from the head of this queue.
        @return the removed element
    */
    public Object remove()
    {
        if (head == null)
            return null;
        Object element = head.data;
        head = head.next;
        if (head == null)    // queue is empty
        {
            tail = null;
        }
        return element;
    }

    class Node
    {
        public Object data;
        public Node next;
    }
}
