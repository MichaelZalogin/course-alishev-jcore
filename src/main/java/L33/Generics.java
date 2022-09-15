package L33;

import java.util.ArrayList;
import java.util.List;

public class Generics {
    public static void main(String[] args) {
        List animals = new ArrayList();
        Animal ourAnimal = new Animal();
        animals.add("cat");
        animals.add("dog");
        animals.add("frog");
        animals.add(ourAnimal);
        String animal = (String) animals.get(1);
        System.out.println(animal);

        List<String> animals2 = new ArrayList<>();
        animals2.add("cat");
        animals2.add("dog");
        animals2.add("frog");
        String animal2 = animals2.get(0);
        System.out.println(animal2);
    }
}

class Animal {
}