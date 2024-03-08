import java.util.Arrays;

public class SortAlgorithm {
    public static void main(String[] args) {
        int[] arr = { 3, 2, 4, 5, 1 };

        int ans[] = sortAlgorithm(arr);
        System.out.println(Arrays.toString(ans));

    }

    static int[] sortAlgorithm(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int max = 0;
            int p = 0;
            for (int j = 0; j < arr.length - i; j++) {
                if (max < arr[j]) {
                    max = arr[j];
                    p = j;
                }

            }

            arr[p] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = max;

        }

        return arr;
    }

}