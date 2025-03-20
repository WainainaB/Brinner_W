import java.util.Random;

public class StudentScores {
    public static void main(String[] args) {
        Random random = new Random();

        int mathScore = random.nextInt(101); // Score between 0-100
        int scienceScore = random.nextInt(101); // Score between 0-100
        int englishScore = random.nextInt(51) + 50; // Score between 50-100

        System.out.println("Math Score: " + mathScore);
        System.out.println("Science Score: " + scienceScore);
        System.out.println("English Score: " + englishScore);
    }
}
