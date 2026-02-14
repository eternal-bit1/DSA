package DSA.Strings;

public class stringsfre {
         public static void main(String[] args) {
    
     
     String str="xxxbbbccccddyyyy";
      int fre[]=new int[26];
      for(int i=0;i<str.length();i++)
      {
          fre[str.charAt(i)-'a']++;
      }
      char ch='$';
      int max=fre[0];
      for(int i=1;i<fre.length;i++)
      {
          if(fre[i]>max)
          {
              ch=(char)(i+'a');
             max=fre[i]; 
          }
      }
      System.out.println(ch);
    }
}
    

