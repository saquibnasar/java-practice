public class recursionBinary {
    public static void main(String[] args) {
        int[] arr = { 1, 5, 6, 9 };
        int target = 12;
        int ans = search(arr, target, 0, arr.length - 1);
        System.out.println(ans);
    }

    static int search(int[] arr, int target, int s, int e) {
        if (s > e) {
            return -1;
        }
        int mid = s + (e - s / 2);
        if (target == arr[mid]) {
            return mid;
        }
        if (target > arr[mid]) {
            return search(arr, target, mid + 1, e);
        }
        return search(arr, target, s, mid - 1);
    }
}
