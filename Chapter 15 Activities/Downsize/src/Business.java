import java.util.LinkedList;

/**
 * Business utility methods.
*/
public class Business
{
  
    public static void downsize(LinkedList<String> employeeNames, int n)
    {
        int counter = 0;
        ListIterator<String> iterator = employeeNames.listIterator();
        while (iterator.hasNext())
        {
            iterator.next();
            counter++;
            if (counter % n == 0)
                iterator.remove();
        }
    }
}
