package L11;

public class Arrays {
    public static void main(String[] args) {
        int number = 10; // Примитивный тип данных
        char character = 'a'; // Примитивный тип данных
        String s = "Hello";
        String s1 = new String("Hello");
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 10;
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}