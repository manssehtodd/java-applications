
public class Exercise6_11 {
    public static void main(String[] args) {
        int[] counts = new int[10];
        for (int i = 0; i < counts.length; i++) counts[i] = 0;

        int[] bonus = new int[15];
        for (int i = 0; i < bonus.length; i++) bonus[i] += 1;

        int[] bestScores = {90, 82, 77, 95, 88};
        for (int score : bestScores) System.out.println(score);
    }
}
