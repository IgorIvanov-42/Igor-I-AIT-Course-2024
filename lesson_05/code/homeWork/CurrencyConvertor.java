package homeWork;

public class CurrencyConvertor {
    public static void main(String[] args) {
        double money = 100;
        double dollars = exchangeEuroToDollars(money);
        double pound = exchangeEuroToPounds(money);
        double yuan = exchangeEuroToYuan(money);
        System.out.println("100 euro to dollsrs =" + dollars);
        System.out.println("100 euro to pounds =" + pound);
        System.out.println("100 euro to yuan =" + yuan);

    }
    public static double exchangeEuroToDollars(double money){
        double rate = 1.10;
        return money * rate;
    }
    public static double exchangeEuroToPounds(double money) {
        double rate = 0.84;
        return money * rate;
    }
    public static double exchangeEuroToYuan(double money) {
        double rate = 7.87;
        return money * rate;
    }

}
