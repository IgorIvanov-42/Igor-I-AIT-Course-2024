public class Ha1 {
    public static void main(String[] args) {
        double PI = 3.14159;
        double r = 200;
        double areaOfCircle = r * r * PI;
        System.out.println(areaOfCircle);

        double l = areaOfCircleMethod(r);
        System.out.println("Area of circle whit radius " + r + "=" + l);
    }
    private static double areaOfCircleMethod(double r){
        return r * r * Math.PI;
    }

}
