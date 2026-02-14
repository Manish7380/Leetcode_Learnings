class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] matrix = new int[m][n];

        for(int i = 0; i < indices.length; i++){
            int r = indices[i][0];
            int c = indices[i][1];

            // increment entire row r
            for(int col = 0; col < n; col++){
                matrix[r][col]++;
            }

            // increment entire column c
            for(int row = 0; row < m; row++){
                matrix[row][c]++;
            }
        }

        int count = 0;

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(matrix[i][j] % 2 != 0){
                    count++;
                }
            }
        }

        return count;
    }
}