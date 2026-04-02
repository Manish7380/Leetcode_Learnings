class Solution {
    public int findKthPositive(int[] arr, int k) {
        int count =0;
        int current =1;
        ArrayList<Integer> num =  new ArrayList<>();
        for(int i =0; i<arr.length; i++){
            //missing number before arr[0]
            while(current < arr[i]){
                num.add(current);
                count++;
                if(count == k){
                    return current;
                }
                current++;
            }   
            current = arr[i] +1;
        }
        //kth missing after the last element
        while(count<k){
            num.add(current);
            count++;
            if(count==k){
                return current;
            }
            current++;
        }
        return -1;
    }
}