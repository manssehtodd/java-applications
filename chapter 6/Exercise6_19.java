
import java.util.*;

public class Exercise6_19 {
    public static void main(String[] args) {
        int[][] sales = new int[5][4];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter entries as: salesperson(1-4) product(1-5) value, or -1 to end");
        while (true) {
            int p = sc.nextInt();
            if (p == -1) break;
            int prod = sc.nextInt();
            int val = sc.nextInt();
            sales[prod-1][p-1] += val;
        }

        for (int i = 0; i < 5; i++) {
            int rowTotal = 0;
            for (int j = 0; j < 4; j++) {
                System.out.print(sales[i][j] + "\t");
                rowTotal += sales[i][j];
            }
            System.out.println("= " + rowTotal);
        }
    }
}
