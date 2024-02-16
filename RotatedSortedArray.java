public class RotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = { 3, 4, 5, 6, 8, 0, 1, 2 };
        int target = 0;
        int ans = rotatedSortedArray(arr, target);
        System.out.println(ans);
    }

    static int rotatedSortedArray(int[] arr, int target) {

        int index = findpeak(arr);
        int ans = findTarget(arr, target, 0, index, true);

        if (ans == -1) {
            ans = findTarget(arr, target, index + 1, arr.length - 1, false);

        }
        return ans;
    }

    static int findpeak(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {

            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else if (arr[mid] > arr[mid - 1]) {
                start = mid + 1;
            } else if (arr[mid] < arr[mid - 1]) {
                end = mid - 1;
            }
        }

        return start;

    }

    static int findTarget(int[] arr, int target, int wheretoStart, int wheretoend, boolean increase) {

        int start = wheretoStart;
        int end = wheretoend;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (increase) {

                if (target > arr[mid]) {
                    start = mid + 1;
                } else if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target == arr[mid]) {
                    return mid;
                }
            } else {

                if (target > arr[mid]) {
                    start = start + 1;
                } else if (target < arr[mid]) {
                    end = end - 1;
                } else if (target == arr[mid]) {
                    return mid;
                }
            }

        }
        return -1;

    }
}