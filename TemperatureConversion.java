import java.util.*;

public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature in : ");
        double input = scanner.nextDouble();
        System.out.print("Enter the unit (C for Celsius, F for Fahrenheit, K for Kelvin): ");
        char unit = scanner.next().toUpperCase().charAt(0);
        double convertedTemperature;
        switch (unit) {
            case 'C':
                convertedTemperature = (input * 9/5) + 32; // Celsius to Fahrenheit
                System.out.printf("%.2f Celsius is %.2f Fahrenheit%n", input, convertedTemperature);
                convertedTemperature = input + 273.15; // Celsius to Kelvin
                System.out.printf("%.2f Celsius is %.2f Kelvin%n", input, convertedTemperature);
                break;
            case 'F':
                convertedTemperature = (input - 32) * 5/9; // Fahrenheit to Celsius
                System.out.printf("%.2f Fahrenheit is %.2f Celsius%n", input, convertedTemperature);
                convertedTemperature = (input - 32) * 5/9 + 273.15; // Fahrenheit to Kelvin
                System.out.printf("%.2f Fahrenheit is %.2f Kelvin%n", input, convertedTemperature);
                break;
            case 'K':
                convertedTemperature = input - 273.15; // Kelvin to Celsius
                System.out.printf("%.2f Kelvin is %.2f Celsius%n", input, convertedTemperature);
                convertedTemperature = (input - 273.15) * 9/5 + 32; // Kelvin to Fahrenheit
                System.out.printf("%.2f Kelvin is %.2f Fahrenheit%n", input, convertedTemperature);
                break;
            default:
                System.out.println("Invalid unit entered.");
        }

    }
}