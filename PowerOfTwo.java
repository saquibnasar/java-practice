public class PowerOfTwo {
    public static void main(String[] args) {
        int n = 1;
        Boolean ans = (n & (n - 1)) == 0;
        System.out.println(ans);
    }
}
