// Заполните массив четными числами от 0 до 50.
// Выведите массив в порядке возрастания, затем в порядке убывания

package houmWork;

public class Hw_02 {
    public static void main(String[] args) {

        int[] num = new int[26];
        int x = 0;

        for (int i = 0; i < num.length; i++) {
            num[i] = x;
            x += 2;
        }

        System.out.println("Array in ascending order:");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }

        System.out.println(" ");


        System.out.println("Array in descending order: ");
        for (int i = num.length - 1; i > 0; i--) {
            System.out.print(num[i] + " ");
        }

    }// end of main

}// end off class
