public class IthBItOfNumber {
    public static void main(String[] args) {
        int n = 20; // 10101
        int i = 3;
        int ans = n & (1 << (i - 1));
        System.out.println(ans);
    }
}
