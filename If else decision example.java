import java.util.Random;

public class StudentGrading {
    public static void main(String[] args) {
        Random random = new Random();
        int studentScore = random.nextInt(101); // Random score between 0 and 100
        char grade;

        System.out.println("Student Score: " + studentScore);

        if (studentScore >= 90) {
            grade = 'A';
        } else if (studentScore >= 80) {
            grade = 'B';
        } else if (studentScore >= 70) {
            grade = 'C';
        } else if (studentScore >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("Grade: " + grade);

        // Additional feedback message
        if (grade == 'A') {
            System.out.println("Excellent! Keep up the great work.");
        } else if (grade == 'B') {
            System.out.println("Good job! A little more effort will get you an A.");
        } else if (grade == 'C') {
            System.out.println("Fair performance. Aim higher next time.");
        } else if (grade == 'D') {
            System.out.println("You passed, but consider reviewing the material.");
        } else {
            System.out.println("Fail. Please work harder and seek help if needed.");
        }
    }
}
