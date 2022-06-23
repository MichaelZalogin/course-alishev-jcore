package L6;

public class OperatorIf {
    public static void main(String[] args) {
        int myInt = 5;
        if (myInt < 10) {
            System.out.println("Да, верно");
        } else if (myInt < 20) {
            System.out.println("Нет, не верно");
        } else {
            System.out.println("ни один из предыдущих циклов");
        }
    }
}