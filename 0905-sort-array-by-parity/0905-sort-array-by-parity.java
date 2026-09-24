class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n= nums.length;
        int[] arr = new int[n];
        int a =0;
        int b =n-1;
        for(int i=0; i<n; i++){
            if(nums[i]%2==0){
                arr[a++] =nums[i];
            }
            else{
                arr[b--] = nums[i];
            }
        }
        return arr;
    }
}