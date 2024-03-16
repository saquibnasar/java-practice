
public class Q3CycleSort {

    public static void main(String[] args) {
        int[] arr = { 1, 3, 4, 2, 2 };

        int ans = cycleSort(arr);
        System.out.println(ans);

    }

    static int cycleSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {

            int correct = arr[i] - 1;

            if ((arr[i] != arr[correct])) {
                swap(arr, i, correct);
            } else {
                i++;
            }

        }
        for (int j = 0; j < arr.length; j++) {
            if (j + 1 != arr[j]) {
                return arr[j];
            }

        }

        return arr.length;

    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
