public class RotatedPosition {
    public static void main(String[] args) {

        int[] arr = { 15, 18, 2, 3, 6, 12 };
        int ans = rotatedSortedArray(arr);
        System.out.println(ans);
    }

    static int rotatedSortedArray(int[] arr) {

        int index = findpeak(arr);

        return index;
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
                return mid;
            }
        }

        return start;

    }

}
