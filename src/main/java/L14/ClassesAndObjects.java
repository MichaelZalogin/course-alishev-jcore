package L14;

public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Роман";
        person1.age = 50;

        Person person2 = new Person();
        person2.name = "Владимир";
        person2.age = 34;
        System.out.println();

        System.out.println("Человека зовут " + person1.name);
        System.out.println("Его возраст " + person1.age);

        System.out.println("Человека зовут " + person2.name);
        System.out.println("Его возраст " + person2.age);
    }
}

class Person {
    /*
    У класса могут быть:
    1. Данные (поля);
    2. Действия (методы);
    */
    String name;
    int age;
}