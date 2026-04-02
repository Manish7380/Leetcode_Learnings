class Solution {
    public int countNegatives(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int count = 0;
        int r =0;
        int c = cols-1;
        while(r < grid.length && c >= 0){
            if(grid[r][c] < 0){
                count += rows-r;
                c--;
            }
            else{
                r++;
            }
        }
        return count;
       
    }
}