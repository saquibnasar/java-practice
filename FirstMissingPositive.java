import java.util.ArrayList;
import java.util.List;

public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 2 };
        System.out.println(cycleSort(arr));
    }

    static int cycleSort(int[] arr) {

        int i = 0;

        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (correct > 0 && arr[i] < arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }

        }

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] > 0 && arr[j] != j + 1) {
                return j + 1;
            }
        }
        return arr.length + 1;

    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
