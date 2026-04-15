package DSA.Recursion;

import java.util.ArrayList;
import java.util.List;

public class subsets {
  
        void solve(int i,int []nums,List<List<Integer>>result,List<Integer>temp)
        {
            if(i==nums.length)
            {
              result.add(new ArrayList<>(temp)); //we cannot return anything as the func is void
              return; //we are returning here instead of void bcz it does not return nything justb rbeka the function
            }
            //include
            temp.add(nums[i]);
            solve(i+1,nums,result,temp);

            //exclude
            temp.remove(temp.size()-1);
            solve(i+1,nums,result,temp);   
}
    public List<List<Integer>> abc(int[] nums) 
    { 
        List<Integer> temp = new ArrayList<>(); //o arraylist jisme individual subsets store honge 
         List<List<Integer>> result = new ArrayList<>(); // kuch aisa bhi to chahiye jisme hum  subsets of list bana k use add kr ske to 2d arraylist banayenge.
          solve(0,nums,result,temp);
          return result;   //final answer is already updated in arraylist so we can return it.
    }
}
