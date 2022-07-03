package L15;

public class Methods {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Иван";
        person1.age = 34;
        person1.speak();
    }
}

class Person {
    String name;
    int age;

    void speak() {
        System.out.println("Меня зовут " + name + "мне " + age + " лет.");
    }
}