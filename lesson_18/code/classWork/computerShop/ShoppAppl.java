//Создать несколько экземпляров каждого класса.
//Какой общий объем памяти у всех устройств на складе?
//Какова общая стоимость всех устройств на складе?

package classWork.computerShop;

import classWork.computerShop.model.Computer;
import classWork.computerShop.model.Laptop;
import classWork.computerShop.model.Smartphone;

public class ShoppAppl {
    public static void main(String[] args) {
        Computer computer = new Computer("i7",8, 256, "Asus", 1200);
        System.out.println(computer);

        Laptop laptop = new Laptop("m2", 8, 256, "AppleAirBook", 2200, 14, 1.5, 10, "Silver");
        System.out.println(laptop);

        Computer[] computers = new Computer[6];
        computers[0] = new Computer("i7",8, 256, "Asus", 1200);
        computers[1] = new Laptop("m2", 8, 256, "AppleAirBook", 2200, 14, 1.5, 10, "Silver");
        computers[2] = new Computer("i7",8, 256, "Asus", 1200);
        computers[3] = new Computer("i7",8, 256, "Asus", 1200);
        computers[4] = new Laptop("m2", 8, 512, "AppleAirBook", 2200, 14, 1.5, 10, "Silver");
        computers[5] = new Smartphone("mobail", 8, 128, "Google pixel",450, 6, 400, 48, "black", 2738394043484859493l);
        int totalSsd = 0;
        for (int i = 0; i < computers.length; i++) {
            totalSsd += computers[i].getSsd();

        }
        System.out.println("Total SSD: " + totalSsd);

        double totalPrice = 0;
        for (int i = 0; i < computers.length; i++) {
            totalPrice += computers[i].getPrice();

        }
        System.out.println("Total price: " + totalPrice);

        for (int i = 0; i < computers.length; i++) {
            System.out.println(computers[i]);

        }


    }// end of main
}// end of class
