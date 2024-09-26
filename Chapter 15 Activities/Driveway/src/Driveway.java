import java.util.Stack;

/**
 * Class for simulating a driveway and a street, using stacks
 * of cars with license plate numbers as representation.
*/
public class Driveway
{
    /**
      * Stack representing the cars in the driveway.
    */
    private Stack<Integer> driveway;
    /**
      * Stack representing the cars in the street.
    */
    private Stack<Integer> street;

    /**
      * Constructor.
    */
    public Driveway()
    {
        // Complete the constructor
        driveway = new Stack<>();
        street = new Stack<>();


    }

    /**
      * Add the given license plate to the driveway.
      *
      * @param licensePlate number of license plate.
    */
    public void add(int licensePlate)
    {
        // Complete this method
        int lp = driveway.push(licensePlate);
        

    }

    /**
      * Remove the given license plate from the driveway.
      *
      * @param licensePlate number of license plate.
    */
    public void remove(int licensePlate)
    {
        // Complete this method
        while(!(driveway.peek() == licensePlate))
        {
            int car = driveway.pop();
           /// System.out.println("temp removed: " + car);
            street.push(car);
      
            
        }

        int remcar = driveway.pop();
        //System.out.println("perm removed: " + remcar);
        
        
        for(int i = 0; i < street.size();i++)
        {
            int car = street.pop();
            //System.out.println("added: " + car);
            driveway.push(car);
        }
        int car = street.pop();
        driveway.push(car);
        System.out.println("DONE");
    }

    /**
      * Prints the driveway and street details to the screen.
    */
    public void print()
    {
        System.out.println("In Driveway, starting at first in (one license plate per line):");
        // Print the cars in the driveway here
        int dSize = driveway.size();
        int sSize = street.size();
        if(!driveway.empty()){
        for(int i = 0; i < dSize;i++)
        {
          System.out.println(driveway.pop());
        }}
        else {System.out.println("Driveway is empty");}

        System.out.println("In Street, starting at first in (one license plate per line):");
        // Print the cars in the street here
        
        if(!street.empty()){
        for(int i = 0; i < sSize;i++)
        {
          System.out.println(street.pop());
        }}
        else  {System.out.println("STREET IS EMPTY");}
    }
}
