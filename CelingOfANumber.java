/**
 * CelingOfANumber
 */
public class CelingOfANumber {
    public static void main(String[] args) {
        int[] arr = { 4, 6, 7, 8, 9, 43, 234 };
        int target = 10;
        int ans = celingOfANumber(arr, target);
        System.out.println(ans);
    }

    static int celingOfANumber(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;
        int mid = 0;

        while (start <= end) {
            mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else if (target == arr[mid]) {
                return arr[mid];
            }
        }

        return arr[start];

    }
}