package homeWork;

public class Minimum {
    public static void main(String[] args) {

        int a = 100;
        int b = 200;

        int min = minimum(a, b); // call method with arguments

        System.out.println("Minimum from " + a + " and " + b + " is " + min);

    }

    public static int minimum(int a, int b) {
        if (a < b) {
            return a;
        } else return b;
    }

}

