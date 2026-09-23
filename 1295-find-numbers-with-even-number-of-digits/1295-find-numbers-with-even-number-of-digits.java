class Solution {
    public int findNumbers(int[] nums) {
        int n =nums.length;
        int get =0;
        for(int i=0; i<n; i++){
            
        String s = String.valueOf(nums[i]);
        if(s.length() %2 ==0){
            get++;
        }
        
        }
        return get;
    }
}