public class TemperatureConverter {
    public static void main(String[] args) {
        int fahrenheit = 94;
        double temperature = ((fahrenheit - 32) * 5.0 / 9); // Convert to Celsius

        System.out.println("The temperature is " + temperature + " degrees Celsius");

        // Rounding the temperature
        double roundedTemperature = Math.round(temperature);
        System.out.println("The temperature is " + roundedTemperature + " degrees Celsius (rounded)");
    }
}
