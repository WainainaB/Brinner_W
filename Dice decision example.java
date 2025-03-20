import java.util.Random;

public class CoinTossGame {
    public static void main(String[] args) {
        Random random = new Random();
        
        // Simulate flipping three coins (0 = Tails, 1 = Heads)
        int flip1 = random.nextInt(2);
        int flip2 = random.nextInt(2);
        int flip3 = random.nextInt(2);
        
        int totalPoints = 10; // Base points
        String result1 = (flip1 == 1) ? "Heads" : "Tails";
        String result2 = (flip2 == 1) ? "Heads" : "Tails";
        String result3 = (flip3 == 1) ? "Heads" : "Tails";

        System.out.println("Coin Toss Results: " + result1 + " | " + result2 + " | " + result3);

        // If all three coins are the same
        if ((flip1 == flip2) && (flip2 == flip3)) {
            System.out.println("Triple match! +5 bonus points!");
            totalPoints += 5;
        }
        // If any two coins match
        else if ((flip1 == flip2) || (flip2 == flip3) || (flip1 == flip3)) {
            System.out.println("Double match! +2 bonus points!");
            totalPoints += 2;
        }

        // Win condition
        if (totalPoints >= 15) {
            System.out.println("Congratulations! You win with " + totalPoints + " points!");
        } else {
            System.out.println("Sorry, you lose. You scored only " + totalPoints + " points.");
        }
    }
}
