public class CheckPrevPrime {
    public static void main(String[] args) {

        // given a number check all the previous prime number
        int n = 40;
        prime(n);
    }

    static void prime(int n) {

        for (int i = 0; i < n; i++) {
            isPrime(i);
        }
    }

    static void isPrime(int n) {
        if (n <= 1) {
            return;
        }
        int c = 2;
        while (c * c <= n) {

            if (n % c == 0) {
                return;
            }
            c++;
        }

        System.out.println(n);
    }
}
