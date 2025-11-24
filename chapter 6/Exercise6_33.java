
import java.util.*;

public class Exercise6_33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] topics = {
            "Climate Change", "Education", "Healthcare", "Poverty", "Human Rights"
        };

        int[][] responses = new int[5][10];

        for (int i = 0; i < topics.length; i++) {
            System.out.print("Rate '" + topics[i] + "' (1–10): ");
            int r = sc.nextInt();
            responses[i][r-1]++;
        }

        System.out.println("\nSummary Table:");
        for (int i = 0; i < 5; i++) {
            System.out.print(topics[i] + ": ");
            int total = 0, sum = 0;
            for (int j = 0; j < 10; j++) {
                System.out.print(responses[i][j] + " ");
                sum += responses[i][j] * (j+1);
                total += responses[i][j];
            }
            System.out.println(" Avg=" + (total>0 ? (double)sum/total : 0));
        }
    }
}
