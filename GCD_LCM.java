public class GCD_LCM {
    public static void main(String[] args) {

        // lcm of a and b
        System.out.println(lcm(2, 4));

        // gcd of a and b
        System.out.println(gcd(3, 5));

    }

    static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

    static int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        return gcd(b % a, a);
    }

}
