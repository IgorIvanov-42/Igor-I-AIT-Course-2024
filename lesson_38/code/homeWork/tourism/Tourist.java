package homeWork.tourism;

import java.util.List;

public class Tourist {
    private String name;
    private List<String> countries;

    public Tourist(String name, List<String> countries) {
        this.name = name;
        this.countries = countries;
    }


    public String getName() {
        return name;
    }

    public List<String> getCountries() {
        return countries;
    }

    @Override
    public String toString() {
        return "Name: " + name + "Countries: " + countries.toString();
    }
}// end of class
