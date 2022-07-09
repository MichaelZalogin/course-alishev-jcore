package L25;

public class Inheritance {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();
        animal.sleep();
        Dog dog = new Dog();
        dog.eat();
        dog.sleep();
        dog.bark();
    }
}

class Animal {
    public void eat() {
        System.out.println("Animal am eating");
    }

    public void sleep() {
        System.out.println("I am sleeping");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("I am barking");
    }

    public void eat() {
        System.out.println("Dog am eating");
    }
}