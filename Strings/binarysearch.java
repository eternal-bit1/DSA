public class binarysearch {

    public int search(int[] nums, int target) {
    int start=0;
    int end=nums.length-1;
    

while(start<=end)
{
    int mid=(start+end)/2;
    if(nums[mid] ==target)
    {
        return mid;
    }
    else if(nums[mid]<target) //target is smalller the we will search in left part of array
    {
        start=mid+1;
    }
    else if(nums[mid]>target) //target is greater the we will search in right part of array
    {
        end=mid-1;
    }
}
return -1;
        }
}


