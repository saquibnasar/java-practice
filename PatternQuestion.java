public class PatternQuestion {
    public static void main(String[] args) {

        // PatternQuestion5(5);
        // PatternQuestion1(5);
        // PatternQuestion3(5);
        // PatternQuestion4(5);
        // PatternQuestion6(5);
        // PatternQuestion7(5);
        PatternQuestion8(4);
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

    static void PatternQuestion7(int n) {
        for (int i = 1; i < 2 * n; i++) {
            int col = i > n ? 2 * n - i : i;
            int space = n - col;
            for (int j = 0; j < space; j++) {
                System.out.print("   ");
            }
            for (int j = col; j > 0; j--) {
                System.out.print(" " + j + " ");
            }

            for (int j = 2; j < col + 1; j++) {
                System.out.print(" " + j + " ");
            }
            System.out.println();

        }
    }

    static void PatternQuestion8(int n) {
        int originN = n;
        n = 2 * n - 2;
        for (int i = 0; i <= n; i++) {

            for (int j = 0; j <= n; j++) {
                int atEveryIndex = originN - Math.min(Math.min(i, j), Math.min(n - i, n - j));
                System.out.print(atEveryIndex + " ");
            }

            System.out.println();

        }
    }
}
