public class BinarySearch {
    public static void main(String[] args) {

        // https://leetcode.com/problems/binary-search/description/

        int[] arr = { -1, 0, 3, 5, 9, 12 };
        int target = 9;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }

    // return the index
    // return -1 if index does not exist

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else if (target == arr[mid]) {
                return mid;
            }

        }
        return -1;

    }
}