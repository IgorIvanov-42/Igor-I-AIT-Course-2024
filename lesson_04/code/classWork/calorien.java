package classWork;

public class calorien {
    public static void main(String[] args) {
        double weight = 200;
        double calorage = 50;
        double energy = calculateCalorie(weight, calorage);
        System.out.println("Energy =" + energy);

    }
    private static double calculateCalorie(double weight, double calorage){
       return weight * calorage / 100;


    }
}
