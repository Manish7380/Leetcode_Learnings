class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n/2];
        int[] arr1 =new int[n/2];
int j=0;
int k=0;
    for(int i=0;i<n; i++){
        if(nums[i]<0){
            arr[j] = nums[i];
            j++;
            
        }
        else if(nums[i]>0){
            arr1[k] = nums[i];
            k++;
        }
    }
     j=0;
     k=0;
    for(int i=0;i<n-1; i= i+2){
       nums[i] =arr1[k];
       nums[i+1] =arr[j];
       j++;
       k++;
        }
        return nums;
    }

}