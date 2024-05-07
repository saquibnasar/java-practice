class SkipCharacterRecursion {
    public static void main(String[] args) {

        String word = "baccad";
        System.out.println(skipCharacter(word, 0));

    }

    static String skipCharacter(String word, int start) {
        if (start == word.length()) {
            return "";
        }
        if (word.charAt(start) == 'a') {
            return skipCharacter(word, start + 1);
        } else {

            return word.charAt(start) + skipCharacter(word, start + 1);
        }
    }
}