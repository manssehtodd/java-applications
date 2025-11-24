
import java.util.*;

public class Exercise6_18 {
    public static void main(String[] args) {
        boolean[] seats = new boolean[10];
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("1=First Class, 2=Economy: ");
            int choice = sc.nextInt();

            if (choice == 1) assign(seats, 0, 4, "First Class");
            else assign(seats, 5, 9, "Economy");
        }
    }

    static void assign(boolean[] seats, int start, int end, String type) {
        for (int i = start; i <= end; i++) {
            if (!seats[i]) {
                seats[i] = true;
                System.out.println("Boarding pass: Seat " + (i+1) + " (" + type + ")");
                return;
            }
        }
        System.out.println("Section full. Next flight leaves in 3 hours.");
    }
}
