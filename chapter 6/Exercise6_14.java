
public class Exercise6_14 {
    public static int product(int... nums) {
        int p = 1;
        for (int n : nums) p *= n;
        return p;
    }

    public static void main(String[] args) {
        System.out.println(product(2, 3));
        System.out.println(product(4, 5, 6));
    }
}
