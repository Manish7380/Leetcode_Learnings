class Solution {
    public String reverseStr(String s, int k) {
        char[] ch = s.toCharArray();
        for(int i =0; i<s.length()-1; i = i+(2*k)){
            int start = i;
            int end = Math.min(i+k, s.length())-1;
                swap(ch, start, end);
            }
        
        return new String(ch);
    }
    
    private void swap(char[] ch, int first, int second){
        while(first < second){
        char temp = ch[first];
        ch[first++] = ch[second];
        ch[second--] = temp;
        }
    }
}