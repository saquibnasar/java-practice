public class RecursionPalindrome {
    public static void main(String[] args) {

        int num = 121;
        String n = Integer.toString(num);
        System.out.println(recursionPalindrome(n, 0, n.length() - 1));

    }

    static boolean recursionPalindrome(String num, int s, int n) {

        if (!(num.charAt(s) == num.charAt(n))) {
            return false;
        }
        if (s == n || n < s) {
            return true;

        }
        return recursionPalindrome(num, s + 1, n - 1);
    }
}
