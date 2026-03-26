import java.util.Arrays;

public class aggressivecows {
 
     boolean isPossible(int m,int k, int[]stalls)
     {
     int prev=stalls[0];
         k--;
         for(int i=0;i<stalls.length;i++)
         {
             if(stalls[i]-prev>=m)
             {
                 k--;
                 prev=stalls[i];
             }
             if(k==0)
             {
                 return true;
             }
         }
             return false;
         }
     
        // code here
         public int aggressiveCows(int[] stalls, int k) {
        Arrays.sort(stalls);
        int low=0;
        int high = stalls[stalls.length - 1] - stalls[0];
        int ans=-1;
        while(low<=high)
        {
          int mid=(low+high)/2;
        if(isPossible(mid,k,stalls))
          {
              ans=mid;
              low=mid+1;
          }
          else{
              high=mid-1;
          }
              
        }
        return ans;
    }
}

