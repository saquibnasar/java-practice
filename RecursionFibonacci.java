public class RecursionFibonacci {
    public static void main(String[] args) {
        int ans = recursionFibonacci(50);
        System.out.println(ans);

    }

    static int recursionFibonacci(int n) {

        if (n < 2) {
            return n;
        }
        return recursionFibonacci(n - 1) + recursionFibonacci(n - 2);

    }
}
