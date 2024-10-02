//Задание 3. Определение времени суток.
// Напишите программу, которая берет текущий час
// (от 0 до 23) и выводит приветствие в зависимости
// от времени суток (утро, день, вечер, ночь).

package homework;

import java.util.Scanner;

public class Ha_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the time using integers from 0 to 23: ");
        int a = scanner.nextInt();

        if(a >= 6 && a < 12){
            System.out.println("Have a good morning!");
        } else if (a >= 12 && a < 18) {
            System.out.println("Have a good day!");
        } else if (a >= 18 && a < 22) {
            System.out.println("Have a good evening!");
        } else if (a >= 22 && a < 6) {
            System.out.println("Have a good night!");
        }


    }
}
