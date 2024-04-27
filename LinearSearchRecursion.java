import java.util.ArrayList;

public class LinearSearchRecursion {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 4, 8 };
        int target = 4;
        System.out.println(linearSearchAll(arr, 0, target));
    }

    static int linearSearch(int[] arr, int i, int target) {
        if (arr[i] == target) {
            return i;
        }
        if (arr.length == i + 1) {
            return -1;
        }
        return linearSearch(arr, i + 1, target);
    }

    static ArrayList<Integer> linearSearchAll(int[] arr, int i, int target) {
        ArrayList<Integer> list = new ArrayList<>();
        if (arr.length == i) {
            return list;
        }
        if (arr[i] == target) {
            list.add(i);
        }
        ArrayList<Integer> ans = linearSearchAll(arr, i + 1, target);
        list.addAll(ans);
        return list;

    }
}
