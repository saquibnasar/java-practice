import java.util.Arrays;

public class SubsequenceRecursion {
    public static void main(String[] args) {

        String word = "pwwkew";
        // i try to solve but could not

        // String[] subStrings = new String[(word.length() * 2) + 1];

        // String[] ans = subsequence(word, subStrings, 0);
        // System.out.println(Arrays.toString(ans));

        // answer
        // subseq("", word);
        longestsubstring("", word, 0);
    }

    // answer
    static void subseq(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;

        }
        char ch = up.charAt(0);
        subseq(p + ch, up.substring(1));
        subseq(p, up.substring(1));
    }

    // Longest Substring Without Repeating Characters leet code
    static void longestsubstring(String p, String up, int lon) {
        if (up.isEmpty()) {
            int tempcount = 0;
            for (int i = 0; i < p.length(); i++) {
                char ch = p.charAt(i);
                for (int j = i - 1; j > -1; j--) {
                    char ch2 = p.charAt(j);
                    if (ch != ch2) {
                        tempcount++;
                    } else {
                        if (tempcount > lon) {
                            lon = tempcount;
                            System.out.println(lon);
                        }
                    }

                }
            }
            System.out.println(p);
            return;

        }
        char ch = up.charAt(0);
        longestsubstring(p + ch, up.substring(1), lon);
        longestsubstring(p, up.substring(1), lon);
    }

    // i try to solve but could not
    static String[] subsequence(String word, String[] substrings, int arraynum) {
        if (word.isEmpty()) {
            return substrings;

        }
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (!(i == 0)) {
                substrings[arraynum] = substrings[arraynum - 1] + ch + "";
            } else {
                substrings[arraynum] = ch + "";
            }
            arraynum++;
        }

        return subsequence(word.substring(1), substrings, arraynum);
    }
}
