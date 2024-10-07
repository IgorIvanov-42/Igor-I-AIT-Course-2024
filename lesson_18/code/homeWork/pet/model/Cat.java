package homeWork.pet.model;

public class Cat extends Pet {
    private String breed;
    private int height;
    private int weight;

    public String voice(){
        return "Meow-meow";
    }

    public Cat(long id, String breed, int age, String name, String breed1, int height, int weight) {
        super(id, breed, age, name);
        this.breed = breed1;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public String getBreed() {
        return breed;
    }

    @Override
    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "breed='" + breed + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                "} " + super.toString();
    }
}// end of class
