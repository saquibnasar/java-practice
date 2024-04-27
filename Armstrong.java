import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();
        boolean ans = armstrong(n);
        System.out.println(ans);

    }

    static boolean armstrong(int n) {
        if (n < 100) {
            System.out.println("Enter valid number");
        }
        int orignalValue = n;
        int newValue = 0;

        while (n > 0) {

            int remender = n % 10;

            newValue = newValue + remender * remender * remender;

            n = n / 10;
        }

        return newValue == orignalValue;
    }

}
