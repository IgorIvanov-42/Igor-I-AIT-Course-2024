public class Haus {
    public static void main(String[] args) {
        double miles = 32;
        double res = milesToKm(miles);
        System.out.println("32 miles = "+ res + "km");
    }
    public static double milesToKm(double miles){
        return miles * 1852 / 1000;
        }

}
