    class Solution {
    public int[] replaceElements(int[] arr) {
    int n =arr.length-1;
    int max = -1;
        for(int i =n; i>=0; i--){
            int temp = arr[i];
            arr[i] =max;
            if(temp>max){
                max = temp;
            }
        }
        return arr;
    }
}