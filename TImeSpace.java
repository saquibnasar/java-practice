import java.util.Arrays;

public class TImeSpace {
    public static void main(String[] args) {

        int[] arr1 = { 1, 3 };
        int[] arr2 = { 2 };

        search(arr1, arr2);

    }

    static int search(int[] m, int[] n) {

        int[] arr = merge(m, n);
        System.out.println(Arrays.toString(arr));
        return -1;

    }

    static int[] merge(int[] m, int[] n) {

        int arr1L = m.length;
        int arr2L = n.length;
        int arr3L = arr1L + arr2L;
        int[] arr3 = new int[arr3L];

        for (int i = 0; i < (arr1L + arr2L) - 1; i = i + 1) {

            int size1 = arr1L;
            int size2 = arr2L;

            if (m[i] < n[i]) {
                arr3[i] = m[i];
            } else {
                arr3[i] = n[i];
            }
        }

        return arr3;

    }
}
