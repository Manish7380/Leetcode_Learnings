import java.util.*;

class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> list = new ArrayList<>();

        for(int i = 0; i < numRows; i++) {

            ArrayList<Integer> ans = new ArrayList<>();

            for(int j = 0; j <= i; j++) {
                ans.add(1);
            }

            for(int j=1; j<i; j++){
                int value = list.get(i-1).get(j-1) + list.get(i-1).get(j);
                ans.set(j , value);
            }
            list.add(ans);
        }

        return list;
    }
}