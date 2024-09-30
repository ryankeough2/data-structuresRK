import java.util.NoSuchElementException;

/**
 * A linked list is a sequence of nodes with efficient
 * element insertion and removal. This class
 * contains a subset of the methods of the standard
 * java.util.LinkedList class.
*/
public class LinkedList
{
    private Node first;
    //first refers to the first node of the list
    //if the list is empty first = null

    /**
        Constructs an empty linked list.
    */
    
    public LinkedList()
    {
        this.first = null;
    }


    /**
        Returns the first element in the linked list.
        @return the first element in the linked list
    */

    public Object getFirst()
    {   
        if(this.first == null){
            throw new NoSuchElementException();
        }
            
        
        return this.first.data;
        
    }


    /**
        Removes the first element in the linked list.
        @return the removed element
    */

    public Object removeFirst()
    {
        if(this.first == null){
            throw new NoSuchElementException();
        }
        Object el = this.first.data;
        this.first = this.first.next;
        return el;
    }



    /**
        Adds an element to the front of the linked list.
        @param element the element to add
    */
    public void addFirst(Object e)
    {
        Node newNode = new Node();
        newNode.data = e;
        newNode.next = this.first;
        this.first = newNode;
    }




    /**
        Returns an iterator for iterating through this list.
        @return an iterator for iterating through this list
    */
    public ListIterator listIterator(){
        return new LinkedListIterator();
    }




    //Class Node
    static class Node{//static b/c it does not need access to anything in linked list
        public Node next;
        public Object data;


    }

    class LinkedListIterator implements ListIterator // gives error if you don't implement the implements
    {
      //private data

        private Node position;
        private Node previous; 
        private boolean isAfterNext;

        //^ in case you need to remove it

        /**
            Constructs an iterator that points to the front
            of the linked list.
        */
        public LinkedListIterator()
        {
            position = null;
            previous = null;
            isAfterNext =false;
        }
        /**
            Moves the iterator past the next element.
            @return the traversed element
        */
        public Object next(){
            isAfterNext= true;
            if(!hasNext()){
                throw new NoSuchElementException();
            }
            previous = position;
            
            if(position == null){
                position = first;
            }
            else{
                position = position.next;
            }

            return position.data;
        }




        /**
            Tests if there is an element after the iterator position.
            @return true if there is an element after the iterator position
        */
        public boolean hasNext(){
            if(position == null){//iterator hasn't moved
                return first != null;
            }

            //iterator has moved
            return position.next != null;
        }


        /**
            Adds an element before the iterator position
            and moves the iterator past the inserted element.
            @param element the element to add
        */

        public void add(Object e){
            
            //check if the iterator is at the begining
            if(position == null){
                addFirst(e);
                position = first;
            }
            else{
                Node newNode = new Node();
                newNode.data = e;//sets the newNode to haver the value of the object
                newNode.next = position.next;//sets the newNode to have the next address to the next addreass of the current posiution
                //set the next element of the current position to point to our new node
                position.next = newNode;//changes the next of the current position to the newNode
                position = newNode;//changes the position to be the new node
            }
            isAfterNext= false;
        }




        /**
            Removes the last traversed element. This method may
            only be called after a call to the next() method.
        */

        public void remove(){
            if(!isAfterNext){
                throw new IllegalStateException();
            }
            if(position == first)
            {   
                removeFirst();
                position = null;
            }
            else{
                previous.next = position.next;//changes the previous to point to the node after the position
                position = previous;//changes position to the previous position
                
            }
            isAfterNext= false;
        }





        /**
            Sets the last traversed element to a different value.
            @param element the element to set
        */
        public void set(Object e){
            if(!isAfterNext){
                throw new IllegalStateException();
            }
            position.data = e;
        }



    }//LinkedListIterator
    public String toString(){
        String data  = "[";
        ListIterator it = listIterator();
        while(it.hasNext()){
            data +=  it.next() +", ";
        }
        data += "]"
        return data;
    }
}//LinkedList
