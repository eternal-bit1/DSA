
import java.util.*;
public class keyboardRow {
    
    public String[] findWords(String[] words) {

        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";

        ArrayList<String> arr = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {

            int[] row = new int[3];
            String word = words[i].toLowerCase();

            for (int j = 0; j < word.length(); j++) {

                char ch = word.charAt(j);

                if (row1.indexOf(ch) != -1) {
                    row[0] = 1;
                }
                else if (row2.indexOf(ch) != -1) {
                    row[1] = 1;
                }
                else if (row3.indexOf(ch) != -1) {
                    row[2] = 1;
                }
            }

            if (row[0] + row[1] + row[2] == 1) {
                arr.add(words[i]);
            }
        }

        String[] res = new String[arr.size()];

        for (int k = 0; k < arr.size(); k++) {
            res[k] = arr.get(k);
        }

        return res;
    }
}


     
// class Solution {
//     public String[] findWords(String[] words) {
//        String row1 =  "qwertyuiop";
//        String row2 =  "asdfghjkl";
//        String row3 =  "zxcvbnm";
//        ArrayList<String> arr = new ArrayList<>();
//         int k=0;
//         for(int i=0; i< words.length;i++){
//             int row[] = new int[3];
//             for(char ch:words[i].toLowerCase().toCharArray()){
//                 if(row1.indexOf(ch)!=-1){
//                     row[0]=1;
//                 }
//                  else if(row2.indexOf(ch)!=-1){
//                     row[1]=1;
//                 }
//                  else if(row3.indexOf(ch)!=-1){
//                     row[2]=1;
//                 }
//             }
//             if(row[0]+ row[1]+row[2]==1)
//             {
//                arr.add(words[i]);
//             }
//         }
//         String res[] = new String [arr.size()];
//         for(String word: arr){
//              res[k] = word;
//                 k++;
//         }
//        return res;
//     }
// }