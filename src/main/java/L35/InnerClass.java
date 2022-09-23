package L35;

public class InnerClass {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();
        Animal animal2 = new Animal() {
            public void eat() {
                System.out.println("Other animal is eating");
            }
        };

        AbleToSleep animal3 = new Animal();
        animal3.sleep();

        AbleToSleep ableToSleep = new AbleToSleep() {
            @Override
            public void sleep() {
                System.out.println("Someone is sleeping");
            }
        };

        ableToSleep.sleep();
    }
}

class Animal implements AbleToSleep {
    @Override
    public void sleep() {
    }

    public void eat() {
        System.out.println("Animal is eating...");
    }
}

interface AbleToSleep {
    void sleep();
}