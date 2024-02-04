public class EvenDigit {
    public static void main(String[] args) {
        int[] arr = { 12, 345, 2, 6, 7896 };

        int output = evenDigit(arr);
        System.out.println(output);
    }

    static int evenDigit(int[] arr) {
        int oddnum = 0;
        for (int i : arr) {
            int num = i;
            while (num > 0) {
                int test = num % 10;
                num = (num - test) / 10;
                if (test % 2 == 0) {
                    oddnum++;
                }
            }

        }
        return oddnum;
    }
}
