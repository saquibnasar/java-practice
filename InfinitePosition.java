public class InfinitePosition {
    public static void main(String[] args) {

        int[] arr = { 5, 7, 7, 7, 8, 8, 10, 9, 22, 2, 4, 34, 45, 3, 345, 345, 453, 65, 7, 8, 878, 45, 76, 5665, 6, 47,
                7, 67, 67, 7, 7, 6, 4, 6, 6, 7, 56, 56, 465, 68, 7867, 5435, 534, 5, 45, 5, 54, 56, 54, 65, 456, 645,
                64, 65, 54, 645, 65, 456, 645, 645, 564, 56, 564, 456, 564, 65, 6, 6, 46, 564, 564, 564, 6, 65 };
        int target = 45;

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else if (target == arr[mid]) {
                mid = 0;
            }

        }
        int ans = searchrange(arr, target, start, end);

        System.out.println(ans);
    }

    static int searchrange(int[] arr, int target, int start, int end) {
        if (start <= end) {
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
        }
        return -1;

    }

}
