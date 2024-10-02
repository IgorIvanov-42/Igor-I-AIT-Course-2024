//Задание 1. Написать программу расчета выплаты денег
// работнику с учетом надбавки за выслугу лет, если оклад
// составляет 500 долларов США. За 3 года работы надбавка 10%,
// за 5 лет работы надбавка 50%, за 10 лет работы надбавка 100%,
// за 15 лет работы надбавка 150%. Сколько лет проработал работник,
// вводится с клавиатуры.

import java.util.Scanner;

public class Ha_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your work experience: ");
        double exp = scanner.nextDouble();
        double salary = 500;
        double increase1 = 50;
        double increase2 = 250;
        double increase3 = 500;
        double increase4 = 750;
        if (exp > 0 && exp < 3){
           double sum = salary;
            System.out.println("Your earnings are: " + sum);
        } else if (exp >= 3 && exp < 5){
            double sum = salary + increase1;
            System.out.println("Your earnings are: " + sum);
        } else if (exp >= 5 && exp < 10) {
            double sum = salary + increase2;
            System.out.println("Your earnings are: " + sum);
        } else if (exp >= 10 && exp < 15) {
            double sum = salary + increase3;
            System.out.println("Your earnings are: " + sum);
        } else if (exp >= 15) {
            double sum = salary + increase4;
            System.out.println("Your earnings are: " + sum);
        }
    }//end of main
}//end of class
