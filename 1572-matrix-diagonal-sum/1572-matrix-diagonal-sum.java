class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int val=0;
        int sum =0;
        for(int i=0; i<n;i++){
                sum+=mat[i][i];
            
            }
        
        int sum1 =0;
        for(int i=0; i<n;i++){
                sum1+=mat[i][n-1-i];
    }

int sum2 =mat[n/2][n/2];
if(n %2!=0){
    val = sum+sum1-sum2;
}
else{
    val =sum+sum1;

}
return val;
    }
}