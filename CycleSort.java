import java.util.Arrays;

public class CycleSort {

    public static void main(String[] args) {
        // int[] arr = { 3, 5, 2, 1, 4 };
        int[] arr = { 1, 2, 3, 4, 5 };
        cycleSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void cycleSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            // if (!(arr[i] == i + 1)) {
            // int a = arr[arr[i] - 1];
            // arr[arr[i] - 1] = arr[i];
            // arr[i] = a;
            // } else {
            // i++;
            // }

            int correct = arr[i] - 1;

            if ((arr[i] != arr[correct])) {
                swap(arr, i, correct);
            } else {
                i++;
            }

        }

    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}