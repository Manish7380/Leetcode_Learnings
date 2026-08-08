class Solution {
    public int firstMissingPositive(int[] nums) {
        int j =0;
        while(j < nums.length){
            int start = nums[j]-1;
            
            if(nums[j] > 0 && nums[j]<= nums.length &&  nums[j] != nums[start]){
                swap(nums, j, start);
            }else{
                j++;
            }
        }
        for(int i =0; i<nums.length; i++){
                if(nums[i] != i+1){
                    return i+1;
            }
            }
        
        return nums.length+1;
    }
    void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}