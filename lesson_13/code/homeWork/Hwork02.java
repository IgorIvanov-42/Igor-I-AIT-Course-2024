package homeWork;

import java.util.Random;

public class Hwork02 {
    public static void main(String[] args) {
        int numTrials = 100;
        int headsCount = 0;
        int tailsCount = 0;
        Random rand = new Random();

        for (int i = 0; i < numTrials; i++) {
            int flip = rand.nextInt(2);
            if (flip == 1) {
                headsCount++;
            }else {
                tailsCount++;
            }
        }
        double probHeads = (double) headsCount / numTrials;


        double probTails = (double) tailsCount / numTrials;

        System.out.println("Орёл выпал: " + headsCount + " раз");
        System.out.println("Решка выпала: " + tailsCount + " раз");
        System.out.println("Вероятность орла: " + probHeads);
        System.out.println("Вероятность решки: " + probTails);

    }
}
