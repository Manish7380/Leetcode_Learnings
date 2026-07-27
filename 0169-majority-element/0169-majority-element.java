import java.util.Arrays;
class Solution {
    public int majorityElement(int[] nums) {
        int p = nums.length/2 +1 ;
        
        Arrays.sort(nums);
        for(int i =0; i<nums.length; i++){
            int count = 0;
           for(int j=0; j<nums.length; j++){
            if(nums[i] == nums [j]){
                count++;
            }

           }
           if(count >= p){
            return nums[i];
           }

        }
        return -1;
    }
}