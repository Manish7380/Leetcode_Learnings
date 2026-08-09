class Solution {
    public String defangIPaddr(String address) {
        StringBuilder build = new StringBuilder();
        char ch[] = address.toCharArray();
        for(int i =0; i<ch.length; i++){
            if(ch[i] == '.'){
               build.append("[.]");
        }else{
            build.append(ch[i]);
        }
        }
        return build.toString();
    }
}
