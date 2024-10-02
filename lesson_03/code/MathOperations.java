//1. Задать целочисленные переменные x и y,
// выполнить c ними математические действия,
// напечатать результаты вместе с текстовыми
// пояснениями:
//        - какие переменные участвовали;
//- какие действия с ними выполнялись;
//- что получилось в результате.
public class MathOperations {
    public static void main(String[] args) {
        int x = 38;
        int y = 63;
        System.out.println(x + y);
        int res = x + y;
        System.out.println("x = " + x + " + y = " + y + "res:" + res);

        res = y - x;
        System.out.println("x = " + x + "- y = " + y +" = " + res);

        res = y / x;
        System.out.println("y =" + y + " / x = " + x + " = " + res);

        res = y % x;
        System.out.println("y =" + y + " % x = " + x + " = " + res);





    }






}
