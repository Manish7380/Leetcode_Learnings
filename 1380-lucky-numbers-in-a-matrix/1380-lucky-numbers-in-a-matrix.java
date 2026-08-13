class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();

        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            int min = matrix[i][0];
            int col = 0;

            for (int j = 1; j < cols; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                    col = j;
                }
            }

            int max = matrix[0][col];

            for (int k = 1; k < rows; k++) {
                if (matrix[k][col] > max) {
                    max = matrix[k][col];
                }
            }

            if (min == max) {
                ans.add(min);
            }
        }

        return ans;
    }
}