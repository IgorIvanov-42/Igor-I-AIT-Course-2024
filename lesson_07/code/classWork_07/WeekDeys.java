package classWork_07;
//Написать программу, которая по введенной цифре от 1 до 7
// определяет день недели.
//Второй вариант - на цифры от 1 до 5 программа сообщает,
// что это будний день, а на 6 и 7, что это выходной.

import java.util.Scanner;

public class WeekDeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number of day: ");
        int weekDay = scanner.nextInt();

        switch (weekDay){
            case 1 -> {
                System.out.println("This is Monday.");
            }//end of case1
            case 2 -> {
                System.out.println("This is Tuesday.");
            }
            case 3 -> {
                System.out.println("This is Wensday.");
            }
            case 4 -> {
                System.out.println("This is Thuesday.");
            }
            case 5 -> {
                System.out.println("This is Friday.");
            }
            case 6 -> {
                System.out.println("This is Saturday.");
            }
            case 7 -> {
                System.out.println("This is Sunday.");
            }
            default -> System.out.println("Wrong input");

        }
        switch (weekDay){
            case 1, 2, 3, 4, 5 ->{
                System.out.println(" This is working day");
            }
            case 6, 7 -> {
                System.out.println("This is weekend");
            }
        }



    }//end of main
}//end of class