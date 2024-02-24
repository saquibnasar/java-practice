import java.util.Arrays;

public class RowColMatrix {
    public static void main(String[] args) {
        int[][] matrix = { { 10, 20, 30, 40 }, { 15, 25, 35, 45 }, { 28, 29, 37, 49 }, { 33, 34, 38, 50 },
                { 41, 45, 47, 60 } };
        int target = 37;
        System.out.println(Arrays.toString(rowColMatrix(matrix, target)));
    }

    static int[] rowColMatrix(int[][] matrix, int target) {
        int r = 0;
        int c = matrix.length - 2;

        while (r < matrix.length && c >= 0) {
            if (matrix[r][c] == target) {
                return new int[] { r, c };

            } else if (matrix[r][c] < target) {
                r++;
            } else {
                c--;
            }

        }

        return new int[] { -1, -1 };

    }
}
