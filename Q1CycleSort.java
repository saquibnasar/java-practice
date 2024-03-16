
public class Q1CycleSort {

    public static void main(String[] args) {
        int[] arr = { 3, 0, 1 };

        int ans = cycleSort(arr);
        System.out.println(ans);

    }

    static int cycleSort(int[] arr) {
        int i = 0;
        int n = 0;
        while (i < arr.length) {

            int correct = arr[i];

            if (arr.length <= correct) {
                n = i;
                i++;
            } else {
                if ((arr[i] != arr[correct])) {
                    swap(arr, i, correct);
                } else {
                    i++;
                }
            }

        }

        return n;

    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
