package L29;

public class Polimorfism {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        Dog d1 = new Dog();
        a1.eat();
        d1.eat();
        Animal ad = new Dog();
        d1.bark();
        ad.eat();
        Cat c1 = new Cat();
        c1.test(c1);
        d1.test(a1);
    }
}

class Animal {
    public void eat() {
        System.out.println("Animal is eating");
    }

    public static void test(Animal s1) {
        System.out.println("Animal");
    }

}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }
}

class Cat extends Animal {
}