public class Reverse {
    public static void main(String[] args) {

        int n = 13454;

        // method one

        // String newn = "";

        // while (n > 0) {

        // int type = n % 10;
        // String newcn = String.valueOf(type);
        // newn = newn + newcn;
        // n = n / 10;
        // }

        // System.out.println(newn);

        // method second
        int newnum = 0;
        while (n > 0) {

            int remender = n % 10;

            newnum = newnum * 10 + remender;
            n = n / 10;
        }

        System.out.println(newnum);
    }

}
