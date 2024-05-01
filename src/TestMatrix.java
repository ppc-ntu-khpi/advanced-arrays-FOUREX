import java.util.Arrays;

public class TestMatrix {
    /**
     * Тест розрахунку суми матриць
     */
    @org.junit.Test
    public void testSum() {
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

        // Обчислення суми матриць
        int[][] sum = Matrix.calculateSum(matrix_1, matrix_2);

        // Перевірка на наявність результату
        assert sum != null;

        // Перевірка кожного елемента матриці
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                assert sum[i][j] == 20;
            }
        }
    }
}
