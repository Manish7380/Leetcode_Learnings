class Solution {
    public String reversePrefix(String word, char ch) {
        char[] ch2 = word.toCharArray();
        int j =0;
        for(int i =0; i<ch2.length; i++){
            if(ch2[i] == ch){
                int k =i;
                while(j <= k){
                    char temp = ch2[j];
                    ch2[j++] = ch2[k];
                    ch2[k--] = temp;
                }
                return new String(ch2);
            }
        }
            return word;
            
        }
    }