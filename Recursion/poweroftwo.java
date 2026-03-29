    import java.util.*;
package DSA.Recursion;

public class poweroftwo {


    boolean solve(int i, int n)
    {
    if(Math.pow(2,i)==n)
    {
        return true;
    }
    if(Math.pow(2,i)>n)
    {
        return false;
    }
   return solve(i+1,n);  //jo bhi next recursive call return karega ye bhi wahi return kr dega niche wale calling function ko

  
}
    public boolean isPowerOfTwo(int n) {
        int i=0;
      return solve(i,n);
   
    }
}
