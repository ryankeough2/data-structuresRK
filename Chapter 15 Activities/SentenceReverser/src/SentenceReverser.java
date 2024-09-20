import java.util.Scanner;
import java.util.Stack;

/**
 * Class for reversing the order of a sentence.
*/
public class SentenceReverser
{
    /**
     * Reverses the given sentence.
     *
     * @param sentence Sentence to be reversed.
     * @return reversed sentence.
    */
    public static String reverse(String sentence)
    {
    	Scanner scanner = new Scanner(sentence);
    	Stack<String> rev = new Stack<>();
        String reversed = "";
        // Complete this method. Use a Stack.
        while (scanner.hasNext())
        {
            String word = scanner.next();
            word = word.toLowerCase();
            if (word.contains("."))
            {
                word = word.substring(0, word.length() - 1);
                rev.push(word.substring(0, 1).toUpperCase() + word.substring(1));
                while (!(rev.empty())){
                    reversed += rev.pop() + " ";
                }
                reversed = reversed.substring(0, reversed.length() - 1);
                reversed += ". ";
            }
            else
                rev.push(word);
        }

        return reversed;
    }
}
