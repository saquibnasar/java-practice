public class MinimumNumber {
    public static void main(String[] args) {
        int[] arr = { 5, 6, 7, 8, 3, 4 };

        int output = minimumNumber(arr);

        System.out.println(output);

    }

    static int minimumNumber(int[] arr) {

        if (arr.length == 0) {

            return -1;
        } else if (arr.length == 1) {
            return arr[0];
        }

        int smallNum = arr[0];

        for (int i : arr) {
            if (i < smallNum) {
                smallNum = i;
            }

        }
        return smallNum;
    }
}
