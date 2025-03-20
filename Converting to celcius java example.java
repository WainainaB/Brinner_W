public class DistanceConverter {
    public static void main(String[] args) {
        double kilometers = 50; // Distance in kilometers
        double miles = kilometers * 0.621371; // 1 km = 0.621371 miles

        System.out.println("The distance is " + miles + " miles.");

        // Rounding off the value
        long roundedMiles = Math.round(miles);
        System.out.println("Rounded distance: " + roundedMiles + " miles.");
    }
}
