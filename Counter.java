// Developer: Manasseh Todd
// Program: Counter.java
import java.util.Scanner;

public class Counter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int positiveCount = 0;
        int negativeCount = 0;
        int zerosCount = 0;

        System.out.println("=== WELCOME TO COUNTER ===");
        System.out.println("Enter -1 to terminate the loop");

        while (true) {
            System.out.print("Enter a number: ");
            int number = input.nextInt();

            // Exit check before counting
            if (number == -1) {
                break;
            }

            if (number > 0) {
                positiveCount++;
            } else if (number < 0) {
                negativeCount++;
            } else {
                zerosCount++;
            }
        }

        System.out.println("\n=== FINAL RESULT ===");
        System.out.printf("Total positive: %d%n", positiveCount);
        System.out.printf("Total negative: %d%n", negativeCount);
        System.out.printf("Total zeros: %d%n", zerosCount);

        input.close();
    }
}
