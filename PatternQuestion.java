public class PatternQuestion {
    public static void main(String[] args) {

        PatternQuestion(5);
    }

    static void PatternQuestion(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println(" ");

        }
    }

}
