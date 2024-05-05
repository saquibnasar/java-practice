import java.util.Arrays;

public class MergeSortRecursion {
    public static void main(String[] args) {
        // https://leetcode.com/problems/merge-sorted-array/description/
        // int[] arr = { 3, 9, 5, 6, 4, 8 };
        int[] arr = { 5, 4, 3, 2, 1 };
        System.err.println(Arrays.toString(sort(arr)));
    }

    static int[] sort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = sort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = sort(Arrays.copyOfRange(arr, mid, arr.length));

        // return merge(left, right, new int[left.length + right.length], 0, 0);
        return merge2(left, right);
    }

    static int[] merge2(int[] first, int[] second) {
        int[] max = new int[first.length + second.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                max[k] = first[i];
                i++;
            } else {
                max[k] = second[j];
                j++;
            }
            k++;
        }
        // it may be possible that one of the arrays is not complete

        while (i < first.length) {
            max[k] = first[i];
            i++;
            k++;
        }

        while (j < second.length) {
            max[k] = second[j];
            j++;
            k++;
        }
        return max;
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
