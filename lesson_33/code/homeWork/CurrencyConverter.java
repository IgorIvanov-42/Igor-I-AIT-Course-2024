package homeWork;

import java.util.Scanner;

// Перечисление валют с кодами и курсами к евро
enum Currency {
    USD(1.1),   // 1 доллар США = 1.1 евро
    GBP(1.15),  // 1 британский фунт = 1.15 евро
    JPY(0.007), // 1 японская иена = 0.007 евро
    CHF(1.05),  // 1 швейцарский франк = 1.05 евро
    CAD(0.72);  // 1 канадский доллар = 0.72 евро

    private final double rateToEuro;

    // Конструктор для установки курса к евро
    Currency(double rateToEuro) {
        this.rateToEuro = rateToEuro;
    }

    // Метод для получения курса к евро
    public double getRateToEuro() {
        return rateToEuro;
    }
}

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Выводим список валют и их курсов
        System.out.println("Доступные валюты и их курсы к евро:");
        for (Currency currency : Currency.values()) {
            System.out.printf("%s: %.2f%n", currency, currency.getRateToEuro());
        }

        // Запрашиваем у пользователя код валюты
        System.out.print("\nВведите код валюты, которую хотите обменять: ");
        String currencyCode = scanner.next().toUpperCase();

        // Проверяем, существует ли введенная валюта
        try {
            Currency selectedCurrency = Currency.valueOf(currencyCode);

            // Запрашиваем у пользователя количество валюты для обмена
            System.out.print("Введите количество " + selectedCurrency + ": ");
            double amount = scanner.nextDouble();

            // Рассчитываем и выводим сумму в евро
            double amountInEuro = amount * selectedCurrency.getRateToEuro();
            System.out.printf("%.2f %s = %.2f EUR%n", amount, selectedCurrency, amountInEuro);
        } catch (IllegalArgumentException e) {
            System.out.println("Неправильный код валюты. Попробуйте снова.");
        } finally {
            scanner.close();
        }
    }
}

