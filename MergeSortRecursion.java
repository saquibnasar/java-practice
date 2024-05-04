import java.util.Arrays;

public class MergeSortRecursion {
    public static void main(String[] args) {
        // https://leetcode.com/problems/merge-sorted-array/description/
        int[] arr = { 3, 9, 5, 6, 4, 8 };
        System.err.println(Arrays.toString(sort(arr)));
    }

    static int[] sort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = sort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = sort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right, new int[left.length + right.length], 0, 0);
    }

    static int[] merge(int[] arr1, int[] arr2, int[] merge, int count1, int count2) {

        if (arr1.length <= count1 && arr2.length <= count2) {
            return merge;
        }
        if (arr2.length <= count2) {
            merge[count1 + count2] = arr1[count1];
            return merge(arr1, arr2, merge, count1 + 1, count2);
        } else if (arr1.length <= count1) {
            merge[count1 + count2] = arr2[count2];
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
