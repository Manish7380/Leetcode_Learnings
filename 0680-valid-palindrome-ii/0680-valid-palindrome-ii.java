class Solution {
    public boolean validPalindrome(String s) {
        int i =0;
        int j = s.length()-1;
        while(i<j){
            if(s.charAt(i) != s.charAt(j)){
                return isPalin(s, i+1, j) || isPalin(s,i, j-1);
            }
            i++;
            j--;
        }
        return true;
    }
            private boolean isPalin(String s, int s1, int e){
                while(s1<e){
                    if(s.charAt(s1) != s.charAt(e)){
                        return false;
                    }
                    s1++;
                    e--;
                }
            
            return true;
    }
}