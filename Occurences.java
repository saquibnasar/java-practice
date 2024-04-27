import java.util.Scanner;

public class Occurences {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Please Enter a number ");
        int num = in.nextInt();
        in.close();
        int comprareNum = 13454324;

        int loop = String.valueOf(comprareNum).length();

        int nunberCount = 0;

        for (int i = 0; i < loop; i++) {

            int type = comprareNum % 10;
            comprareNum = comprareNum / 10;

            if (type == num) {
                nunberCount = nunberCount + 1;
            }

        }
        System.out.println(nunberCount);
    }

}
