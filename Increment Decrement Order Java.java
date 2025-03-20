public class IncrementDecrement {
    public static void main(String[] args) {
        int value = 1;

        value++;
        System.out.println("First: " + value); // 2

        System.out.println("Second: " + value++); // 2 (prints first, then increments)
        System.out.println("Third: " + value); // 3

        System.out.println("First: " + (++value)); // 4 (increments first, then prints)

        // Reset value
        value = 1;
        ++value; // Pre-increment: 2
        value++; // Post-increment: 3

        System.out.println("First: " + value); // 3
    }
}
