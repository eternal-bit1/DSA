package DSA.array;

public class sortcolors {
   
 // class Solution {
//     public void sortColors(int[] nums) {
//         int c0=0;
//         int c1=0;
//         int c2=0;
//         for(int i=0;i<nums.length;i++)
//         {
//             if(nums[i]==0)
//             c0++;
//             else if(nums[i]==1)
//             c1++;
//             else
//             c2++;
//         }
//       int  index=0;
//         for(int j=index;j<c0;j++)
//         {
//             nums[index++]=0;
            
//         }
//          for(int j=index;j<(c0+c1);j++)
//         {
//             nums[index++]=1;
//         }
//          for(int j=index;j<(c1+c2+c0);j++)
//         {
//             nums[index++]=2;
//         }
        
       
//     }
// }

        // DUTCH NATIONAL FLAG

    public void sortColors(int[] nums)
    {
       int low=0;    //index or position for 0
       int mid=0;   //current element
       int high=nums.length-1;   //position for 2
       int temp=0;
       while(mid<=high)
       {
        if(nums[mid]==2)
        {
            temp=nums[mid];
            nums[mid]=nums[high];
            nums[high]=temp;
            high--;
            
           
        }
        else if(nums[mid]==0)
        {
           temp=nums[mid];
           nums[mid]=nums[low];
           nums[low]=temp;
           low++;
           mid++;
        }
        else
        {   
           mid++;
        }
    }
}
}
