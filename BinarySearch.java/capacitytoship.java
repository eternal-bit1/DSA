
public class capacitytoship {
    boolean ispossible(int weights[], int mid, int days)
    {
        int day = 1;
        int ship_load = 0;
        for(int i=0;i<weights.length;)
        {
            if(ship_load + weights[i] <= mid)
            {
                ship_load += weights[i];
                i++;
            }
            else
            {
                day++;
                ship_load = 0;
            }
            if(day > days)
            {
                return false;
            }
        }
        return true;
    }
      public int shipWithinDays(int[] weights, int days) {
        int total = 0;
        for(int i=0;i<weights.length;i++)
        {
            total += weights[i];        
            }
        int start = 1;
        int end = total;
        int ans = -1;
        while(start <= end)
        {
            int mid = (start+end)/2;
            if(ispossible(weights,mid,days))
            {
                ans = mid;
                end = mid-1;
            }
            else
            {
                start = mid+1;
            }
        }
        return ans;
    }
}

