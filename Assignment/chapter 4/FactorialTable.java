public class FactorialTable {
    public static void main(String[] args) {
        System.out.printf("%-5s%-25s%n", "n", "n!");
        System.out.println("--------------------------------");

        for (int n = 1; n <= 20; n++) {
            long factorial = 1;
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
            System.out.printf("%-5d%-25d%n", n, factorial);
        }
        System.out.println("\nNote: Factorial of 100 exceeds the range of 'long'.");
    }
}
