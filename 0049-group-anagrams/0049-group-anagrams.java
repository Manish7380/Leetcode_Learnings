import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String, List<String>> map = new HashMap<>();
        
        for(String word : strs){
            
            int[] freq = new int[26];
            
            for(char c : word.toCharArray()){
                freq[c - 'a']++;
            }
            
            StringBuilder key = new StringBuilder();
            for(int i = 0; i < 26; i++){
                key.append(freq[i]).append('#');
            }
            
            String finalKey = key.toString();
            
            map.putIfAbsent(finalKey, new ArrayList<>());
            map.get(finalKey).add(word);
        }
        
        return new ArrayList<>(map.values());
    }
}