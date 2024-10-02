//Задание 2
//У стрелка есть 10 попыток поразить цель.
// Смоделируйте 10 выстрелов с помощью датчика случайных чисел.
// Ответьте на вопрос, сколько очков набрал стрелок?
// Попадал ли он когда-нибудь в центр мишени?

package homework;

import java.util.Random;

public class Hwork_01 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] shot = new int[10];   // Массив для хранения результатов выстрелов
        int[] arrayOfIndex = new int[shot.length];  // Массив для индексов выстрелов в центр
        int totalScore = 0;         // Общее количество очков
        int centerScore = 10;       // Количество очков за попадание в центр
        int countHits = 0;          // Количество попаданий в центр

        // Моделируем 10 выстрелов
        for (int i = 0; i < shot.length; i++) {
            int s = random.nextInt(11); // Генерация случайного значения (от 0 до 10)
            shot[i] = s;                // Сохраняем результат в массив
            totalScore += s;            // Считаем общее количество очков

            // Проверяем, было ли попадание в центр
            if (s == centerScore) {
                arrayOfIndex[countHits] = i;  // Сохраняем индекс попадания в центр
                countHits++;                  // Увеличиваем счетчик попаданий
            }

            System.out.println("Выстрел " + (i + 1) + ": " + s + " очков");
        }

        // Выводим результат
        System.out.println("Общее количество очков: " + totalScore);

        if (countHits > 0) {
            System.out.print("Стрелок попал в центр мишени на выстрелах: ");
            for (int i = 0; i < countHits; i++) {
                System.out.print((arrayOfIndex[i] + 1) + " ");  // Выводим индексы выстрелов в центр
            }
            System.out.println();
        } else {
            System.out.println("Стрелок не попал в центр мишени.");
        }
    }
}

