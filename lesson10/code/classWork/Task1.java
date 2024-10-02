// **Задача 1.**
//Создайте массив и заполните его целыми числами от 1 до 20.

package classWork;

public class Task1 {
    public static void main(String[] args) {
        int[] numbers = new int[20];

        //numbers[0] - 1st element of array

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
            System.out.print(numbers[i] + " ");

        }





    }// end of main
}//end of class
