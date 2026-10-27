class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+"); // Split the string by one or more spaces
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i > 0) { // if i =0 it can not add the space
                sb.append(" "); // add the space between the words
            }
        }
        return sb.toString(); //convert into string
        
    }
}




