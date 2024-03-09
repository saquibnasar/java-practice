import java.util.Arrays;

public class SortAlgorithm {
    public static void main(String[] args) {
        int[] arr = { 3, 2, 4, 5, 1 };

        sortAlgorithm(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void sortAlgorithm(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = i + 1; 0 < j; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                } else

                    break;

            }

        }

    }

    static void swap(int[] arr, int first, int second) {
        int fElement = arr[second];
        arr[second] = arr[first];
        arr[first] = fElement;
    }
}