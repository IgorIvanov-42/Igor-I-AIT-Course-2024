package homeWork;

public class Triangle {
    public static void main(String[] args) {

        int a = 50;
        int b = 56;
        int c = 20;

        boolean res = checkTriangle(a, b, c);

        if (res) {
            System.out.println("The triangle with sides " + a + ", " + b + " and " + c + " exists!");
        } else {
            System.out.println("The triangle with sides " + a + ", " + b + " and " + c + " can't exist!");
        }
    }

    // checks if triangle exists
    private static boolean checkTriangle(int a, int b, int c) {
        return (a < (b + c) && b < (a + c) && c < (b + a));
    }
}

