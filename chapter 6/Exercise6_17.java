
import java.util.*;

public class Exercise6_17 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] sums = new int[13];
        for (int i = 0; i < 36000000; i++) {
            int d1 = 1 + r.nextInt(6);
            int d2 = 1 + r.nextInt(6);
            sums[d1 + d2]++;
        }
        for (int i = 2; i <= 12; i++)
            System.out.println(i + ": " + sums[i]);
    }
}
