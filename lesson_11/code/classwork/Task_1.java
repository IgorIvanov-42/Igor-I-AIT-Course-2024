// Задан массив целых чисел: 75, 34, -15, -123, 57,
// -145, 86, 77, 48, -59.
//Найдите минимальный элемент массива и его индекс.
//Каков будет результат, если в массиве несколько
// одинаковых минимальных элементов?
//Найдите максимальный элемент массива и его индекс.
//Поменяйте местами минимальный и максимальный элементы,
// распечатайте массив.

package classwork;

public class Task_1 {
    public static void main(String[] args) {
        int[] array = { 75, 34, -15, -123, 57, -145, 86, 77, 48, -59 };

        int minOfArray = array[0];

        int indexOfMinElement = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < minOfArray){
                minOfArray = array[i];
                indexOfMinElement = i;
            }


        }
        System.out.println("Min element of array = " + minOfArray + ", index of min element= " + indexOfMinElement);

        int maxOfArray = array[0];

        int indexOfMaxElement = 0;

        for (int i = 0; i > array.length; i++) {
            if (array[i] > maxOfArray){
                maxOfArray = array[i];
                indexOfMaxElement = i;
            }


        }
        System.out.println("Max element of array = " + maxOfArray + ", index of max element= " + indexOfMaxElement);

        int temp = array[indexOfMinElement];
        array[indexOfMinElement] = array(indexOfMaxElement);
        array[indexOfMaxElement] = temp;
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }
        System.out.println();


    }// end of main

    private static int array(int indexOfMaxElement) {
        return 0;
    }
}// end of class
