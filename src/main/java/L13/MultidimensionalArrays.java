package L13;

public class MultidimensionalArrays {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        System.out.println(numbers[1]);
        int[][] matrix = new int[1][];
        int[][] matrix1 = {{1, 2, 3, 4}, {3, 2, 3, 2}, {3, 3, 3}};
        System.out.println(matrix1[2][2]);
        System.out.println(matrix1[1][3]);
        String[][] strings = new String[3][];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }
        for (int[] i : matrix1) {
            for (int a : i) {
                System.out.print(a + " ");
            }
            System.out.println();
        }
    }
}