package DSA.TwoPointer;

import java.util.Arrays;

public class kdiffpairs {
    
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        int count=0;
        int low=0;
        int high=1;
        int sum=Integer.MIN_VALUE;
        while(high<nums.length && low<nums.length-1)
        {
            if(nums[high]-nums[low]==k && nums[high]+nums[low]!=sum)  //the second part is to handle duplicate case
            {
              sum=nums[high]+nums[low];
              count++;
              low++;
              high--;
            }
            else if(nums[high]-nums[low] < k)
            {
                high++;
            }
            else 
            {
                low++;
            }
            if(low==high)
            {
                high++;
            }
        }
        return count;

    }
    
}
