class Solution {
    public boolean halvesAreAlike(String s) {
        int x =0;
        int y =0;
        int n = s.length()/2;
        for(int i =0; i<n; i++){
            if(s.charAt(i) == 'a' || s.charAt(i) == 'A'){
                x++;
            }
             if(s.charAt(i) == 'i' || s.charAt(i) == 'I'){
                x++;
            }
             if(s.charAt(i) == 'o' || s.charAt(i) == 'O'){
                x++;
            }
             if(s.charAt(i) == 'e' || s.charAt(i) == 'E'){
                x++;
            }
             if(s.charAt(i) == 'u' || s.charAt(i) == 'U'){
                x++;
            }
        }
            for(int j = n; j<s.length(); j++){

            if(s.charAt(j) == 'a' || s.charAt(j) == 'A'){
                y++;
            }
             if(s.charAt(j) == 'i' || s.charAt(j) == 'I'){
                y++;
            }
             if(s.charAt(j) == 'o' || s.charAt(j) == 'O'){
                y++;
            }
             if(s.charAt(j) == 'e' || s.charAt(j) == 'E'){
                y++;
            }
             if(s.charAt(j) == 'u' || s.charAt(j) == 'U'){
                y++;
            }
            }
        
        if(x == y){
            return true;
        }
        return false;
    }
}