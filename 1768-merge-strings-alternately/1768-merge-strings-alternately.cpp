class Solution {
public:
    string mergeAlternately(string word1, string word2) {
        int n = word1.size();
        int m = word2.size();
        string word;
        bool temp = true;
        int i = 0;
        int j = 0;
        while(i<n && j<m){
            if(temp){
                word.push_back(word1[i]);
                i++;
            }else{
                word.push_back(word2[j]);
                j++;
            }
            temp = !temp;
        }

        while(i<n){
            word.push_back(word1[i]);
            i++;
        }
        while(j<m){
            word.push_back(word2[j]);
            j++;
        }

        return word;
    }
};