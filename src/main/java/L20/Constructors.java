package L20;

public class Constructors {
}

class Human {
    private int age;
    private String name;

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

    public void getInfo() {
        System.out.println(this.name + " " + this.age);
    }
}

class Test {
    public static void main(String[] args) {
        Human human1 = new Human(24, "Иван");
//        human1.setName("Иван");
//        human1.setAge(24);
        human1.getInfo();
    }
}