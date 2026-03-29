public class kokoeatbanana {
    boolean ispossible(int[] piles,int mid,int h){
        int hr = 0;
        for(int i=0;i<piles.length;i++){
            if(piles[i]<=mid){
                hr++;
            }
            else if(piles[i]%mid==0){
                hr+=piles[i]/mid;
            }
            else if(piles[i]%mid!=0){
                hr+=piles[i]/mid+1;
            }
            if(hr>h) return false; 
        }
        return true;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int maxi = -1;
        for(int i=0;i<piles.length;i++){
            if(piles[i]>maxi){
                maxi=piles[i];
            }
        }
        int start = 1;
        int end = maxi;
        int ans =-1;
        
        
        while(start<=end){
            int mid = (start+end)/2;
            if(ispossible(piles,mid,h)){
                ans =mid;
                end = mid-1;
            }
            else {
                start = mid+1;
            }
        }
        return ans;
        
    }

}
