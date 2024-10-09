package homeWork;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Запрашиваем строку с числами у пользователя
        System.out.println("Введите строку с целыми числами, разделёнными пробелами:");
        String input = scanner.nextLine();

        // Разделяем строку по пробелам
        String[] numbers = input.split(" ");

        // Переменная для хранения суммы
        int sum = 0;

        // Проходим по каждому числу в строке
        for (String number : numbers) {
            try {
                // Преобразуем строку в целое число с помощью класса-обёртки Integer
                int num = Integer.parseInt(number);

                // Добавляем число к сумме
                sum += num;
            } catch (NumberFormatException e) {
                // Если ввод содержит некорректное число, выводим сообщение об ошибке
                System.out.println("'" + number + "' не является корректным целым числом.");
            }
        }
        // Выводим сумму всех чисел
        System.out.println("Сумма всех чисел: " + sum);

        // Закрываем Scanner
        scanner.close();



    }// end of main
}// end of class
