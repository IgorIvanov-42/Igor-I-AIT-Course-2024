package classWork.computerShop.model;

public class Smartphone extends Laptop{
    public long IMAI;

    public Smartphone(String cpu, int ram, int ssd, String brand, double price, double displaySize, double weight, int batteryLife, String color, long IMAI) {
        super(cpu, ram, ssd, brand, price, displaySize, weight, batteryLife, color);
        this.IMAI = IMAI;
    }

    public long getIMAI() {
        return IMAI;
    }

    public void setIMAI(long IMAI) {
        this.IMAI = IMAI;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "IMAI=" + IMAI +
                "} " + super.toString();
    }
}// end of class
