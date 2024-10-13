// Заполните массив четными числами от 0 до 50.
// Выведите массив в порядке возрастания, затем в порядке убывания

package homeWork;

public class Hw_02 {
    public static void main(String[] args) {

        int[] num = new int[26];//размер массива для четных чисел от 0 до 50 (всего 26 элементов)
        int x = 0;
        // Выводим массив в порядке возрастания
        for (int i = 0; i < num.length; i++) {
            num[i] = x;
            x += 2;// Увеличиваем на 2, чтобы получить следующее четное число
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
