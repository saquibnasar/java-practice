public class CountSteps {
    public static void main(String[] args) {
        // https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/description/

        int n = 14;
        System.out.println(countsteps(n, 0));
    }

    static int countsteps(int num, int count) {
        if (num == 0) {
            return count;
        }
        if (num % 2 == 0) {
            return countsteps(num / 2, count + 1);
        }
        return countsteps(num - 1, count + 1);

    }
}
