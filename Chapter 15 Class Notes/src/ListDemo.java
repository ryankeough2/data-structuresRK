import java.util.*;
/**
 * This program demonstrates the LinkedList class
 * and ListIterator class.
*/
public class ListDemo
{
    public static void main(String[] args)
    {
         System.out.print("Output:\n");
         System.out.print("==================================\n"); 
         /*addlast method can be use to populate the list */
         LinkedList<String> staff = new LinkedList<>();
         staff.addLast("Tony");
         staff.addLast("Natasha");
         /*e == object */
         staff.addLast("Peter");
         staff.addLast("Gamora");
        // LIST IS CURRENTLY T-N-P-G
        // the listiterator method creates a new list iterator
        //that is posistioned at the head of the list
        //The | stands as the iterator
        ListIterator<String> iterator = staff.listIterator();//|T-N-P-G
        //The next method advances the iterator over the next element in the list
        iterator.next();//T|N-P-G
        //returns the element it went over so Tony
        
        //returns the element that the iterator passes over
        String avenger = iterator.next();//TN|PG
        System.out.println(avenger);
        //----------------------------------------------
        /*
         * the add method inserts an element at the iterator position
         * the iterator is then positioned after the element was added
         */                     //TN|PG
        iterator.add("Steve");//TNS|PG
        iterator.add("Clint");//TNSC|PG
        //--------------------------------------------
        //the remove method removes the element by the last call to next or previous.
        //iterator.remove( ); gives an illegal state exception 
        // HAVE to call the next or previous AGAIN before you remove: if there is a .add or another method that moves the placement of the iterator
        iterator.next();//TNSCP|G
        iterator.remove( );//TNSC|G
        // cannot .remove 2x in a row
        //removes the object BEHIND the iterator

        // SET METHOD:------------------------------------------
        // updates the element by the last call to next or previous // meaning you have to add another next or prev
        iterator.previous();//TNS|CG
        // since the iterator passed over clint then that is what it "sets"
        iterator.set("T'Chala");//TNS|TG
        

        // HASNEXT METHOD:---------------------------
        // used to determine if there is next node after the iterator. OFTEN USED WITH WHILE LOOPS
        iterator = staff.listIterator();// |TNSTG
        while(iterator.hasNext()){
            String n = iterator.next();
            if(n.equals("Natasha"))// AT THIS POINT IT WOULD BE TN|STG
            { iterator.remove();}//do not have to worry about the iterator moving. it stays the same after removing obj.
        }

        // enhanced for loops work with linked lists
        for(String n : staff){
            System.out.println(n+" ");

        }
        System.out.println();
        //ConcurrentModificationException
        // YOU Cant modify a linked list while using an iterator unless : you use the iterator to do the modification
        iterator = staff.listIterator();// |TSTG
        while(iterator.hasNext()){
            String n = iterator.next();
            if(n.equals("Tony")){
               // staff.remove("Tony"); gives a ConcurrentModificationException
              // iterator.remove();
            }
        }
        // THE enhanced for loop creates a iterator
        for(String n : staff){//dont get access to the iterator : cannot add or remove when using wierd forloop
            if(n.equals("Tony"))
            {
                iterator.add("Bruce");
            }
        }
        
        //Prints out the linked list in brackets[x,y,z]
        System.out.println(staff);
        System.out.print("==================================\n");
       


    }
}
