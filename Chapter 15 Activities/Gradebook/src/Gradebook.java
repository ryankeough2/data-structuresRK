import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * A program to add, remove, modify or print
 * student names and grades.
*/
public class Gradebook
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        Map<String, String> grades = new HashMap<>();
        boolean done = false;
        while(!done)
        {
            System.out.println("A)dd R)emove M)odify P)rint Q)uit");
            String input = in.next().toUpperCase();
            in.nextLine();
            Set<String> keys = grades.keySet();
            if (input.equals("Q"))
            {
                done = true;
            } else if (input.equals("A"))
            {
                
                System.out.println("What is the name? ");
                String name = in.nextLine();
                System.out.println("What is the grade? ");
                String grade = in.nextLine();
                grades.put(name,grade);

            } else if (input.equals("R"))
            {
                System.out.println("WHo do you wnat to remove?");
                String name = in.nextLine();
                if(grades.containsKey(name)) {
                    System.out.println("Removing " + name);
                    grades.remove(name);
                } else {
                    System.out.println("Could not find name");
                }
                
            } else if (input.equals("M"))
            {
               
                System.out.println("Who do you want to modify");
                String name = in.nextLine();
                System.out.println("What is the new grade? ");
                String grade = in.nextLine();

                if(grades.containsKey(name)) {
                    grades.put(name, grade);
                } else {
                    System.out.println("Could not find name");
                }

            } else if (input.equals("P"))
            {
                for(String name : keys)
                {
                    System.out.println(name + ": "+grades.get(name) );
                }

            } else
            {
                done = true;
            }
        }
    }
}
