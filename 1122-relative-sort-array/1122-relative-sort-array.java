class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int n =arr1.length;
        int[] num = new int[1001];
        for(int i=0; i<n; i++){
            num[arr1[i]]++;
        }
        int j=0;
        int k=0;
        for(int i=0; i<arr2.length; i++){
            while(num[arr2[i]]>0){
                arr1[j++] =arr2[k];
                num[arr2[i]]--;
                
            }
            k++;
        }
        for(int i=0; i<1001; i++){
            while(num[i]>0){
                arr1[j++] =i;
                num[i]--;
            }
        }
        
        return arr1;
    }
}