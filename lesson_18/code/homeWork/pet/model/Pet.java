package homeWork.pet.model;

public class Pet {
    private long id;
    private String animalSpecies;
    private int age;
    private String name;

    public Pet(long id, String breed, int age, String name) {
        this.id = id;
        this.animalSpecies = breed;
        this.age = age;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBreed() {
        return animalSpecies;
    }

    public void setBreed(String breed) {
        this.animalSpecies = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return " Pet{"+
                   "id:" + id  +
                    ", breed:" + animalSpecies +
                    ", age:" + age +
                    "name" + name + '\'' +
                "} ";

    }
}// end of class
