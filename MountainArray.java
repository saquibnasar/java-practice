public class MountainArray {
    public static void main(String[] args) {
        int[] arr = { -4, -8, 0, -7, -4 };

        int ans = mountainArray(arr);
        System.out.println(ans);

    }

    static int mountainArray(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1] && arr[mid] > arr[mid - 1]) {
                return arr[mid];
            } else if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else if (arr[mid] > arr[mid - 1]) {
                start = mid + 1;
            }

        }

        return arr[start];

    }

}
