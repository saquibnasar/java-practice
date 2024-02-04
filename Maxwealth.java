public class Maxwealth {
    public static void main(String[] args) {
        int[][] arr = {
                { 2, 5, 6 },
                { 2, 4, 8 },
                { 7, 6, 3 },
        };
        int output = maxwealth(arr);
        System.out.println(output);
    }

    static int maxwealth(int[][] arr) {
        int mostWealth = Integer.MIN_VALUE;

        for (int[] row : arr) {
            int money = 0;
            for (int i : row) {
                money = money + i;

            }
            if (money > mostWealth) {
                mostWealth = money;
            }

        }
        return mostWealth;
    }

}
