package homeWork;

public class Temperature_05 {
    public static void main(String[] args) {
        double celsius = 0;

        double fahrenheit = convertCelsiusToFahrenheit(celsius);
        System.out.println("0 цельсия по фаренгейту = " + fahrenheit);
    }// end of main

    public static final double CELSIUS_TO_FAHRENHEIT_CONVERSION= 1.8;
    public static final double CELSIUS_TO_FAHRENHEIT = 32.0;

    public static double convertCelsiusToFahrenheit(double celsius) {
        return celsius * CELSIUS_TO_FAHRENHEIT_CONVERSION + CELSIUS_TO_FAHRENHEIT;
    }
}
