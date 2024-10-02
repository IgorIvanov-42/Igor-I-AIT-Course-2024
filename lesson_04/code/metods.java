public class metods {
    public static void main(String[] args) {
        double money = 500;
        double euro = exchangeDolldrsToEuro(money);
        System.out.println("Euro: " + euro);

    }
    private static double exchangeDolldrsToEuro(double money){
        double rate = 0.9;

        return  money * rate;

    }



}
