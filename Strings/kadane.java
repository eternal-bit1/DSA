public class kadane {
    
    public int maxSubArray(int[] nums) {
        int n=0;
         for(int i=0;i<nums.length;i++)
        {
            for(int j=i;j<nums.length;j++)
            {
                int sum =0;
                for(int k =i;k<=j;k++)
                {
                    sum=sum+nums[k];
                    n=Math.max(sum,n);
                }
            }
        }
        return n;
    }
}
 