public class FacebookGrowthEstimator {
    public static void main(String[] args) {
        double initialUsers = 1_000_000_000.0;
        double rate = 0.04;
        double target1 = 1_500_000_000.0;
        double target2 = 2_000_000_000.0;

        int monthsTo1_5B = 0, monthsTo2B = 0;
        double users = initialUsers;

        while (users < target1) {
            users *= 1 + rate;
            monthsTo1_5B++;
        }

        users = initialUsers;
        while (users < target2) {
            users *= 1 + rate;
            monthsTo2B++;
        }

        System.out.println("Months to reach 1.5 billion users: " + monthsTo1_5B);
        System.out.println("Months to reach 2 billion users: " + monthsTo2B);
    }
}
