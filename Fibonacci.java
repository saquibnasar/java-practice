import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please Enter a number ");
        int num = in.nextInt();
        in.close();
        int f = 0;
        int l = 1;
        for (int j = 0; j < num - 1; j++) {

            int prevl = l;
            l = f + l;

            f = prevl;

            System.out.println(l);
        }
        System.out.println(l);
    }
}
