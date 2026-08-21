class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[] arr = new int[n+m];
        
        int i = 0;
        int j = 0;
        int idx = 0;
        
        while (i < n && j < m) {
            if (nums1[i] <= nums2[j]) {
                arr[idx] = nums1[i];
                i++;
            } else {
                arr[idx] = nums2[j];
                j++;
            }
            idx++;
        }
        
        while (i < n) {
            arr[idx] = nums1[i];
            i++;
            idx++;
        }
        
        while (j < m) {
            arr[idx] = nums2[j];
            j++;
            idx++;
        }
        
        int q = arr.length;
        double ans;
        if(q%2 != 0){
            ans = arr[q/2];
        }else{
            ans = (arr[(q/2)-1] + arr[q/2]) / 2.0;   
        }
        return ans;
    }
}
