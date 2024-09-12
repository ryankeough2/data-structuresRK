import java.util.*;

/**
 * A program that implements the sieve of Eratosthenes.
*/
public class Sieve
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Compute primes up to which integer?");
        int n = in.nextInt();

        // Your work goes here
        Set<Integer> son = new HashSet<Integer>();

        for(int i = 2; i < n;i++)
        {
            son.add(n);
        }

        for(int i = 2; i*i <= n;i++){
            for(int h = 2; h*i <= n; h++)
                son.remove(i);
        }

        System.out.println(son)
;



    }
}
