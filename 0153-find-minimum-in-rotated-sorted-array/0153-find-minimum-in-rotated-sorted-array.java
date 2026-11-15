class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int low  = 0;
        int high = n-1;
        int minn = Integer.MAX_VALUE;
        while(low<= high){
            int mid = low + (high-low)/2;
            if(nums[low] <= nums[high]){
                if(nums[low]<=nums[mid]){
                    high = mid-1;
                }
                else{
                    low = mid+1;
                }
               
            }
            else{
                if(nums[mid]> nums[high]){
                    low = mid+1;
                }
                else{
                    high = mid-1;
                }
                
            }
              minn = Math.min(minn, nums[mid]);
        }
        return minn;
    }
}