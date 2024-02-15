import java.util.ArrayList;

public class Question {
    public static void main(String[] args) {
        // encode ("aaaabccaadeeee")j
        // Output should be nested array
        // [[4, a] [1, b] [2, c] [2, a] [1, d][4, e]]

        String[] arr = { "aaaabccaadeeee" };
        findNumberOfChar(arr);
    }

    static void findNumberOfChar(String[] arr) {
        String word = arr[0];
        char target = word.charAt(0);
        search(word, target);

    }

    static void search(String name, char target) {
        ArrayList<Integer> ans = new ArrayList<>(10);
        ArrayList<Character> list = new ArrayList<>(10);

        if (list.size() == 0) {
            int count = 0;
            for (int i = 0; i < name.length(); i++) {
                if (target == name.charAt(i)) {
                    count++;
                }
            }

            list.add(target);
            ans.add(count);
        }

        int count = 0;
        for (int j = 0; j < name.length(); j++) {

            if (!list.contains(name.charAt(j)) && !(list.get(0) == name.charAt(j))) {
                if (!(list.get(0) == target) && (j == name.length() - 1 || target != name.charAt(j))) {
                    if (j == name.length() - 1) {
                        count++;
                    }
                    ans.add(count);
                    count = 0;
                    list.add(target);
                }
                target = name.charAt(j);
                count++;

            }

        }

        System.out.println(list);
        System.out.println(ans);
    }

}