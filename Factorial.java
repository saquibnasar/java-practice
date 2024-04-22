class Factorial {
    public static void main(String[] args) {
        int num = 3;
        System.out.println(factorial(num));
    }

    static int factorial(int num) {

        if (num == 1) {
            return 1;
        }

        int multi = factorial(num - 1);
        int ans = num * multi;
        return ans;
    }
}