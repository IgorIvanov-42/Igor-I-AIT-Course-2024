//Задача 3. В первый день спортсмен пробежал s
// километров, а затем каждый день увеличивал свой
// километраж на 10% от предыдущего значения.
// Определите номер дня, за который километраж
// спортсмена составит не менее target километров.
// Программа получает на вход действительные числа s и target
// и должна вывести одно натуральное число.

package houmwork;

import java.util.Scanner;

public class Ha_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the distance on the first day: ");
        double s = scanner.nextDouble();
        System.out.println("Enter target distance: ");
        double target = scanner.nextDouble();
        int day = 1;
        double distanse = s;
        while (distanse < target) {
            distanse += distanse * 0.10;
            day++;
        }
        System.out.println("Day number: " + day);



    }//end of main
}//end of class
