package DSA.array;

public class sortcolors {
   
    public void sortColors(int[] nums) {
        int c0=0;
        int c1=0;
        int c2=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            c0++;
            else if(nums[i]==1)
            c1++;
            else
            c2++;
        }
      int  index=0;
        for(int j=index;j<c0;j++)
        {
            nums[index++]=0;
            
        }
         for(int j=index;j<(c0+c1);j++)
        {
            nums[index++]=1;
        }
         for(int j=index;j<(c1+c2+c0);j++)
        {
            nums[index++]=2;
        }
        
       
    }
}

