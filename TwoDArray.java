import java.util.Arrays;

public class TwoDArray {
    public static void main(String[] args) {
        int[][] arr = {
                { 23, 6, 8 },
                { 6, 8, 65 },
                { 35, 53, 345, 6, 654 },
                { 54, 45, 1 }
        };
        int target = 3;
        int[] output = search(arr, target);
        System.out.println(Arrays.toString(output));
    }

    static int[] search(int[][] arr, int target) {

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[col][row] == target) {
                    return new int[] { row, col };
                }
            }
        }

        return new int[] { 0, 0 };

    }
}
