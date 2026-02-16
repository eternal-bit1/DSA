public class rainwatertrap {
    public static void main(String[] args) {
        int arr[]={0,1,0,2,1,0,1,3,2,1,2,1};
        int leftmax[]=new int[arr.length];
        int rightmax[]=new int[arr.length];
        leftmax[0]=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            leftmax[i]=Math.max(leftmax[i-1],arr[i]);
        }
        rightmax[arr.length-1]=arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--)
        {
            rightmax[i]=Math.max(rightmax[i+1],arr[i]);
        }
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            count+=Math.min(leftmax[i],rightmax[i])-arr[i];
        }
        System.out.println(count);
    }
    
}
class Solution {
    public int trap(int[] height) {
        int rainwater=0;
        for(int i=0;i<height.length;i++)
        { int leftmax=0;int rightmax=0;
         for(int j=0;j<i;i++)
         {
            if (height[j]>leftmax)
            leftmax=height[j];
         }
         for(int k=i;k<height.length;k++)
         {
            if (height[k]>rightmax)
            rightmax=height[k];
         }
    rainwater+=Math.min(leftmax,rightmax)-height[i];
    }
    return rainwater;
    }
}
