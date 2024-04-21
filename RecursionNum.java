public class RecursionNum {
    public static void main(String[] args) {
        int num = 5;
        printBoth(num);
    }

    static void printBoth(int n) {
        if (n == 0) {
            return;
        }

        System.out.println(n);

        printBoth(n - 1);

        System.out.println(n);
    }

    static void recursion5to1(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);

        recursion5to1(n - 1);
    }

    static void recursion1to5(int n) {
        if (n == 0) {
            return;
        }
        recursion1to5(n - 1);
        System.out.print(n + " ");
    }
}
