package homeWork;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Student {
    String name;
    List<Integer> grades;

    public Student(String name, List<Integer> grades) {
        this.name = name;
        this.grades = grades;
    }

    public double getAverageGrade() {
        return grades.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);
    }

    @Override
    public String toString() {
        return name + " (Средний балл: " + getAverageGrade() + ")";
    }

    public static void main(String[] args) {
        // Генерация случайных оценок для 20 студентов
        Random random = new Random();
        List<Student> students = IntStream.range(1, 21)
                .mapToObj(i -> new Student("Студент " + i,
                        IntStream.range(0, 10)
                                .mapToObj(j -> random.nextInt(5) + 1) // Генерация оценок от 1 до 5
                                .collect(Collectors.toList())))
                .collect(Collectors.toList());

        // Вывод всех студентов и их средние баллы
        System.out.println("Список студентов с их средними баллами:");
        students.forEach(System.out::println);

        // Поиск студента с максимальным средним баллом
        Student maxAvgStudent = students.stream()
                .max(Comparator.comparingDouble(Student::getAverageGrade))
                .orElse(null);

        // Поиск студента с минимальным средним баллом
        Student minAvgStudent = students.stream()
                .min(Comparator.comparingDouble(Student::getAverageGrade))
                .orElse(null);

        System.out.println("\nСтудент с максимальным средним баллом: " + maxAvgStudent);
        System.out.println("Студент с минимальным средним баллом: " + minAvgStudent);
    }
}

