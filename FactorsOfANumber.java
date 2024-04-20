import java.util.ArrayList;

public class FactorsOfANumber {
    public static void main(String[] args) {
        int factor = 20;
        factorsOfANumber(factor);
        System.out.println("");
        factorsOfANumber2(factor);
        System.out.println("");
        factorsOfANumber3(factor);
    }

    static void factorsOfANumber(int num) {
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }

    }

    static void factorsOfANumber2(int num) {
        for (int i = 1; i <= Math.sqrt(num); i++) {

            if (num % i == 0) {
                if (num / i == i) {
                    System.out.print(i);
                } else {
                    System.out.print(i + " " + num / i + " ");
                }
            }
        }

    }

    static void factorsOfANumber3(int num) {
        ArrayList<Integer> list = new ArrayList<>(2);
        for (int i = 1; i <= Math.sqrt(num); i++) {

            if (num % i == 0) {
                if (num / i == i) {
                    System.out.print(i);
                } else {
                    System.out.print(i + " ");
                    list.add(num / i);

                }
            }
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");

        }

    }
}
