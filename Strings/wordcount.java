

public class wordcount {
    public static int countWords(String s) {
    int count = 0;
    boolean inWord = false;

    for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i) != ' ' && !inWord) //here it checks that the character is inside of word or not because it is boolean and the if coondition block will excute only 
        //both the condition is true and here it totally depends on inword whether it is true or false
        {
            count++;
            inWord = true;
        } else if (s.charAt(i) == ' ') {
            inWord = false;
        }
    }
    return count;
}
}

