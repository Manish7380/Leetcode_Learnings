class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n + 1];
        for(int i =0; i<=n; i++){
            int a=0;
            int num =i;
            for(int j =0; j<32; j++){
                 a+= (num & 1);
                 num = num >>> 1;
            }
            ans[i] = a;
        }
        return ans;
    }
}