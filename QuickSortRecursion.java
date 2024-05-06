import java.util.Arrays;

public class QuickSortRecursion {
    public static void main(String[] args) {
        int[] arr = { 10, 80, 30, 90, 40, 50, 70 };
        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }
    // mine atampt

    // static int[] sort(int[] arr, int pivot, int s, int e) {

    // while (s <= e) {
    // if (arr[s] > pivot) {
    // int temp = arr[s];
    // arr[s] = arr[e];
    // arr[e] = temp;
    // e--;
    // } else if (arr[e] < pivot) {
    // int temp = arr[s];
    // arr[s] = arr[e];
    // arr[e] = temp;
    // s++;
    // } else if (arr[s] < pivot) {
    // s++;
    // } else {
    // break;
    // }
    // }
    // if (s >= e) {
    // return arr;
    // }
    // return sort(arr, arr[e], 0, e);
    // }

    static void sort(int[] arr, int low, int hi) {
        if (low >= hi) {
            return;
        }
        int s = low;
        int e = hi;
        int mid = s + (e - s) / 2;
        int pivot = arr[mid];
        while (s <= e) {
            // also a reason why if its already sprted it will not swap
            while (arr[s] < pivot) {
                s++;
            }
            while (arr[e] > pivot) {
                e--;
            }
            if (s <= e) {
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }

        }

        // now my pivot is at correct index, please sort two halves now
        sort(arr, low, e);
        sort(arr, s, hi);

    }
}
