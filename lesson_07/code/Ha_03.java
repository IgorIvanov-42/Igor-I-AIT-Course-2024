// Задание 3. Написать программу для машины на светофоре.
// Что делать, если горит красный, желтый или зеленый свет.
// Цвет светофора задается в программе, затем с клавиатуры

import java.util.Scanner;

import static java.awt.Color.*;

public class Ha_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("If the traffic light is red, enter the number 1, if yellow 2, if green 3. ");
        byte col = scanner.nextByte();

        if (col == 1){
            System.out.println("Stop");

        } else if (col == 2) {
            System.out.println("Attention! Get ready.");
        } else if (col == 3) {
            System.out.println("You can go");
        }


    }//end of main
}// end of class
