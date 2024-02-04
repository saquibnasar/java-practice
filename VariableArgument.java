import java.util.Arrays;

public class VariableArgument {
    public static void main(String[] args) {
        valuestore(342, 243243, 342342423, 234432234);

        int a = fun(43);
        String b = fun("fsd");
        fun();
        System.out.println(a);
        System.out.println(b);

    }

    static void valuestore(int... p) {
        System.out.println(Arrays.toString(p));
    }

    static int fun(int a) {
        return a;
    }

    static String fun(String b) {
        return b;
    }

    static void fun() {
        System.out.println("dffsddfssk");
    }
}
