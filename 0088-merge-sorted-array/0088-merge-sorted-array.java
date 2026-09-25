import java.util.Arrays;
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] arr = new int[n + m];
        int j = 0;
        int i = 0;
        int k = 0;
        while (i < m && k < n) {
            if (nums1[i] < nums2[k]) {
                arr[j] = nums1[i];
                i++;
            } else {
                arr[j] = nums2[k];
                k++;
            }
            j++;
        }
        while (i < m) {
            arr[j] = nums1[i];
            i++;
            j++;
        }
        while (k < n) {
            arr[j] = nums2[k];
            k++;
            j++;
        }
        for (int a = 0; a < m + n; a++) {
            nums1[a] = arr[a];
        }
    }
}