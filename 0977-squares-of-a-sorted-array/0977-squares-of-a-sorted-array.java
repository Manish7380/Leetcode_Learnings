import java.util.Arrays;
class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length-1;
        int[] arr = new int[n+1];
        int s =0;
        for(int i=n; i>=0; i--){
            if(Math.abs(nums[s]) > Math.abs(nums[n])){
                arr[i] = nums[s]*nums[s];
                s++;
            }
            else{
                arr[i] = nums[n]*nums[n];
                n--;
            }
        }
        return arr;
    }
}