class NumMatrix {
    int[][] rowprefix;
    public NumMatrix(int[][] matrix) {
        rowprefix=new int[matrix.length][matrix[0].length+1];
        for(int r=0;r<matrix.length;r++){
            for(int c=0;c<matrix[0].length;c++){
                rowprefix[r][c+1]=rowprefix[r][c]+matrix[r][c];
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int totalsum=0;
        for(int r=row1;r<=row2;r++){
            totalsum+=rowprefix[r][col2+1]-rowprefix[r][col1];
        }
        return totalsum;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */