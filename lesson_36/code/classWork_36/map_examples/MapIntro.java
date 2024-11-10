package classWork_36.map_examples;


//сформируем Map - города и их население

import java.util.*;

public class MapIntro {
    public static void main(String[] args) {

        Map<String, Integer> cityMap = new TreeMap<>();

        cityMap.put("Hamburg", 1_800_000);
        cityMap.put("Berlin", 3_500_000);
        cityMap.put("Munchen", 1_080_000);
        cityMap.put("Cologne", 1_500_000);
        cityMap.put("Ingolstadt", 140_000);
        cityMap.put("Augsburg", 350_000);
        cityMap.put("Isny", 14_835);
        cityMap.put("Odessa", 1_500_000);

        System.out.println(cityMap.size());
        System.out.println(cityMap.isEmpty());

        System.out.println("--------------------------");

        Integer population = cityMap.get("Berlin");
        System.out.println(population);

        population = cityMap.get("Isny");
        System.out.println(population);

        System.out.println("--------containsKey----------");
        System.out.println(cityMap.containsKey("Isny"));
        System.out.println(cityMap.containsKey("Omsk"));

        System.out.println("------------total population-----");

        int totalPopulation = 0;
        List<Integer> tp = new ArrayList<>(cityMap.values());
        System.out.println(tp);
        for (Integer p : tp) {
            totalPopulation += p;
        }
        System.out.println("Total population: " + totalPopulation);

        System.out.println("-------set of cities-----");
        Set<String> citySet = cityMap.keySet();
        citySet.forEach(System.out::println);

        System.out.println("-----------Map: cityMap-------------");
        for (String key : cityMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + cityMap.get(key));
        }

        System.out.println("---------Entry: cityMap--------");



    }// end of main
}// end of class
