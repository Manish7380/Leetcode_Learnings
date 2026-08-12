class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int n=  name.length();
        int m = typed.length();
        if(n > m ){
            return false;
        }
        if(name.charAt(0) != typed.charAt(0)) return false;
        int j =0;
        int i =0;
       while(i < m && j< n ){
            if(name.charAt(j) == typed.charAt(i)){
                j++;
                i++;
            }else if(name.charAt(j-1) == typed.charAt(i)){
                i++;
            }else{
                return false;
            }
        }
        while(i < m){
            if(name.charAt(j-1) == typed.charAt(i)){
                i++;
            }else{
                return false;
            }
        }
        if(j<n){
            return false;
        }
        return true;
    }
}