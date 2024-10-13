package classWork_07;
//  В программе задаются два целых числа.
//  Найдите минимальное из них с помощью тернарного оператора.
//  Дополните программу возможностью ввода чисел пользователем.

import java.util.Scanner;

public class TernaryExsanple {
    public static void main(String[] args) {
        int a = 500;
        int b = 200;

        int min = (a < b) ? a : b; // ternary operator
        System.out.println("Min = " + min);

          // input data
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input 1st number: ");
        a = scanner.nextInt();

        System.out.println("Input 2st number: ");
        b = scanner.nextInt();

        min = minAB(a, b);
        System.out.println("Min = " + min);

    }//end of main
    public static int minAB(int a, int b){
        return (a < b) ? a : b;
    }


}//end of class
