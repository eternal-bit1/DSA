package DSA.array;
class Solution {
    public int maxProduct(int[] nums) {
        int max=Integer.MIN_VALUE;
        int prefix=1;
        int suffix=1;
        for(int i=0;i<nums.length;i++)
        {
            if(prefix==0)
            {
                prefix=1;
            }
          prefix=prefix*nums[i];
          max=Math.max(max,prefix);
        }
          for(int j=nums.length-1; j>0 ;j--)
          { 
            if(suffix==0)
            {
                suffix=1;
            }
            suffix=suffix*nums[j];
            max=Math.max(max,suffix);
          }
          return max;
    }
    
}
// class Solution {
//     public int maxProduct(int[] nums) {
//         int max = nums[0];
//         int min = nums[0];
//         int ans = nums[0];

//         for (int i = 1; i < nums.length; i++) {
//             int curr = nums[i];

//             // store old max before updating
//             int tempMax = max;

//             max = Math.max(curr, Math.max(curr * max, curr * min));
//             min = Math.min(curr, Math.min(curr * tempMax, curr * min));

//             ans = Math.max(ans, max);
//         }

//         return ans;
//     }
// }