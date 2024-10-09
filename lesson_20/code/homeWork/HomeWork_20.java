package homeWork;

import java.util.Scanner;

public class HomeWork_20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Напишите предложение: ");
        String input = scanner.nextLine();

        // Определяем количество символов в строке
        int length = input.length();

        // Инициализируем переменные для подсчета
        int upperCaseCount = 0;
        int digitCount = 0;
        int spaceCount = 0;

        // Проходим по каждому символу строки
        for (int i = 0; i < length; i++) {
            char ch = input.charAt(i);

            // Проверяем, является ли символ буквой в верхнем регистре
            if (Character.isUpperCase(ch)) {
                upperCaseCount++;
            }

            // Проверяем, является ли символ цифрой
            if (Character.isDigit(ch)) {
                digitCount++;
            }

            // Проверяем, является ли символ пробелом (код 32)
            if (ch == ' ') {
                spaceCount++;
            }
        }

        // Определяем тип предложения по последнему символу
        char lastChar = input.charAt(length - 1);
        String sentenceType;

        if (lastChar == '.') {
            sentenceType = "Повествовательное предложение.";
        } else if (lastChar == '?') {
            sentenceType = "Вопросительное предложение.";
        } else if (lastChar == '!') {
            sentenceType = "Восклицательное предложение.";
        } else {
            sentenceType = "Неопределённый тип предложения.";
        }

        // Выводим результаты
        System.out.println("Количество символов в строке: " + length);
        System.out.println("Количество символов в верхнем регистре: " + upperCaseCount);
        System.out.println("Количество цифр в строке: " + digitCount);
        System.out.println("Количество пробелов в строке: " + spaceCount);
        System.out.println(sentenceType);

        // Закрываем Scanner
        scanner.close();

    }// end of main
}// end of class
