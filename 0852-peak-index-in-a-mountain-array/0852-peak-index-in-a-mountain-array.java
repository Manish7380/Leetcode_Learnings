class Solution {
    public int peakIndexInMountainArray(int[] arr) { 
    int start =0; 
    int end =arr.length-1;
    while(start < end){
        int mid = start + (end-start)/2;
        if(arr[mid] > arr[mid+1]){
            end = mid;   //because mid may be our answer 
        }
        else{
            start = mid+1;
        }
    }
    //at point every point of time end == start 
    return start;
    }
}
