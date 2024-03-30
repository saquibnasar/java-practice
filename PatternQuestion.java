public class PatternQuestion {
    public static void main(String[] args) {

        // PatternQuestion(5);
        PatternQuestion1(5);
    }

    static void PatternQuestion(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println(" ");

        }
    }

    static void PatternQuestion1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }

            System.out.println();

        }
    }

    static void PatternQuestion2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }

            System.out.println();

        }
    }

}
