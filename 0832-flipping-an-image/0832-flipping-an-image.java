class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int row = image.length;
        int col = image[0].length;  // here if image[row] = image[3] in the first example so if gives an error of array index of bound
        int[][] arr = new int[row][col];
        for(int i=0; i<row; i++){
            for(int j=0; j< col; j++){
                arr[i][j] = image[i][col -1-j];
                
                arr[i][j] = 1- arr[i][j];
            }
        }
      return arr;
    }
}
