import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        Random random = new Random();

        int roll1 = random.nextInt(); // Generates a random integer
        int roll2 = random.nextInt(101); // Generates a random number between 0 and 100
        int roll3 = 50 + random.nextInt(51); // Generates a number between 50 and 100

        System.out.println("First roll: " + roll1);
        System.out.println("Second roll: " + roll2);
        System.out.println("Third roll: " + roll3);
    }
}
