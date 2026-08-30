class Solution {
    public int hammingWeight(int n) {
        String binary = Integer.toBinaryString(n);
        int i =0;
        int count =0;
        while(i<binary.length()){
            if(binary.charAt(i) == '1'){
                count++;
            }
            i++;
        }
        return count;
    }
}