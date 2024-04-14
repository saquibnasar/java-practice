public class SetBits {
    public static void main(String[] args) {
        int n = 45;
        System.out.println(Integer.toBinaryString(n));

        System.out.println(setBits(n));
    }

    static int setBits(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            System.out.println(Integer.toBinaryString(n));
            n -= (n & -n);

        }
        return count;
    }
}
