

import java.util.*;
public class LongestPalindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        
        int lower[]=new int[26];
        int upper[]=new int[26];
        
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch>='a'&&ch<='z')
            {
            lower[s.charAt(i)-'a']++;
            }
            else if(ch>='A'&&ch<='Z')
        {
            upper[s.charAt(i)-'A']++;
        }
        }
        int count=0; int single=0;
        for(int i=0;i<26;i++)
        {  
            if(lower[i]%2==0 )
            {
            count+=lower[i];
            }
            else if(lower[i]%2!=0)
            {
            lower[i]=lower[i]-1;
            single=1;

            count+=lower[i];
            }
        }
        for(int i=0;i<26;i++)
        {  
            if(upper[i]%2==0 )
            {
            count+=upper[i];
            }
            else if(upper[i]%2!=0)
            {
            upper[i]=upper[i]-1;
            single=1;

            count+=upper[i];
            }
        }
        count+=single;
        
        System.out.println(count);
    
}

    
}

    



