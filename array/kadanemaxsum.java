package DSA.array;

public class kadanemaxsum {
    class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0;
        int maximumsum=nums[0];
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            maximumsum=Math.max(maximumsum,sum);
            if (sum<0)
            {
                sum=0;
            }
          
        }
        return maximumsum;
    }
}
}
