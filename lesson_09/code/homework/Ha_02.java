//Задание 2. Выведите все натуральные числа,
// меньшие 200 и кратные 13

package homework;

public class Ha_02 {
    public static void main(String[] args) {
        int a = 200;
        int i = 0;

        while (a > i) {
            if( a % 13 ==0) {
                System.out.print(a + " ");
            }
            a--;
        }

    }//end of main
}//end of class
