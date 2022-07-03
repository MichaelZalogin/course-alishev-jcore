package L12;

public class ArraysOfStrings {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 10;
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        String[] strings = new String[3];
        strings[0] = "привет";
        strings[1] = "да";
        strings[2] = "ок";

        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + " ");
        }
        System.out.println();
        for (String a : strings) {
            System.out.print(a + " ");
        }
        int[] number1 = {1, 2, 3};
        int sum = 0;
        for (int i : number1) {
            sum += i;
            System.out.println(sum);

            int value = 0;
            String s;
        }
    }
}