package homeWork.pet;

import homeWork.pet.model.Cat;
import homeWork.pet.model.Dog;
import homeWork.pet.model.Pet;

public class HouseAppl {
    public static void main(String[] args) {
        Dog dog = new Dog(1, "dog", 3, "Tuzik", "taxa", 30, 3);
        Cat cat = new Cat(2, "cat", 2, "Murka", "British", 20, 2);

        Pet[] pets = new Pet[5];
        pets[0] = new Dog(1, "dog", 3, "Tuzik", "taxa", 30, 3);
        pets[1] = new Dog(5, "dog", 4, "Sharik", "retriever", 50, 25);
        pets[2] = new Cat(2, "cat", 2, "Murka", "British", 20, 2);
        pets[3] = new Cat(6, "cat", 5, "Muska", "British", 20, 2);
        pets[2] = new Cat(2, "cat", 2, "Murzik", "British", 20, 2);

        System.out.println("Dogs bark: " + dog.voice());
        System.out.println("Cats meow: " + cat.voice());



    }// end of main
}// end of class
