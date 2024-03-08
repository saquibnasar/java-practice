public class ques1 {
    public static void main(String[] args) {
        int[] arr = { 2, 5, 6, 9, 7 };
        int ans = search(arr);
        System.out.println(ans);

    }

    static int search(int[] arr) {
        if (arr.length == 0) {
            return -1;
        }
        int max = arr[0];
        int secondmax = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (max < arr[i]) {
                secondmax = max;
                max = arr[i];
            } else if (secondmax < arr[i]) {
                secondmax = arr[i];
            }

        }

        return secondmax;
    }

}
