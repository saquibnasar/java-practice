import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        // 5,6,8
        // num 5
        int num1 = a.nextInt();
        int num2 = a.nextInt();
        int num3 = a.nextInt();
        int big = num1;

        if (big < num2) {
            big = num2;
            if (big < num3) {
                big = num3;
            }

        }
        System.out.println(big);

    }
}
