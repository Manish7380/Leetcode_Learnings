class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();
        while(columnNumber > 0){
            columnNumber--;
            int remender = columnNumber%26;
            char ch = (char) ('A' + remender);
            result.append(ch);
            columnNumber = columnNumber/26;
        }
        return result.reverse().toString();
    }
}