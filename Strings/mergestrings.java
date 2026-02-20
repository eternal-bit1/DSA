class mergestrings {
    public String mergeAlternately(String word1, String word2) {
//          StringBuilder sb= new StringBuilder();
//         int i=0;
//         int j=0;
//         while(i<word1.length()||j<word2.length())
//         {
//             if(i<word1.length())
//             {
//          sb.append(word1.charAt(i));
//          i++;
//             }
//          if(j<word2.length())
//          {
//          sb.append(word2.charAt(j));
//          j++;
//     }
//         }
//     return sb.toString();
// }
// }

    
        
        StringBuilder result = new StringBuilder();
        
        int maxLength = Math.max(word1.length(), word2.length());
        
        for (int i = 0; i < maxLength; i++) {
            
            if (i < word1.length()) {
                result.append(word1.charAt(i));
            }
            
            if (i < word2.length()) {
                result.append(word2.charAt(i));
            }
        }
        
        return(result.toString()); //result is a StringBuilder. and it is not a string so we must convert it into string first.
    }
}