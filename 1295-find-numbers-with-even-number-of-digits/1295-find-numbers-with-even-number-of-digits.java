class Solution {
    public int findNumbers(int[] nums) {
        int n =nums.length;
        int get =0;
        for(int i=0; i<n; i++){
            int val = nums[i];
            int cnt =0;
            int ans =0;
            while(val >0){
                int rem = val%10;
                ans = ans*10 +rem;
                val /=10;
                cnt++;
            }
            if(cnt%2 ==0){
                get++;
            }
        }
        return get;
    }
}