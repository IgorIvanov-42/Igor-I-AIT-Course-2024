package classWork.wrapper_classes_examples;

import java.math.BigInteger;

public class WrapperClassAppl {
    public static void main(String[] args) {
        int k = 1234567890;
        System.out.println(k);
        System.out.println("---------------------------");

        Integer integer = Integer.parseInt("1234567890");
        System.out.println(integer);
        integer = integer + 15;
        System.out.println(integer);

        System.out.println("----------------------");

        int value1=123;
        Integer a = new Integer(value1);
        System.out.println(value1);

        System.out.println("-------------------------");

        // автоупаковка
        Integer x = 5;
        System.out.println(x * 10);

        //автораспаковка
        integer = 7;
        int z = x + integer;
        System.out.println(z);

        System.out.println("--------------------");
        BigInteger myBigInt = new BigInteger("12345678901234567890");
        System.out.println(myBigInt);

        // количество цифр в числе
        int b = 1234567890;
        Integer bInt = b;// упаковали int в Integer
        // смена типа
        String str = bInt.toString();
        int l = str.length();
        System.out.println("Number: " + b + " contains " + l + " digits");
        System.out.println("---------------------------");
        System.out.println("Max value of int: " + bInt.MAX_VALUE);
        System.out.println("Min value of int: " + bInt.MIN_VALUE);

        Double d = 0.0;
        System.out.println("Max value of double: " + d.MAX_VALUE);
        System.out.println("Min value of double: " + d.MIN_VALUE);

        // математические вычисления
        int n = 20;
        Integer m = 10;

        System.out.println("---------------");
        m = m + n;
        System.out.println(n);
        n = n + m;
        System.out.println(n + 1);

        Double pi = 3.14;
        double circleLenth = 2 * pi * 10;
        System.out.println(circleLenth);

        System.out.printf("Length of circle: %.2f ", circleLenth);
        System.out.println();

        // NaN и Infinite

        double p = 20 / 5;

        if (Double.isNaN(p) || Double.isInfinite(p)){
        System.out.println("Wrong operation, division by zero");
        } else System.out.println(p);

        System.out.println("------------------");

        // перевод String в число
        String str1 = "0098765432100";
        long num = Long.parseLong(str1);
        System.out.println(num);


    }// end of main
}// end of class
