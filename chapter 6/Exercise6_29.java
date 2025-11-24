
import java.util.*;

public class Exercise6_29 {
    static long fibonacci(int n) {
        if (n <= 1) return n;
        long a = 0, b = 1, c = 1;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.println("Fib(" + n + ") = " + fibonacci(n));
    }
}
