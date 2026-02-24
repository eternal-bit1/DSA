public class FirstAndLastSearch {
    int lower_bound(int nums[],int target)
    {
        int start=0;
        int end=nums.length-1;
        int ans=-1;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(nums[mid]==target)
            {
                ans=mid;
                end=mid-1;
            }
            else if(nums[mid]<target)
            {
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }
        }
        return ans;
    }
    int upper_bound(int nums[],int target)
    {
        int start=0;
        int end=nums.length-1;
        int ans=-1;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(nums[mid]==target)
            {
                ans=mid;
                start=mid+1;
            }
            else if(nums[mid]<target)
            {
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }
        }
        return ans;
    }   
    public int[] searchRange(int[] nums, int target)
    {
       int first_position=lower_bound(nums,target);
       int last_position=upper_bound(nums,target);
       int output[]=new int[2];
       output[0]=first_position;
       output[1]=last_position;
       return output;
    }

}
