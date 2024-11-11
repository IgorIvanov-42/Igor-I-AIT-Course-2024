package homeWork.boats;

import java.util.*;
import java.util.stream.Collectors;

class Boat {
    private String manufacturer;
    private String country;
    private int year;
    private double length;
    private String hullMaterial;
    private double price;

    public Boat(String manufacturer, String country, int year, double length, String hullMaterial, double price) {
        this.manufacturer = manufacturer;
        this.country = country;
        this.year = year;
        this.length = length;
        this.hullMaterial = hullMaterial;
        this.price = price;
    }

    public String getManufacturer() { return manufacturer; }
    public String getCountry() { return country; }
    public int getYear() { return year; }
    public double getLength() { return length; }
    public String getHullMaterial() { return hullMaterial; }
    public double getPrice() { return price; }

    @Override
    public String toString() {
        return "Яхта " + manufacturer + " (" + country + ", " + year + "), " +
                "длина: " + length + " м, корпус: " + hullMaterial + ", цена: $" + price;
    }
}
