import java.util.ArrayList;
import java.util.List;

public class SetMismatch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 3, 5, 6 };

        System.out.println(cycleSort(arr));
    }

    static List<Integer> cycleSort(int[] arr) {

        int i = 0;

        while (i < arr.length) {

            int correct = arr[i] - 1;

            if (arr[i] < arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }

        }

        ArrayList<Integer> ans = new ArrayList<>();

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                ans.add(arr[j]);
                ans.add(j + 1);
            }
        }
        return ans;

    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
