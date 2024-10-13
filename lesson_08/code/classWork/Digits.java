//Пользователь вводит натуральное число
// (целое, положительное).
//Выясните, сколько цифр в числе.

package classWork;

import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input positive integer number: ");
        int number = scanner.nextInt();
        int number1 = number;

        int count = 0;

        while (number > 0) {
            number = number / 10;
            System.out.println(number);
            count++;
        }
        System.out.println("Digits in number " + number1 + " are = " + count);

    }//end of main
}// end of class
