class Solution {
    public int diagonalSum(int[][] mat) {
        int sum =0;
        // for(int row=0; row<mat.length; row++)
        //     for(int col=0; col<mat[0].length;col++)
        //         if(row==col || row+col == mat.length-1)
        //             sum+=mat[row][col];
        for(int row=0;row<mat.length;row++){
            //pd
            sum += mat[row][row];
            //sd
            if(row != mat.length-row-1)
                sum+=mat[row][mat.length-row-1];
        }
        return sum;
    }
}