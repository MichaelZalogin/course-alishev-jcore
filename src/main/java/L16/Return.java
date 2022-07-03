package L16;

public class Return {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Иван";
        person1.age = 34;
        person1.speak();
        int year = person1.calculateYearsToRetirement();
        System.out.println(year);
    }
}

class Person {
    String name;
    int age;

    void speak() {
        System.out.println("Меня зовут " + name + ", мне " + age + " года");
    }

    int calculateYearsToRetirement() {
        int years = 65 - age;
        return years;
    }
}