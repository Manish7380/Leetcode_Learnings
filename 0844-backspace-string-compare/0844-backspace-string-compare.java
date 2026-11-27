class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st = new Stack<>();
        Stack<Character> st2 = new Stack<>();
        int i =0;
        int j =0;
        while(i < s.length()){
            char ch1 = s.charAt(i);
            char chh = '#';
            if(ch1 == '#' && !st.isEmpty()){
                st.pop();
            }
            else if(ch1 != '#'){
                st.push(ch1);
            }
            i++;
        }
        while(j <t.length()){
            char ch2 = t.charAt(j);
            char chh = '#';
            if(ch2 == '#' && !st2.isEmpty()){
                st2.pop();
            }
            else if(ch2 != '#'){
                st2.push(ch2);
            }
            j++;
        }
        
        return st.equals(st2);
    }
}