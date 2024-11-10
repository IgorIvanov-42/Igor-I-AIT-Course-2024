package homeWork;

//**Africa:** Nigeria, Egypt, Kenya, South Africa
//**Asia:** China, Japan, India, Thailand
//**Europe:** Germany, France, Italy, Spain
//**North America:** United States, Canada, Mexico, Cuba
//**South America:** Brazil, Argentina, Colombia, Peru

import java.util.HashMap;
import java.util.Map;

public class Countries {
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

        int afr = 0;
        for (String name : countries.keySet()) {
            if (countries.get(name).equals("Africa")){
                afr++;
            }
        }
        System.out.println("Africa: " + afr);

        int asia = 0;
        for (String name : countries.keySet()) {
            if (countries.get(name).equals("Asia")){
                asia++;
            }
        }
        System.out.println("Asia: " + asia);

        int eu = 0;
        for (String name : countries.keySet()) {
            if (countries.get(name).equals("Europe")){
                eu++;
            }
        }
        System.out.println("Europe: " + eu);

        int na = 0;
        for (String name : countries.keySet()) {
            if (countries.get(name).equals("North America")){
                na++;
            }
        }
        System.out.println("North America: " + na);

        int sa = 0;
        for (String name : countries.keySet()) {
            if (countries.get(name).equals("South America")){
                sa++;
            }
        }
        System.out.println("South America: " + sa);

    }// end of mine
}// end of class
