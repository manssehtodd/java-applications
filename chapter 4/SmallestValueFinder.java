import java.util.Scanner;

public class SmallestValueFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of integers: ");
        int count = input.nextInt();

        int smallest = Integer.MAX_VALUE;

        for (int i = 1; i <= count; i++) {
            System.out.print("Enter integer " + i + ": ");
            int value = input.nextInt();
            if (value < smallest) {
                smallest = value;
            }
        }

        System.out.println("The smallest value is: " + smallest);
        input.close();
    }
}
