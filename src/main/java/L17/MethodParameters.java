package L17;

public class MethodParameters {

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Иван";
        person1.age = 34;
        person1.speak();
        int year = person1.calculateYearsToRetirement();
        System.out.println(year);
        person1.setName("Антон");
        System.out.println(person1.name);
    }
}

class Person {
    String name;
    int age;

    public void setName(String name) {
        this.name = name;
    }

    void speak() {
        System.out.println("Меня зовут " + name + ", мне " + age + " года");
    }

    int calculateYearsToRetirement() {
        int years = 65 - age;
        return years;
    }
}