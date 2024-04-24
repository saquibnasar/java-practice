public class RecursionReverse {
    static int sum = 0;

    static void recursionReverseWay2(int num) {
        if (num == 0) {
            return;
        }

        int a = (num % 10);
        sum = sum * 10 + a;
        recursionReverseWay2(num / 10);

    }

    public static void main(String[] args) {
        int num = 1342;
        recursionReverseWay2(num);
        System.out.println(sum);
    }

    static int recursionReverse(int num) {
        if (num % 10 == num) {
            return num;
        }

        int a = num % 10;

        for (int i = 1; i < Integer.toString(num).length(); i++) {
            a = a * 10;
        }

        return a + recursionReverse(num / 10);
    }

}
