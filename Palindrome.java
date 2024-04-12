public class Palindrome {
    public static void main(String[] args) {
        int num = 121;
        System.out.println(palindrome(num));
    }

    static boolean palindrome(int num) {
        String origin = String.valueOf(num);
        String newNum = "";
        for (int i = 0; i < origin.length(); i++) {
            int singleInt = (num % 10);
            num = num / 10;
            newNum = newNum + String.valueOf(singleInt);
        }
        if (origin.equals(newNum)) {
            return true;
        }
        return false;

    }
}
