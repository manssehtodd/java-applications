// ElectricBilling.java
import java.util.Scanner;

enum CustomerType { REGULAR, BUSINESS, VIP }

public class ElectricBilling {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name;
        int units;
        CustomerType type;

        System.out.print("Enter customer name: ");
        name = input.nextLine();

        System.out.print("Enter units consumed: ");
        units = input.nextInt();
        input.nextLine(); // consume leftover newline

        System.out.print("Enter customer type (REGULAR, BUSINESS, VIP): ");
        String typeInput = input.nextLine();
        type = CustomerType.valueOf(typeInput.toUpperCase());

        double totalBill = calculateBill(units, type);

        System.out.println("Final Total Bill = #" + totalBill);
    }

    // Correct method signature
    public static double calculateBill(int units, CustomerType type) {

        int pricePerUnit;
        int totalAmount = 0;
        int blockSize = 50;
        int processedUnits = 0;

        // Determine unit price
        if (units <= 100) {
            pricePerUnit = 30;
        } else if (units <= 300) {
            pricePerUnit = 25;
        } else {
            pricePerUnit = 20;
        }

        // Loop through blocks of 50 units
        while (processedUnits < units) {
            int remaining = units - processedUnits;

            int currentBlock;
            if (remaining >= blockSize) {
                currentBlock = blockSize;
            } else {
                currentBlock = remaining;
            }

            int blockCost = currentBlock * pricePerUnit;
            totalAmount += blockCost;

            System.out.println(
                "Units " + (processedUnits + 1) +
                " to " + (processedUnits + currentBlock) +
                " = #" + blockCost
            );

            processedUnits += currentBlock;
        }

        // Determine discount rate based on customer type
        double discountRate;

        switch (type) {
            case REGULAR:
                discountRate = 0;
                break;
            case BUSINESS:
                discountRate = 0.05;
                break;
            case VIP:
                discountRate = 0.10;
                break;
            default:
                discountRate = 0;
        }

        double discountAmount = totalAmount * discountRate;
        double finalBill = totalAmount - discountAmount;

        System.out.printf("Discount Applied = #%.2f%n", discountAmount);

        return finalBill;
    }
}
