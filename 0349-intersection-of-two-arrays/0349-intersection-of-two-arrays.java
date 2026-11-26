class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hm=  new HashSet<>();
        for(int i=0; i<nums1.length; i++){
            hm.add(nums1[i]);

        }
         HashSet<Integer> hm2 =  new HashSet<>();
        for(int i=0; i<nums2.length; i++){
            if(hm.contains(nums2[i])){
                hm2.add(nums2[i]);
            }
        }
        int[] arr = new int[hm2.size()];
        int index = 0;
        for(int val : hm2){
            arr[index] = val;
            index++;
        }
        return arr;
    }
}