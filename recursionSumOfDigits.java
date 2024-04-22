public class recursionSumOfDigits {
    public static void main(String[] args) {

        int num = 32;
        System.out.println(factorial(num));
    }

    static int factorial(int num) {

        if (num == 0) {
            return 0;
        }
        return num % 10 + factorial(num / 10);
    }
}
