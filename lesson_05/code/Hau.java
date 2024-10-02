public class Hau {
    public static void main(String[] args) {
        double c = 20;
        double f = celsiusToFar(c);
        System.out.println("20 grad Celsius to Fahrenheit =" + f);

    }
    public static double celsiusToFar(double c){
        return c * 1.18 + 32;
    }
}
