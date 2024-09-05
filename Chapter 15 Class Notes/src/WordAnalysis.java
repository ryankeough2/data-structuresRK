import java.io.*;
import java.util.*;

/**
 * This program checks which words in a file are not present in a dictionary.
*/
public class WordAnalysis
{
    public static void main(String[] args)
        throws FileNotFoundException
    {
        // Read the dictonary and novel file
        Set<String> dWords = readWords("Chapter 15 Class Notes/src/words");
        Set<String> novWords = readWords("Chapter 15 Class Notes/src/war-and-peace.txt");
        for(String word: novWords){
            if(!dWords.contains(word)){
                System.out.println(word);
            }
        }
        System.out.println("There are "+novWords.size()+" unique words in the novel");
        //print words with more than 3 letters
        Iterator<String> it = novWords.iterator();
        while(it.hasNext()){
            if(it.next().length() <=3){
                it.remove();
            }
        }
        System.out.println("There are "+novWords.size()+" unique words in the novel w/ more that 3 letters");
    }

    /**
     * Reads all words from a file.
     *
     * @param filename the name of the file
     * @return a set with all lowercased words in the file. Here, a
     * word is a sequence of upper- and lowercase letters.
    */
    public static Set<String> readWords(String filename)
        throws FileNotFoundException
    {
        //use a hast set (not tree) because order dont mattet
        Set<String> words = new HashSet<>();
        Scanner in = new Scanner(new File(filename), "UTF-8");

        //determine the current working directory
        //System.out.println(System.getProperty("user.dir"));

        //use any character that's mot a letter
        in.useDelimiter("[^a-zA-Z]+");
        while(in.hasNext()){
            words.add(in.next().toLowerCase());
        }//duplicates are ignored
        return words;
    }
}
