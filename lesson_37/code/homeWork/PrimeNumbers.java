package homeWork;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimeNumbers {
    public static void main(String[] args) {
        // Заданный набор целых чисел
        List<Integer> numbers = IntStream.rangeClosed(10, 20)
                .boxed()
                .collect(Collectors.toList());

        // Отбор простых чисел с использованием stream()
        List<Integer> primeNumbers = numbers.stream()
                .filter(PrimeNumbers::isPrime)
                .collect(Collectors.toList());

        System.out.println("Простые числа из списка: " + primeNumbers);
    }

    // Метод для проверки, является ли число простым
    private static boolean isPrime(int number) {
        if (number <= 1) return false; // Числа меньше 2 не являются простыми
        return IntStream.rangeClosed(2, (int) Math.sqrt(number))
                .allMatch(divisor -> number % divisor != 0);
    }
}

