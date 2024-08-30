
import java.util.LinkedList;
/**
 * This class supplies a utility method to reverse the entries in a linked list.
*/
public class ListUtil
{
    /**
     * Reverses the elements in a linked list
     *
     * @param strings the linked list to reverse
    */
    public static void reverse(LinkedList<String> strings)
    {
        LinkedList<String> rev = strings;
        //cycles through LL rev to the end
/*          
 * i=3 j=0  Dick - Tom
 * i=2 j=1  Harry - Romeo
 * i=1 j=2
 * i=0 j=3
 */

        
        for(int i = strings.size()- 1, j = 0;j<strings.size();j++, i-- ){
            String var = rev.get(i);
            System.out.println(var);
            strings.set(j,var);
        }
       
    }
}