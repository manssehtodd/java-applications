// SwitchCaseStatement.java
// Demonstrates how to use switch-case in Java
// Developer: Manasseh TODD

import java.util.Scanner;

public class SwitchCaseStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int mark;
        String name;

        System.out.print("Enter your Full name: ");
        name = input.nextLine();

        System.out.print("Enter your mark: ");
        mark = input.nextInt();

        switch (mark / 10) {
            case 10: // 100
            case 9:
                System.out.printf("FullName: %s, Mark: %d - Your grade is A%n", name, mark);
                break;

            case 8:
                System.out.printf("FullName: %s, Mark: %d - Your grade is B%n", name, mark);
                break;

            case 7:
                System.out.printf("FullName: %s, Mark: %d - Your grade is C%n", name, mark);
                break;

            case 6:
                System.out.printf("FullName: %s, Mark: %d - Your grade is D%n", name, mark);
                break;

            case 5:
                System.out.printf("FullName: %s, Mark: %d - Your grade is E%n", name, mark);
                break;

            default:
                System.out.printf("FullName: %s, Mark: %d - Your grade is F (Fail)%n", name, mark);
                break;
        }

        input.close();
    }
}
