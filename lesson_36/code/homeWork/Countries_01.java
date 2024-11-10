package homeWork;

import java.util.HashMap;
import java.util.Map;

public class Countries_01 {
    public static void main(String[] args) {

        Map<String, String> countries = new HashMap<>();

        countries.put("Nigeria", "Africa");
        countries.put("Egypt", "Africa");
        countries.put("Kenya", "Africa");
        countries.put("South Africa", "Africa");
        countries.put("China", "Asia");
        countries.put("Japan", "Asia");
        countries.put("India", "Asia");
        countries.put("Thailand", "Asia");
        countries.put("Germany", "Europe");
        countries.put("France", "Europe");
        countries.put("Italy", "Europe");
        countries.put("Spain", "Europe");
        countries.put("United States", "North America");
        countries.put("Canada", "North America");
        countries.put("Mexico", "North America");
        countries.put("Cuba", "North America");
        countries.put("Brazil", "South America");
        countries.put("Argentina", "South America");
        countries.put("Colombia", "South America");
        countries.put("Peru", "South America");

        // Map to hold the count of countries per continent
        Map<String, Integer> continentCounts = new HashMap<>();

        // Loop through countries and count each continent
        for (String continent : countries.values()) {
            continentCounts.put(continent, continentCounts.getOrDefault(continent, 0) + 1);
        }

        // Print out the results
        for (Map.Entry<String, Integer> entry : continentCounts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

