public class StringPerformance {
    public static void main(String[] args) {
        // normal way
        // String series = "";
        // for (int i = 0; i < 26; i++) {
        // char ch = (char) ('a' + i);
        // series = series + ch;

        // }

        // String builder

        StringBuilder series = new StringBuilder("");

        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            series.append(ch);

        }

        System.out.println(series);

    }
}
