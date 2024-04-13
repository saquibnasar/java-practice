import java.util.Arrays;

public class FindANumberThatDoesNotHaveClone {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 1, 4, 5, 4, 2 };
        int ans = findANumberThatDoesNotHaveClone(arr);
        System.out.println(ans);

    }

    static int findANumberThatDoesNotHaveClone(int[] arr) {
        int ans = arr[0];
        int[] newArr = arrayShort(arr);
        for (int i = 1; i < newArr.length; i++) {
            if (newArr.length <= i + 1 || newArr[i] != newArr[i - 1] && newArr[i] != newArr[i + 1]) {
                return arr[i];
            }
        }
        return ans;
    }

    static int[] arrayShort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int small = arr[i];
            int a = i;
            for (int j = i + 0; j < arr.length; j++) {
                if (small > arr[j]) {
                    small = arr[j];
                    a = j;
                }
            }
            arr[a] = arr[i];
            arr[i] = small;
        }
        return arr;
    }
}
