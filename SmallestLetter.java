public class SmallestLetter {
    public static void main(String[] args) {
        char[] arr = { 'c', 'f', 'j' };

        char target = 'c';

        char ans = smallestLetter(arr, target);
        System.out.println(ans);
    }

    static char smallestLetter(char[] arr, char target) {

        int start = 0;
        int end = arr.length - 1;
        int mid = 0;

        while (start <= end) {
            mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        if (start > arr.length - 1) {
            return arr[0];
        }

        return arr[start];

    }
}
