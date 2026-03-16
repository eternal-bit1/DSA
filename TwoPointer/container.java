package DSA.TwoPointer;

public class container {
    class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int maxwater=-1;
        int water=0;
        while(i<j)
        {
            water=Math.min(height[i],height[j])*(j-i);  //hum i aur j k height ka minimum le rhe h aur width nikalne k liye hme simply index ko minus krna hoga
            maxwater=Math.max(water,maxwater);
            
                if(height[i]<height[j])
                {
                    i++;
                }
                else
                {
                    j--;
                }

        }
        return maxwater;
     }
}
}
