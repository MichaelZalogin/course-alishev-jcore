package L10;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите возраст");
        int age = scanner.nextInt();
        switch (age) {
            case 10:
                System.out.println("Вы учитесь в школе");
                break;
            case 18:
                System.out.println("Вы совершеннолетний");
                break;
            case 30:
                System.out.println("Вы приближаетесь к старости");
                break;
            default:
                System.out.println("Для такого возраста кейс отсутствует");
        }
    }
}
