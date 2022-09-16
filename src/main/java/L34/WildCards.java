package L34;

import java.util.ArrayList;
import java.util.List;

public class WildCards {
    public static void main(String[] args) {
        List<Animal> listOfAnimals = new ArrayList<>();
        listOfAnimals.add(new Animal(1));
        listOfAnimals.add(new Animal(2));

        List<Dog> listOfDogs = new ArrayList<>();
        listOfDogs.add(new Dog(1));
        listOfDogs.add(new Dog(2));
        test(listOfAnimals);
//        test(listOfDogs);
    }

    private static void test(List<Animal> list) {
        for (Animal animal : list) {
            System.out.println(animal);
        }
    }
}

class Dog extends Animal {
    public Dog(int id) {
        super(id);
    }
}

class Animal {
    private int id;

    public Animal(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return String.valueOf(id);
    }
}