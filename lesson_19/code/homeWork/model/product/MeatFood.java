package homeWork.model.product;

public class MeatFood extends Food{

    private String meatTyp;

    public MeatFood(double price, String name, long barCode, String expDate, String meatTyp) {
        super(price, name, barCode, expDate);
        this.meatTyp = meatTyp;
    }

    public String getMeatTyp() {
        return meatTyp;
    }

    public void setMeatTyp(String meatTyp) {
        this.meatTyp = meatTyp;
    }

    @Override
    public String toString() {
        return "MeatFood{" +
                "meatTyp='" + meatTyp + '\'' +
                "} " + super.toString();
    }
}// end of class
