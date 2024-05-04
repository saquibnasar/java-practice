public class RotatedBinarySearch {
    public static void main(String[] args) {
        // https://leetcode.com/problems/search-in-rotated-sorted-array/description/
        int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;

        // one way to solve this problem
        System.out.println(search(arr, target, 0, arr.length - 1));

        // another way to solve this problem
        System.out.println(recursionRotatedBinarySearch(arr, target, 0, arr.length - 1));

    }

    static int recursionRotatedBinarySearch(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;

        if (arr[mid] == target) {
            return mid;
        }
        if (arr[start] <= arr[mid]) {
            if (target >= arr[start] && target <= arr[mid]) {
                return recursionRotatedBinarySearch(arr, target, start, mid - 1);
            } else {
                return recursionRotatedBinarySearch(arr, target, mid + 1, end);
            }
        }
        // if (arr[start] >= arr[mid] && target <= arr[mid]) {
        if (target >= arr[mid] && target <= arr[end]) {
            return recursionRotatedBinarySearch(arr, target, mid + 1, end);
        }
        return recursionRotatedBinarySearch(arr, target, start, mid - 1);
    }

    static int search(int[] arr, int target, int start, int end) {

        if (arr.length < 3) {
            return 0;
        }
        int breakpoint = helperPosition(arr, start, end);
        int ans = helper(arr, target, start, breakpoint);
        if (ans == -1) {
            ans = helper(arr, target, breakpoint + 1, end);
        }
        return ans;
    }

    static int helperPosition(int[] arr, int start, int end) {
        int mid = start + (end - start) / 2;
        if (arr[mid] > arr[mid + 1] || arr[mid] < arr[mid - 1]) {
            return mid;
        }
        if (arr[mid] > arr[mid - 1]) {
            helperPosition(arr, mid + 1, end);
        }
        return helperPosition(arr, start, mid - 1);
    }

    static int helper(int[] arr, int target, int start, int end) {

        int mid = start + (end - start) / 2;
        int ans = -1;
        if (start > end) {
            return -1;
        }
        if (arr[mid] == target) {
            return mid;
        }
        if (arr[mid] < target) {
            ans = helper(arr, target, mid + 1, end);
        } else {
            ans = helper(arr, target, start, mid - 1);
        }
        return ans;
    }
}
