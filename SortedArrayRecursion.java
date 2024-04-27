/**
 * SortedArray
 */
public class SortedArrayRecursion {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 8, 12, 9 };
        System.out.println(sortedArray(arr, 0));
    }

    static boolean sortedArray(int[] arr, int i) {
        if (arr.length == i + 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }

        return sortedArray(arr, i + 1);
    }
}