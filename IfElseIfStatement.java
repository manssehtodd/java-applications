// IfElseIfStatement.java
// How to use If-Else-If Statement
// Developer: Manasseh TODD

import java.util.Scanner;

public class IfElseIfStatement {
    public static void main(String[] args) {

        // Scanner object creation
        Scanner input = new Scanner(System.in);

        // Variable declaration
        int mark;
        String name;

        // Prompt user for input
        System.out.print("Enter your Fullname: ");
        name = input.nextLine();

        System.out.print("Enter your mark: ");
        mark = input.nextInt();

        // If-Else-If statement
        if (mark >= 90) {
            System.out.printf("Fullname: %s, Mark: %d. Your grade is A%n", name, mark);
        } else if (mark >= 80) {
            System.out.printf("Fullname: %s, Mark: %d. Your grade is B%n", name, mark);
        } else if (mark >= 70) {
            System.out.printf("Fullname: %s, Mark: %d. Your grade is C%n", name, mark);
        } else if (mark >= 50) {
            System.out.printf("Fullname: %s, Mark: %d. Your grade is D%n", name, mark);
        } else {
            System.out.printf("Fullname: %s, Mark: %d. Your grade is F. YOU FAIL.%n", name, mark);
        }

        input.close();
    }
}
