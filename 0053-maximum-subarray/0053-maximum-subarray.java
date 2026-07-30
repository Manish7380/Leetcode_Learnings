class Solution {
    public int maxSubArray(int[] nums) {
        int m = nums[0];
        int c = nums[0];

        int s = 0;  
        int e = 0;  
        int t = 0;   

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > (c + nums[i])) {
                c = nums[i];
                t = i;
            } else {
                c = c + nums[i];
            }

            if (c > m) {
                m = c;
                s = t;
                e = i;
            }
        }

       

        return m;
    }
}