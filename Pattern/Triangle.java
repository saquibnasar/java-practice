package Pattern;

public class Triangle {
    public static void main(String[] args) {
        triangle(5, 5);
    }

    static void triangle(int start, int a) {
        if (start == 0) {
            return;
        }
        if (a > 0) {
            System.out.print("*" + " ");
            triangle(start, a - 1);
        } else {
            System.out.println();
            triangle(start - 1, start - 1);
        }
    }
}
