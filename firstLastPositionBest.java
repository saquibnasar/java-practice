import java.util.Arrays;

public class firstLastPositionBest {
    public static void main(String[] args) {
        int[] arr = { 5, 7, 7, 7, 8, 8, 10, 9, 22, 2, 4, 34, 45 };
        int target = 7;
        int[] ans = searchrange(arr, target);

        System.out.println(Arrays.toString(ans));
    }

    static int[] searchrange(int[] arr, int target) {
        int[] ans = { -1, -1 };

        ans[0] = search(arr, target, true);

        if (ans[0] != -1) {
            ans[1] = search(arr, target, false);
        }

        return ans;

    }

    static int search(int[] arr, int target, boolean findstartindex) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                if (findstartindex) {

                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return ans;
    }
}
