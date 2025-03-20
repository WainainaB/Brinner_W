public class TemperatureConverter {
    public static void main(String[] args) {
        int fahrenheit = 94;

        // Convert Fahrenheit to Celsius
        double temperature = ((fahrenheit - 32) * 5.0 / 9);
        System.out.println("The temperature is " + temperature + " degrees Celsius");

        // Rounding the Celsius temperature
        double roundedTemperature = Math.round(temperature);
        System.out.println("The temperature rounded is " + roundedTemperature + " degrees Celsius");
    }
}
