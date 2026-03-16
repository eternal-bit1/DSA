
     //bruteforce approach

    
//     public int maxSubArray(int[] nums) {
//         int n=0;
//          for(int i=0;i<nums.length;i++)
//         {
//             for(int j=i;j<nums.length;j++)
//             {
//                 int sum =0;
//                 for(int k =i;k<=j;k++)
//                 {
//                     sum=sum+nums[k];
//                     n=Math.max(sum,n);
//                 }
//             }
//         }
//         return n;
//     }
// }
 
 
                    //    OPTIMAL APPROACH

public class kadane {
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
