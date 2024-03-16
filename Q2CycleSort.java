import java.util.ArrayList;

public class Q2CycleSort {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 6, 7 };

        ArrayList<Integer> ans = cycleSort(arr);
        System.out.println(ans);

    }

    static ArrayList<Integer> cycleSort(int[] arr) {
        int i = 0;

        ArrayList<Integer> ans = new ArrayList<>();

        while (i < arr.length) {

            int correct = arr[i] - 1;

            if (arr.length > arr[i] && (arr[i] != arr[correct])) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

        for (int j = 0; j < arr.length; j++) {

            if (j + 1 != arr[j]) {
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
