import java.util.Arrays;
class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int n =nums.length-1;
        for(int i =1; i<=n; i+=3){
            if(nums[i] != nums[i-1]){
                return nums[i-1];
            }
        }
        return nums[n];
    }
}