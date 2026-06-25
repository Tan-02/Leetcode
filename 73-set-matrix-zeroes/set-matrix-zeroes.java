class Solution {
    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int[] r = new int[row];
        int[] c = new int[col];
        for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                    if(matrix[i][j]==0){
                        r[i]=1;
                        c[j]=1;
                    }
                }
        }
        for( int i=0;i<row;i++){
            for( int j=0;j<col;j++){
                if(r[i]==1 ||c[j]==1){
                    matrix[i][j]=0;
                }
            }
        }
    }

}