package Pattern;

import java.util.Arrays;

public class SelectionSortRecursion {
    public static void main(String[] args) {
        int[] arr = { 3, 4, 2, 1 };
        System.out.println(Arrays.toString(selectionSort(arr, arr.length, 0, arr[0])));
    }

    static int[] selectionSort(int[] arr, int r, int c, int l) {
        if (r == 0) {
            return arr;
        }

        if (c < r) {
            if (arr[c] > arr[l]) {
                selectionSort(arr, r, c + 1, c);
            } else {
                selectionSort(arr, r, c + 1, l);
            }
        } else {
            int temp = arr[r - 1];
            arr[r - 1] = arr[l];
            arr[l] = temp;
            selectionSort(arr, r - 1, 0, 0);
        }
        return arr;
    }
}
