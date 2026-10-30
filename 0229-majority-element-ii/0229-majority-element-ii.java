import java.util.*;
class Solution {
    public List<Integer> majorityElement(int[] nums) {
    ArrayList<Integer> ans = new ArrayList<>();
    int n = nums.length;
    int threshold = n/3;
    for (int i = 0; i < n; i++) {
        int current = nums[i];
        int frequency = 0;
        for(int j=0; j<n; j++){
            if(nums[j] == current){ //find the frequency of first ele
                frequency++;
            }
        }
        if(frequency >threshold && !ans.contains(current)){  //if i is not in the ans the we add the element in the ans
            ans.add(current);

        }
        if(ans.size() ==2){    //there will only 2 ele posible
            break;
        }
    }
    return ans;
    }
}