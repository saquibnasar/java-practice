class Factorial {
    public static void main(String[] args) {
        int num = 3;
        System.out.println(factorial(num));
    }

    static int factorial(int num) {
        if (num == 1) {
            return 1;
        }
        return num * factorial(num - 1);
    }
}