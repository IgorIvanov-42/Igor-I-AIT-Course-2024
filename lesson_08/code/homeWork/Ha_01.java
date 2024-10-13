//Задача 1. Программа получает на вход строку
// и количество повторений этой строки.
// Программа должна вывести эту строку
// необходимое количество раз.

package homeWork;

import java.util.Scanner;

public class Ha_01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text:");
        String text = scanner.nextLine();
        System.out.println("Enter number");
        int number = scanner.nextInt();
        int x = 0;
        while (x < number){
            System.out.println(text);
            x++;
        }



    }// end of main
}//end of class
