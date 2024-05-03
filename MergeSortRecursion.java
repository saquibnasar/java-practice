import java.util.Arrays;

public class MergeSortRecursion {
    public static void main(String[] args) {

        int[] arr1 = { 3, 9, 5 };
        int[] arr2 = { 4, 6, 8 };
        int[] arr = { 3, 9, 5, 6, 4, 8 };
        int[] ans = new int[arr1.length + arr2.length];

        // System.err.println(Arrays.toString(merge(arr1, arr2, ans, 0, 0)));
        System.err.println(Arrays.toString(sort(arr, 0, arr.length / 2)));
    }

    static int[] sort(int[] arr, int size1, int size2) {

        return arr;
    }

    static int[] merge(int[] arr1, int[] arr2, int[] merge, int count1, int count2) {

        if (arr1.length <= count1 && arr2.length <= count2) {
            return merge;
        }
        if (arr2.length <= count2) {
            merge[count1 + count2] = arr1[count1];
            return merge(arr1, arr2, merge, count1 + 1, count2);
        } else if (arr1.length <= count1) {
            return merge(arr1, arr2, merge, count1, count2 + 1);
        }

        if (arr1[count1] < arr2[count2] || arr2.length <= count2) {
            merge[count1 + count2] = arr1[count1];
            return merge(arr1, arr2, merge, count1 + 1, count2);
        } else {
            merge[count1 + count2] = arr2[count2];
            return merge(arr1, arr2, merge, count1, count2 + 1);
        }
    }
}
