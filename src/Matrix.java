/**
 * Клас який реалізує роботу з матрицями.
 * Завдання 7. Знайти суму двох матриць розміром N x M
 */
public class Matrix {
    /**
     * Перевіряє матриці на рівність
     * 
     * @param matrix_1 Перша матриця
     * @param matrix_2 Друга матриця
     * @return true якщо матриці рівні, інакше - false
     */
    private static boolean matricesAreEqual(int[][] matrix_1, int[][] matrix_2) {
        return matrix_1.length == matrix_2.length && matrix_1[0].length == matrix_2[0].length;
    }
    
    /**
     * Додає дві матриці
     *
     * @param matrix_1 Перша матриця
     * @param matrix_2 Друга матриця
     * @return Сума матриць або null якщо матриці не рівні
     */
    public static int[][] calculateSum(int[][] matrix_1, int[][] matrix_2) {
        int height = matrix_1.length;
        int width = matrix_1[0].length;

        // Перевірка матриць на рівність
        if (!matricesAreEqual(matrix_1, matrix_2)) {
            return null;
        }

        int[][] result = new int[height][width];

        // Додавання матриць
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                result[i][j] = matrix_1[i][j] + matrix_2[i][j];
            }
        }

        return result;
    }
}
