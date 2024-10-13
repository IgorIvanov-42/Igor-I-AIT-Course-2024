package homeWork_07;//Задача 2. Пользователь вводит с клавиатуры число от 1 до 12,
// программа сообщает, к какому времени года относится введенный месяц.

import java.util.Scanner;

public class Ha_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number of month: ");
        int month = scanner.nextInt();

        switch (month) {
            case 1 -> {
                System.out.println("This is January.");
            }
            case 2 -> {
                System.out.println("This is February.");
            }
            case 3 -> {
                System.out.println("This is March.");
            }
            case 4 -> {
                System.out.println("This is April.");
            }
            case 5 -> {
                System.out.println("This is May.");
            }
            case 6 -> {
                System.out.println("This is June.");
            }
            case 7 -> {
                System.out.println("This is Jule.");
            }
            case 8 -> {
                System.out.println("This is August.");
            }
            case 9 -> {
                System.out.println("This is September.");
            }
            case 10 -> {
                System.out.println("This is October.");
            }
            case 11 -> {
                System.out.println("This is November.");
            }
            case 12 -> {
                System.out.println("This is December.");
            }
            default -> System.out.println("Enter a number from 1 to 12");
        }// end of switch

    }//end of main
}// end of class