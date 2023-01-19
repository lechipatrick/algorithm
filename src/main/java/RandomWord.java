import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {


    public static void main(String[] args) {
        int i = 0;
        float p = 0;
        String champion = null;
        while (!StdIn.isEmpty()) {
            String next = StdIn.readString();
            i++;
            p = 1 / i;
            boolean chosen = StdRandom.bernoulli(p);
            if (chosen) {
                champion = next;
            }
        }
        System.out.println(champion);
    }
}


