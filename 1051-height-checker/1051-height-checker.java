import java.util.Arrays;
class Solution {
    public int heightChecker(int[] heights) {
        int n =heights.length;
        int[] nums = new int[101];
        for(int i=0; i<n; i++){
            nums[heights[i]]++;
        }
        int cnt =0;
        int ans =0;
        for(int i=1; i<=100; i++){
            while(nums[i]>0){
                if(heights[cnt] != i){
                    ans++;
                }
                cnt++;
                nums[i]--;
            }
        }
        return ans;
    }
}