package DSA.Strings;

public class wordcount {
    public static int countWords(String s) {
    int count = 0;
    boolean inWord = false;

    for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i) != ' ' && !inWord) {
            count++;
            inWord = true;
        } else if (s.charAt(i) == ' ') {
            inWord = false;
        }
    }
    return count;
}
}

