//JAVA PROJECT BY MANASSEH TODD.

import java.util.Scanner;

public class SimpleBankingSys {

    static Scanner input = new Scanner(System.in);

    static final int MAX_USERS = 10;
    static String[] usernames = new String[MAX_USERS];
    static String[] passwords = new String[MAX_USERS];
    static double[] balances = new double[MAX_USERS];

    static int userCount = 0;
    static int loggedInIndex = -1;

    public static void main(String[] args) {

        System.out.println("Hello, Welcome to TODD's banking society.");

        int choice;

        do {
            System.out.println("\n1. Create account");
            System.out.println("2. Login");
            System.out.println("3. Exit");

            System.out.print("Choose (1-3): ");
            choice = input.nextInt();

            if (choice == 1) {
                createAccount();
            } else if (choice == 2) {
                login();
                if (loggedInIndex != -1) {
                    bankMenu();
                }
            } else if (choice == 3) {
                System.out.println("Thank you for using the system.");
            } else {
                System.out.println("INVALID CHOICE");
            }

        } while (choice != 3);
    }

    static void createAccount() {
        if (userCount == MAX_USERS) {
            System.out.println("Maximum users reached.");
            return;
        }

        System.out.print("Enter username: ");
        usernames[userCount] = input.next();

        System.out.print("Enter password: ");
        passwords[userCount] = input.next();

        balances[userCount] = 0.0;
        userCount++;

        System.out.println("Account created successfully.");
    }

    static void login() {
        System.out.print("Enter username: ");
        String inputUsername = input.next();

        System.out.print("Enter password: ");
        String inputPassword = input.next();

        loggedInIndex = -1;

        for (int i = 0; i < userCount; i++) {
            if (usernames[i].equals(inputUsername) &&
                passwords[i].equals(inputPassword)) {
                loggedInIndex = i;
                break;
            }
        }

        if (loggedInIndex == -1) {
            System.out.println("Login failed.");
        } else {
            System.out.println("Login successful. Welcome " + usernames[loggedInIndex]);
        }
    }

    static void bankMenu() {
        int option;

        do {
            System.out.println("\nAccount Holder: " + usernames[loggedInIndex]);
            System.out.println("Balance: " + balances[loggedInIndex]);

            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Logout");

            System.out.print("Choose (1-3): ");
            option = input.nextInt();

            if (option == 1) {
                System.out.print("Enter deposit amount: ");
                double deposit = input.nextDouble();
                balances[loggedInIndex] += deposit;
                System.out.println("Deposit successful.");

            } else if (option == 2) {
                System.out.print("Enter withdrawal amount: ");
                double withdraw = input.nextDouble();

                if (withdraw <= balances[loggedInIndex]) {
                    balances[loggedInIndex] -= withdraw;
                    System.out.println("Withdrawal successful.");
                } else {
                    System.out.println("Insufficient balance.");
                }

            } else if (option == 3) {
                loggedInIndex = -1;
                System.out.println("Logged out successfully.");
            } else {
                System.out.println("INVALID OPTION");
            }

        } while (loggedInIndex != -1);
    }
}
