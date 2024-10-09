package homeWork.model;

import homeWork.model.product.Food;
import homeWork.model.product.MeatFood;
import homeWork.model.product.MilkFood;
import homeWork.model.product.Product;

public class MarketAppl {
    public static void main(String[] args) {

        Product[] markets = new Product[4];
        markets[0] = new Product(1, "Bag", 111);
        markets[1] = new  Food(2, "Water", 222, "25.02.2025");
        markets[2] = new MeatFood(20, "Meat", 333, "10.10.2024", "Beef");
        markets[3] = new MilkFood(1, "Milk", 444, "09.11.2025", "Cow", 3.8);

        for (int i = 0; i < markets.length; i++) {
            System.out.println(markets[i]);

        }
        double totalSum = 0;
        for (int i = 0; i < markets.length; i++) {
            totalSum += markets[i].getPrice();

        }
        System.out.println("Total price: " + totalSum);

    }//end of main
}// end of class
