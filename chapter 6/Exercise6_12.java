
import java.util.*;

public class Exercise6_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] unique = new int[5];
        int count = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number (10–100): ");
            int num = sc.nextInt();
            boolean exists = false;

            for (int j = 0; j < count; j++)
                if (unique[j] == num) exists = true;

            if (!exists) unique[count++] = num;

            System.out.print("Unique values: ");
            for (int j = 0; j < count; j++)
                System.out.print(unique[j] + " ");
            System.out.println();
        }
    }
}
