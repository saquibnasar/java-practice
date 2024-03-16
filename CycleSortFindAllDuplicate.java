
import java.util.ArrayList;

public class CycleSortFindAllDuplicate {

    public static void main(String[] args) {
        int[] arr = { 4, 3, 2, 7, 8, 2, 3, 1 };

        ArrayList<Integer> ans = cycleSort(arr);
        System.out.println(ans);

    }

    static ArrayList<Integer> cycleSort(int[] arr) {
        int i = 0;

        ArrayList<Integer> ans = new ArrayList<>();

        while (i < arr.length) {

            int correct = arr[i] - 1;
            if (i < arr.length - 1 && arr[i] == arr[i + 1]) {
                ans.add(arr[i]);
                i++;
            } else {
                if (arr.length <= arr[i]) {
                    i++;
                } else if (arr[i] != arr[correct]) {
                    swap(arr, i, correct);
                } else {
                    i++;
                }
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
