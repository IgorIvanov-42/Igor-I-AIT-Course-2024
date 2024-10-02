//Задание 2. Введите целое положительное число,
// найдите сумму его цифр

package houmwork;

import java.util.Scanner;

public class Ha_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive integer: ");
        int number = scanner.nextInt();
        int x = 0;
        while (number > 0) {
            int digit = number % 10;
            x += digit;
            number /= 10;
        }
        System.out.println("Sum of digits = " + x);


    }//end of main
}//end of class
