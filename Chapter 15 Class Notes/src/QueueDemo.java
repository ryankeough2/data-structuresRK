import java.util.LinkedList;
import java.util.Queue;

/**
 * This program simulates a print queue. Note that documents are printed
 * in the same order as they are submitted.
*/
public class QueueDemo
{
    public static void main(String[] args)
    {
        //create a print que of strings using a linked list
        Queue<String> jobs = new LinkedList<>();

        
        //add some print jonbs
        jobs.add("Joe: q2er");
        jobs.add("Cathy: tsd");
        System.out.println("p: "+ jobs.remove());
        jobs.add("Joe: rtsd");
        jobs.add("Cathy: gl");
        jobs.add("Cathy: cigfft");
        System.out.println("p: "+jobs.remove());
        jobs.add("Boss: ctl");

        while(jobs.size() > 0){
            System.out.println("p: "+jobs.remove());
        }
    }
}
