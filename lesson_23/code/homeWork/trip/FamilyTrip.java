package homeWork.trip;

public class FamilyTrip {

        public static void main(String[] args) {
            // Информация об автомобилях
            String[] carBrands = {"Audi", "BMW", "Opel", "VW", "Mercedes"};
            char[] fuelTypes = {'d', 'b', 'd', 'd', 'b'};  // d - дизель, b - бензин
            double[] fuelConsumption = {6.6, 6.8, 6.9, 6.5, 6.3};  // Расход на 100 км
            double[] rentalCosts = {45, 49, 45, 39, 49};  // Стоимость аренды
            double distance = 3000;  // Расстояние в км
            double dieselCost = 1.6;  // Цена дизтоплива за литр
            double petrolCost = 1.8;  // Цена бензина за литр

            // Переменные для нахождения минимальной стоимости
            double minCost = Double.MAX_VALUE;
            String bestCar = "";

            // Подсчёт стоимости для каждого автомобиля
            for (int i = 0; i < carBrands.length; i++) {
                double fuelPricePerLiter = fuelTypes[i] == 'd' ? dieselCost : petrolCost;
                double fuelNeeded = (distance / 100) * fuelConsumption[i];  // Литры топлива на поездку
                double fuelCost = fuelNeeded * fuelPricePerLiter;  // Стоимость топлива
                double totalCost = rentalCosts[i] + fuelCost;  // Общая стоимость (аренда + топливо)

                // Поиск автомобиля с минимальной стоимостью
                if (totalCost < minCost) {
                    minCost = totalCost;
                    bestCar = carBrands[i];
                }

                // Вывод информации о каждом автомобиле
                System.out.printf("%s: Топливо = %.2f €, Аренда = %.2f €, Всего = %.2f €\n",
                        carBrands[i], fuelCost, rentalCosts[i], totalCost);
            }

            // Вывод самого выгодного автомобиля
            System.out.println("Самый дешевый вариант: " + bestCar + " с общей стоимостью " + minCost + " €.");
        }



}// end of class
