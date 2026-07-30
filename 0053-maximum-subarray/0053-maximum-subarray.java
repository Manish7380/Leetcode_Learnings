class Solution {
    public int maxSubArray(int[] nums) {
        int curr_max = nums[0];
        int far_max = nums[0];

        //Kadane's Algorithm

        for (int i = 1; i < nums.length; i++) {
            curr_max = Math.max(nums[i], curr_max +nums[i]);
            far_max = Math.max(far_max ,curr_max );
       
        }
        return far_max;
        
    }
}