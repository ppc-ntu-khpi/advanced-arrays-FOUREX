import java.util.Arrays;

public class Main {
    private static void show_matrix(int[][] matrix, String description) {
        System.out.println(description + ":");

        for(int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }

        System.out.println();
    }

    public static void main(String[] args) {
        int height = 4;
        int width = 5;
        int value = 10;

        int[][] matrix_1 = new int[height][width];
        int[][] matrix_2 = new int[height][width];

        // Заповнення матриць
        for (int i = 0; i < height; i++) {
            Arrays.fill(matrix_1[i], value);
            Arrays.fill(matrix_2[i], value);
        }

        show_matrix(matrix_1, "Перша матриця");
        show_matrix(matrix_2, "Друга матриця");

        int[][] sum = Matrix.calculateSum(matrix_1, matrix_2);

        if (sum == null) {
            System.out.println("Матриці не рівні");
            return;
        }

        show_matrix(sum, "Сума матриць");
    }
}
