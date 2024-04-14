import java.util.Arrays;

public class FlipAndInvertImages {
    public static void main(String[] args) {
        int[][] arr = { { 1, 1, 0 } };
        int[][] ans = flipAndInvertImages(arr);
        System.out.println(Arrays.toString(ans));
    }

    static int[][] flipAndInvertImages(int[][] arr) {

        for (int[] row : arr) {
            for (int i = 0; i < (arr.length + 1) / 2; i++) {
                int temp = row[i] ^ 1;
                row[i] = row[arr[0].length - i - 1] ^ 1;
                row[arr[0].length - i - 1] = temp;
            }
        }
        return arr;
    }
}
