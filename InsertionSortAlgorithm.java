import java.util.Arrays;

public class InsertionSortAlgorithm {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        int[] ans = insertionSortAlgorithm(arr);
        System.out.println(Arrays.toString(ans));

    }

    static int[] insertionSortAlgorithm(int[] arr) {
        if (arr.length == 0) {
            return new int[] { -1 };
        }
        return arr;
    }
}
