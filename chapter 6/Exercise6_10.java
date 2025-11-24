
import java.util.*;

public class Exercise6_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ranges = new int[9];
        System.out.println("Enter number of salespeople:");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter gross sales: ");
            double sales = sc.nextDouble();
            int salary = 200 + (int)(sales * 0.09);
            int index = (salary >= 1000) ? 8 : (salary - 200) / 100;
            ranges[index]++;
        }
        System.out.println("\nSalary Range Distribution:");
        String[] labels = {
            "$200–299","$300–399","$400–499","$500–599",
            "$600–699","$700–799","$800–899","$900–999","$1000 and over"
        };
        for (int i = 0; i < ranges.length; i++)
            System.out.println(labels[i] + ": " + ranges[i]);
    }
}
