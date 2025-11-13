public class CompoundInterestRates {
    public static void main(String[] args) {
        double principal = 1000.0;
        int years = 10;

        System.out.printf("%s%20s%n", "Rate", "Amount on deposit");
        for (double rate = 0.05; rate <= 0.10; rate += 0.01) {
            double amount = principal * Math.pow(1.0 + rate, years);
            System.out.printf("%.2f%%%20.2f%n", rate * 100, amount);
        }
    }
}
