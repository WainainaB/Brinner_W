public class AppleCounter {
    public static void main(String[] args) {
        int apples = 1;

        apples = apples + 1;
        System.out.println("First Increment: " + apples);

        apples += 1;
        System.out.println("Second Increment: " + apples);

        apples++;
        System.out.println("Third Increment: " + apples);

        apples = apples - 1;
        System.out.println("First Decrement: " + apples);

        apples -= 1;
        System.out.println("Second Decrement: " + apples);

        apples--;
        System.out.println("Third Decrement: " + apples);
    }
}
