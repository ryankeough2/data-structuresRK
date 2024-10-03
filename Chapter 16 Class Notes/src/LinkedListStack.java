
import java.util.NoSuchElementException;


/**
 * An implementation of a stack as a sequence of nodes.
*/
public class LinkedListStack
{
    private Node first;

    /**
     * Constructs an empty stack.
    */
    public LinkedListStack()
    {
        first = null;
    }

    /**
     * Adds an element to the top of the stack.
     *
     * @param element the element to add
    */


    public void push(Object e)
    {
        Node newNode = new Node();
        newNode.data = e;
        newNode.next = this.first;
        this.first = newNode;// the same as addFirst() in linkedList
    }


    /**
        Removes the element from the top of the stack.
        @return the removed element
    */

    public Object pop()
    {
        if(isEmpty())
        {
            throw new NoSuchElementException();
        }
        Object e = this.first.data;
        this.first= this.first.next;
        return e;
    }


    /**
     * Checks whether this stack is empty.
     *
     * @return true if the stack is empty
    */
    public boolean isEmpty()
    {
        return this.first == null;
    }
    

    static class Node
    {
        public Object data;
        public Node next;
    }
}
