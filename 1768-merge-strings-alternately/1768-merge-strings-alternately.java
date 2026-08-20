class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();

        StringBuilder word = new StringBuilder();

        boolean temp = true;
        int i = 0;
        int j = 0;

        while (i < n && j < m) {
            if (temp) {
                word.append(word1.charAt(i));
                i++;
            } else {
                word.append(word2.charAt(j));
                j++;
            }

            temp = !temp;
        }

        while (i < n) {
            word.append(word1.charAt(i));
            i++;
        }

        while (j < m) {
            word.append(word2.charAt(j));
            j++;
        }

        return word.toString();
    }
}
