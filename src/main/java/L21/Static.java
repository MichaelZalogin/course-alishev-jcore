package L21;

public class Static {
}

class Human {
    private int age;
    private String name;
    public static String description;
    public static int salary;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void getAllFields() {
        System.out.println(name + " " + age + " " + description);
    }
}

class Test {
    public static void main(String[] args) {
        Human human1 = new Human(24, "Bob");
        Human human2 = new Human(30, "Adam");
        human1.setName("Tom");
        Human.description = "Nice";
        human1.getAllFields();
        human2.getAllFields();
        System.out.println(Math.random());
        System.out.println(Math.pow(2,4));
    }
}