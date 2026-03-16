

public class stringsfre {
         public static void main(String[] args) {
    
     
     String str="xxxbbbccccddyyyy";
      int fre[]=new int[26];     //starting me sabki i.e;indexx 0 se lekar 25 indx tk sbki vslue 0 hogi.
      //  and jab bhi koi character aayega to uski value 1 ho jayegi. and agar same character aaya to uski value 2
      //  ho jayegi and is tarah se count karte jayenge.
      for(int i=0;i<str.length();i++)
      {
          fre[str.charAt(i)-'a']++;  //isme char ko int me convert karne ke liye 'a' se minus karte hai. kyuki a=0, b=1, c=2, d=3 and so on.
          //joki index ko denote krta h aur jb bhi o index dubara milta value increases..
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
    

