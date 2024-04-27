public class CountZero {
    public static void main(String[] args) {
        int n = 10201;
        System.out.println(countZero(n, 0));

    }

    static int countZero(int n, int count) {

        if (n == 0) {
            return count;
        }
        int a = n % 10;
        if (a == 0) {
            return countZero(n / 10, count + 1);

        }
        return countZero(n / 10, count);

    }
}
