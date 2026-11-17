class Solution {
   public static int divisorCount(int[] arr, int mid){
        int len = arr.length;
        int count =0;
        for(int i=0; i<len; i++){
            count += Math.ceil((double) arr[i]/mid);
        }
        return count;
    }
    public static int smallestDivisor(int[] arr, int thresh){
        int low = 1;
        int high =0;
        for (int i = 0; i < arr.length; i++) {
            high = Math.max(high, arr[i]);
        }
        int ans = high;
        while(low<= high){
            int mid = low+(high-low)/2;
            int count = divisorCount(arr, mid);
            if(count <=thresh){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }
}
