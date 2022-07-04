package L18;

public class Encapsulation {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Иван");
        System.out.println(s1.getName());
    }
}

class Student {
    private String name;
    private int age;
    private String surname;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}