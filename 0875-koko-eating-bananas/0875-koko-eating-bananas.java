class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int max =0;
        for(int i=0; i<n; i++){
            max = Math.max(max, piles[i]);
        }
        int low = 1;
        int high = max;
        int ans =0;
        int val =0;
        while(low<=high){
            int mid = low+(high-low)/2;
            ans = findEating(piles, mid);
            if(ans <= h){
                val = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return val;

    }
    public int findEating(int[] arr, int mid){
        int ans = 0;
        for(int i=0; i<arr.length; i++){
            ans += Math.ceil((double) arr[i]/mid);
        }
        return ans;
    }
}