import java.util.ArrayList;
import java.util.List;
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        findSubset(nums, 0, new ArrayList<>(), ans);
        return ans;
    }
    public void findSubset(int[] nums, int index, List<Integer> sublist, List<List<Integer>> ans){
        //base case
        if(index == nums.length){
            ans.add(new ArrayList<Integer>(sublist));
            return;
        }
        //pick
        sublist.add(nums[index]);
        findSubset(nums, index+1,sublist, ans);
        //while backtracking we need to remove the last element
        sublist.remove(sublist.size()-1);
        //not pick
        findSubset(nums, index+1, sublist,ans);
        //no need to remove here because not adding anythingh

    }
}