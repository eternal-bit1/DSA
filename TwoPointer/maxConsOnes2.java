package DSA.TwoPointer;

public class maxConsOnes2 {
    public int longestOnes(int[] nums, int k) {

//     int max = 0;
//     int n = nums.length;

//     for (int i = 0; i < n; i++) {
//         int zeroCount = k;
//         int count = 0;

//         for (int j = i; j < n; j++) {

//             if (nums[j] == 1) {
//                 count++;
//             } 
//             else if (nums[j] == 0 && zeroCount > 0) {
//                 count++;
//                 zeroCount--;
//             } 
//             else {
//                 break; // ❗ important
//             }
//         }

//         max = Math.max(max, count);
//     }

//     return max;
// }



        int left=0;
        int max_window_size=-1;
        //left pointer used for shrinking the window
        //right pointer used for grwoing the window size
        for(int right =0;right<nums.length;right++)
        {
           if(nums[right]==0)
           {
            k--;
           }
          //shrink the window when flip 0's
          while(k==-1)
          {
            if(nums[left]==0)
            {
                k++;
            } 
            left++;
          }
         int curr_window_size=right-left+1;
           if( curr_window_size>max_window_size)
           {
            max_window_size=curr_window_size;
           }
        }
        return max_window_size;
    }
}

