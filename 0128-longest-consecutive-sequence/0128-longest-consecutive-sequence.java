class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        //remove dublicate by storing uniq value only in the hashset
        for(int num: nums){
            set.add(num);
        }
        int longLength = 0;
        for(int num : set){
            if(set.contains(num-1)){
                continue;
            }

            int currLength =1;
            int nextVal = num+1;
            while(set.contains(nextVal)){
                currLength++;
                nextVal++;
            }
            longLength = Math.max(longLength, currLength);
        }
        return longLength;
    }
}