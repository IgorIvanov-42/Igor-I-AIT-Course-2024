//Распечатать в консоли все числа от 1 до 100,
// которые делятся на 5 без остатка.

package classWork;

public class Numbers {
    public static void main(String[] args) {
        int i = 1;
        int y = 100;

        while (i <= y){
            if (i % 5 == 0){
                System.out.print(i + " ");
            }
            i++;// постфиксная операция, увеличивает на 1

        }
    }//end of main
}//end of class
