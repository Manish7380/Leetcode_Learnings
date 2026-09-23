import java.util.Arrays;
class Solution {
    public int heightChecker(int[] heights) {
        int n= heights.length;
        int[] arr = new int[n];
        for(int j=0; j<n; j++){
            arr[j] = heights[j];
        }
        Arrays.sort(arr);
        int cnt =0;
        for(int i=0; i<n; i++){
            if(arr[i]!=heights[i]){
                cnt++;
            }
        }
        return cnt;
    }
}