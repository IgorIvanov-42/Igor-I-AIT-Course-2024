// Смоделируйте бросок игрального кубика 20 раз.
// Подсчитайте, сколько раз выпала каждая грань?
//Проверьте, равны ли вероятности выпадений граней кубика?

package classwork;

import java.util.Random;

public class Dice {
    public static void main(String[] args) {

        Random random = new Random();

        int[] toss = new  int[20];
        for (int i = 0; i < toss.length; i++) {

            int n = random.nextInt(6) + 1;
            toss[i] = n;
            System.out.print(n + " ");

        }
        System.out.println();

        int[] res = new int[6];
        for (int i = 0; i < toss.length; i++) {
            int n = toss[i];
            switch (n){
                case 1 -> res[0]++;
                case 2 -> res[1]++;
                case 3 -> res[2]++;
                case 4 -> res[3]++;
                case 5 -> res[4]++;
                case 6 -> res[5]++;

            }

        }
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");

        }



    }// end of main
}// end of class
