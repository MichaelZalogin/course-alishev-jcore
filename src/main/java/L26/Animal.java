package L26;

public class Animal implements Info {
    public int id;

    public Animal(int id) {
        this.id = id;
    }

    public void sleep() {
        System.out.println("I am sleeping");
    }

    @Override
    public void showInfo() {
        System.out.println("Id is: " + this.id);
    }
}

class Person implements Info {
    String name;

    public Person(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello");
    }

    @Override
    public void showInfo() {
        System.out.println("Name is: " + this.name);
    }
}

class Test {
    public static void main(String[] args) {
        Animal animal1 = new Animal(1);
        Person person1 = new Person("Bob");
        animal1.sleep();
        person1.sayHello();
        animal1.showInfo();
        person1.showInfo();
        Info info1 = new Animal(12);
        Info info2 = new Person("Greg");
    }
}

interface Info {
    void showInfo();
}