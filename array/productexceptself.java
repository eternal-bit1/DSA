package DSA.array;

public class productexceptself {
 
    public int[] productExceptSelf(int[] nums) {
int res[]=new int[nums.length];
//         for(int i=0;i<nums.length;i++)
//         {
//             int pro=1;
//             for(int j=0;j<nums.length;j++)
//             {
//                if(i!=j)
//                {
//                 pro=pro*nums[j];
//                }
//             }
//             res[i]=pro;
//         }
//             return res;
        
        int prefix[]=new int[nums.length];
        int suffix[]=new int[nums.length];
        //for prefix
         prefix[0]=1;
        for(int i=1;i<nums.length;i++)
        {
          prefix[i]=nums[i-1]*prefix[i-1];
        }

        //for suffix
         suffix[nums.length-1]=1;
        for(int j=nums.length-2; j>=0 ; j--)
        {
            suffix[j]=nums[j+1]*suffix[j+1];
        }
        for(int k=0;k<nums.length;k++)
        {
        res[k]=prefix[k]*suffix[k];
        }
        return res;
    }
}

