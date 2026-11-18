class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int n = weights.length;
        int max = 0;
        int sum =0;
        for(int i=0; i<n; i++){
            sum +=weights[i];
            if(weights[i]>max){
                max = weights[i];
            }

        }
        int low = max;
        int high = sum;
        int ans = 0;
        while(low<=high){
            int mid = low +(high-low)/2;
            int reqDays = daysRequired(weights,mid);
            if(reqDays <= days){
                ans = mid;
                high = mid -1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }
    public int daysRequired(int[] weights, int capacity){
        int day = 1;
        int load = 0;
        for(int i=0; i<weights.length; i++){
            if(load + weights[i] > capacity){
                day = day +1;
                load = weights[i];
            }
            else{
                load = load+weights[i];
            }
        }
        return day;
    }
}