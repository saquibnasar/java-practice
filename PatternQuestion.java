public class PatternQuestion {
    public static void main(String[] args) {

        // PatternQuestion5(5);
        // PatternQuestion1(5);
        // PatternQuestion3(5);
        // PatternQuestion4(5);
        PatternQuestion6(5);
    }

    static void PatternQuestion5(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println(" ");

        }
    }

    static void PatternQuestion1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }

            System.out.println();

        }
    }

    static void PatternQuestion2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n - i; j > 0; j--) {
                System.out.print("*");
            }

            System.out.println();

        }
    }

    static void PatternQuestion3(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j < i + 1; j++) {

                System.out.print(j + " ");
            }

            System.out.println();

        }
    }

    static void PatternQuestion4(int n) {
        for (int i = 0; i < 2 * n; i++) {
            int col = i > n ? 2 * n - i : i;
            for (int j = 0; j < col; j++) {
                System.out.print("* ");
            }

            System.out.println();

        }
    }

    static void PatternQuestion6(int n) {
        for (int i = 0; i < 2 * n; i++) {
            int col = i > n ? 2 * n - i : i;
            int space = n - col;
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < col; j++) {
                System.out.print(" *");
            }
            System.out.println();

        }
    }
}
