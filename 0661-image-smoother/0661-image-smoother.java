class Solution {
    public int[][] imageSmoother(int[][] img) {
        int n = img.length;
        int m = img[0].length;
        int[][] arr = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                int sum =0;
                int count =0;
                for(int r =i-1; r<=i+1; r++){
                    for(int c =j-1; c <=j+1; c++){
                        if(r>=0 && r<n && c>=0 && c<m){
                            sum+= img[r][c];
                            count++;
                        }
                    }
                }
                arr[i][j] = sum/count;
            }
        }
        return arr;
    }
}