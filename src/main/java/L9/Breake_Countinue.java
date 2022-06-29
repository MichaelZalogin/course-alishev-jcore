package L9;

public class Breake_Countinue {
    public static void main(String[] args) {
        int i = 0;
        while (true) {
            if (i == 15) {
                break;
            }
            i++;
            System.out.println(i);
        }
        System.out.println("Out");
    }
}

class Countinue {
    public static void main(String[] args) {
        for (int i = 0; i <= 15; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println("Это нечетное число " + i);
        }
    }
}
