package homeWork;

import java.util.HashSet;
import java.util.Set;

public class StudentCourses {
    public static void main(String[] args) {
        // Создаем множества студентов для каждого курса
        Set<String> mathStudents = new HashSet<>();
        Set<String> csStudents = new HashSet<>();

        // Добавляем студентов для курса "Математика"
        mathStudents.add("Иван");
        mathStudents.add("Мария");
        mathStudents.add("Алексей");
        mathStudents.add("Светлана");

        // Добавляем студентов для курса "Информатика"
        csStudents.add("Мария");
        csStudents.add("Алексей");
        csStudents.add("Дмитрий");
        csStudents.add("Анна");

        // Создаем множества для операций над множествами
        Set<String> bothCourses = new HashSet<>(mathStudents);
        bothCourses.retainAll(csStudents);  // Пересечение - студенты, которые на обоих курсах

        Set<String> onlyOneCourse = new HashSet<>(mathStudents);
        onlyOneCourse.addAll(csStudents);  // Объединение множеств
        onlyOneCourse.removeAll(bothCourses);  // Удаляем студентов, которые на обоих курсах

        // Выводим результаты
        System.out.println("Студенты, которые учатся на обоих курсах: " + bothCourses);
        System.out.println("Студенты, которые учатся только на одном из курсов: " + onlyOneCourse);
    }
}

