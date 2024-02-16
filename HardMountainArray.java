public class HardMountainArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 3, 1 };
        int target = 0;

        int ans = mountainArray(arr, target);
        System.out.println(ans);
    }

    static int mountainArray(int[] arr, int target) {

        int max = search(arr, target, true);
        int num = search(arr, target, false);

        if (num == -1) {
            return -1;
        }
        if (num < max) {
            return num;
        }
        return max;

    }

    static int search(int[] arr, int target, boolean max) {

        int start = 0;
        int end = arr.length - 1;

        while (max ? start < end : start <= end) {
            int mid = start + (end - start) / 2;

            if (max) {
                if (arr[mid] > arr[mid + 1]) {
                    end = mid;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    start = mid + 1;
                } else if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target == arr[mid]) {
                    return mid;
                }
            }

        }
        if (!max) {
            return -1;
        }

        return start;

    }
}
