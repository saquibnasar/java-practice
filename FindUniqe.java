public class FindUniqe {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 4, 5, 6, 6, 4, 2, 1 };
        int check = 5 & 1;
        // int check = 4 ^ 3;
        System.out.println(check);
        int ans = findUniqe(arr);

        // System.out.println(ans);

    }

    static int findUniqe(int[] arr) {
        int uniqe = 0;
        for (int i : arr) {
            uniqe ^= i;

        }
        return uniqe;

    }
}
