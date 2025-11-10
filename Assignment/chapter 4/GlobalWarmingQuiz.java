import java.util.Scanner;

public class GlobalWarmingQuiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] questions = {
            "1. What is one major cause cited by scientists for global warming?\n1) Solar flares\n2) Human activity\n3) Volcanoes\n4) Ocean currents",
            "2. What do skeptics often argue about climate models?\n1) They are too accurate\n2) They ignore natural cycles\n3) They are based on facts\n4) They are peer-reviewed",
            "3. What organization shared the Nobel Peace Prize with Al Gore?\n1) NASA\n2) IPCC\n3) WHO\n4) Greenpeace",
            "4. What is a proposed solution to reduce carbon emissions?\n1) Increase coal use\n2) Ban electric cars\n3) Carbon tax\n4) Reduce recycling",
            "5. What do some skeptics claim about temperature records?\n1) They show consistent warming\n2) They are manipulated\n3) They are accurate\n4) They are irrelevant"
        };
        int[] answers = {2, 2, 2, 3, 2};
        int score = 0;

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            System.out.print("Your answer: ");
            int ans = input.nextInt();
            if (ans == answers[i]) score++;
        }

        System.out.println("\nYour score: " + score + "/5");
        if (score == 5) System.out.println("Excellent");
        else if (score == 4) System.out.println("Very good");
        else System.out.println("Time to brush up on your knowledge of global warming.\nVisit: NASA, IPCC, ClimateDepot");
        input.close();
    }
}
