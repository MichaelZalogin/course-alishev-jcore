package L32;

public class UpcastAndDowncast {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        Dog d1 = new Dog();
        d1.bark();
        d1.eat();
        a1.eat();
        Animal ad1 = new Dog(); //Upcasting
        Dog ad2 = (Dog) new Animal(); //Downcasting

        Animal ad3 = d1; //Upcasting
        Dog d2 = (Dog) a1; //Downcasting
    }
}

class Animal {
    public void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("Dog is barking");
    }
}