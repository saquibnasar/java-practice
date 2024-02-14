import java.util.Arrays;

public class FirstLastPosition {
    public static void main(String[] args) {
        int[] arr = { 5, 7, 7, 7, 8, 8, 10, 9, 22, 2, 4, 34, 45 };
        int target = 3;
        int[] ans = firstLastPosition(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] firstLastPosition(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int[] position = {};
        int mid = start + (end - start) / 2;
        while (start <= end) {
            if (target != arr[mid]) {
                mid = start + (end - start) / 2;
            }

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else if (target == arr[mid]) {
                if (position.length == 0) {
                    if (target != arr[mid - 1]) {
                        position = new int[] { mid };
                    } else {
                        mid = mid - 1;
                    }
                } else {
                    if (target != arr[mid + 1]) {
                        return position = new int[] { position[0], mid };
                    } else {
                        mid = mid + 1;
                    }
                }
            }

        }

        return new int[] { -1, -1 };
    }
}
