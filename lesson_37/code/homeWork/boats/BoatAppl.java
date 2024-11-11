package homeWork.boats;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class BoatAppl {
    public static void main(String[] args) {
        List<Boat> boats = Arrays.asList(
                new Boat("Sunseeker", "UK", 2015, 30.0, "металл", 5000000),
                new Boat("Beneteau", "France", 2018, 20.0, "пластик", 1500000),
                new Boat("Azimut", "Italy", 2012, 25.0, "металл", 2000000),
                new Boat("Ferretti", "Italy", 2019, 28.0, "дерево", 3000000),
                new Boat("Princess", "UK", 2016, 24.0, "пластик", 2500000),
                new Boat("Sunseeker", "USA", 2017, 22.0, "металл", 3200000)
        );

        // Отображение всех яхт
        System.out.println("Все яхты:");
        boats.forEach(System.out::println);

        // Отображение яхт, сделанных из указанного материала корпуса
        String specifiedMaterial = "металл";
        System.out.println("\nЯхты с корпусом из материала: " + specifiedMaterial);
        boats.stream()
                .filter(boat -> boat.getHullMaterial().equalsIgnoreCase(specifiedMaterial))
                .forEach(System.out::println);

        // Отображение яхт дороже указанной цены
        double specifiedPrice = 2000000;
        System.out.println("\nЯхты дороже $" + specifiedPrice + ":");
        boats.stream()
                .filter(boat -> boat.getPrice() > specifiedPrice)
                .forEach(System.out::println);

        // Отображение яхт, чей год выпуска находится в заданном диапазоне
        int startYear = 2015, endYear = 2018;
        System.out.println("\nЯхты, выпущенные с " + startYear + " по " + endYear + " год:");
        boats.stream()
                .filter(boat -> boat.getYear() >= startYear && boat.getYear() <= endYear)
                .forEach(System.out::println);

        // Сортировка яхт в порядке убывания стоимости
        System.out.println("\nЯхты, отсортированные по убыванию стоимости:");
        boats.stream()
                .sorted(Comparator.comparingDouble(Boat::getPrice).reversed())
                .forEach(System.out::println);

        // Средняя стоимость яхты
        double averagePrice = boats.stream()
                .mapToDouble(Boat::getPrice)
                .average()
                .orElse(0.0);
        System.out.println("\nСредняя стоимость яхты: $" + averagePrice);

        // Количество и список яхт под каждым флагом
        System.out.println("\nЯхты по странам:");
        boats.stream()
                .collect(Collectors.groupingBy(Boat::getCountry))
                .forEach((country, boatList) -> {
                    System.out.println(country + ": " + boatList.size() + " яхт(ы)");
                    boatList.forEach(System.out::println);
                });
    }
}
