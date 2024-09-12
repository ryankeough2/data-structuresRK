import java.awt.Color;
import java.util.*;
/**
    This program demonstrates a map that maps names to colors.
*/
public class MapDemo
{
    public static void main(String[] args)
    {
        //map interface is generic
        //the first type given is the type of the key.
        //the second type given is the type of the value
        Map<String, Color> favColors = new HashMap<>();
        
        //add elements to the map using
        favColors.put("Henry", Color.BLUE);
        favColors.put("Jack", Color.RED);
        favColors.put("Priya", Color.GREEN);

        //can have 2 of the same value
        favColors.put("Dr. Miller", Color.GREEN);
        //cant have 2 of the same key
        //using \/ would change the value
        favColors.put("Jack", Color.MAGENTA);

        //can create a set of keys in a map
        Set<String> keys = favColors.keySet();
        for(String key: keys){
            System.out.println(key+ " (" + key.hashCode() + ") " + favColors.get(key));
        }



        
    }
}
