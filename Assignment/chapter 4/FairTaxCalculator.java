import java.util.Scanner;

public class FairTaxCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] categories = {"Housing", "Food", "Clothing", "Transportation", "Education", "Healthcare", "Vacations"};
        double totalExpenses = 0.0;

        for (String category : categories) {
            System.out.print("Enter your " + category + " expenses: ");
            totalExpenses += input.nextDouble();
        }

        double fairTax = totalExpenses * 0.23;
        System.out.printf("\nYour total FairTax estimate is: ₦%.2f%n", fairTax);
        input.close();
    }
}
