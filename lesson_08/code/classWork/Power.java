//Возведите 3 в степень 10,
// выведите на печать все промежуточные результаты.

package classWork;

public class Power {
    public static void main(String[] args) {
        int pow = (int) Math.pow(3, 10);// casting - преобразование типов, double в int

        // начальные значения
        int count = 0;// параметр цикла
        int res = 1;

        while (count < 10){
            res = res * 3;// возведение 3 в степень
            count++;// изменение параметра цикла
            System.out.println(res + " = 3 in power " + count);


        }

    }// end of main
}//end of class
