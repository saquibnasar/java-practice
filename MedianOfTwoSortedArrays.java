public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = { 1, 3 };
        int[] arr2 = { 2, 4, 5, 6 };

        search(arr1, arr2);

    }

    static void search(int[] m, int[] n) {
        int[] arr = merge(m, n);
        if (arr.length % 2 == 0) {
            int value1 = arr[(arr.length / 2) - 1];
            int value2 = arr[(arr.length) / 2];
            float ans = (value1 + value2) / 2f;
            System.out.print(ans);
        } else {
            float ans = arr[((arr.length + 1) / 2) - 1];
            System.out.println(ans);
        }

    }

    static int[] merge(int[] m, int[] n) {

        int arr1L = m.length;
        int arr2L = n.length;
        int arr3L = arr1L + arr2L;
        int[] arr3 = new int[arr3L];
        int size1 = 0;
        int size2 = 0;
        for (int i = 0; i < (arr1L + arr2L); i = i + 1) {
            if (size1 < arr1L && (size2 >= arr2L || m[size1] < n[size2])) {
                arr3[i] = m[size1];
                size1++;
            } else if (size2 < arr2L) {
                arr3[i] = n[size2];
                size2++;
            }
        }
        return arr3;

    }
}
