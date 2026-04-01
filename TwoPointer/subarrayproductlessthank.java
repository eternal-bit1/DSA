package DSA.TwoPointer;

public class subarrayproductlessthank {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int left=0;
       int right=0;
        int count=0;
        int pro=1;
        while(right<nums.length)
        {
          pro*=nums[right];
          while(pro>=k && left<=right)
          {
            pro=pro/nums[left];
            left++;
          }
            count+=(right-left+1);
            right++;
        }
           return count;
    }
}
