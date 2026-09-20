class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        int c =0;
        int a = matrix.length;
        int d =0;
        int b = matrix[0].length;
        
        if(a ==0 || b ==0){
            return new ArrayList<>();
        }
        ArrayList<Integer> list  = new ArrayList<>();
        while(a>c && b>d){
            for(int j=d; j<b; j++){
                    list.add(matrix[c][j]);
                }
                c++;
            for(int i=c; i<a; i++){
                list.add(matrix[i][b-1]);
            }
            b--;

            if(a>c){
                for(int j=b-1; j>=d; j--){
                    list.add(matrix[a-1][j]);
                }
                a--;
            }
            if(d<b){
                for(int i= a-1; i>=c; i--){
                    list.add(matrix[i][d]);
                }
            }
            d++;
        }
        return list;
    }
}