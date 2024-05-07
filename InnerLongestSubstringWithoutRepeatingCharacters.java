/**
 * InnerLongestSubstringWithoutRepeatingCharacters
 */
public class InnerLongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {

        String word = "pwwkew";

        System.out.println(substring(word, "", ""));
    }

    static int substring(String word, String sub, String check) {
        if (word.isEmpty()) {
            return sub.length();
        }

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (sub.isEmpty()) {
                sub = ch + "";
            } else {

                for (int j = 0; j < sub.length(); j++) {
                    char subch = sub.charAt(j);

                    if (subch != ch) {
                        sub = sub + ch;
                        break;
                    } else {
                        check = ch + check;
                    }
                }
            }
        }
        return sub.length();
    }
}
