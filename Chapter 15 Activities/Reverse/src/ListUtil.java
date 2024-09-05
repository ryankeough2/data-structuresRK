
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
        LinkedList<String> rev =(LinkedList) strings.clone();

        for(int i = strings.size()- 1, j = 0;j<strings.size();j++, i-- ){
            String var = rev.get(i);
            strings.set(j,var);
        }
        
    }
}