public class SplitArrayLargest {
    public static void main(String[] args) {
        int[] arr = { 7, 2, 5, 10, 8 };

        int ans = splitArrayLargest(arr, 2);
        System.out.println(ans);
    }

    static int splitArrayLargest(int[] arr, int mValue) {
        int m = mValue;

        int ans = 0;
        int a = 0;
        for (int j = 0; j < arr.length - 1; j++) {
            int lowValue = 0;

            int m1 = 0;
            int m2 = 0;

            for (int i = 0; i <= arr.length - 1; i++) {

                if (i <= a) {
                    m1 = m1 + arr[i];
                } else {
                    m2 = m2 + arr[i];
                }

                if (m1 > m2) {
                    lowValue = m1;

                } else {
                    lowValue = m2;
                }

            }
            if (lowValue < ans || ans == 0) {
                ans = lowValue;
            }
            a++;
        }

        return ans;
    }
}
