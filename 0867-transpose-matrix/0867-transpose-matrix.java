class Solution {
    public int[][] transpose(int[][] nums) {
        int row = nums.length;
        int col = nums[0].length;
        int [][]trans = new int [col][row];
        for(int i =0; i<row;i++){
            for(int j =0; j<col;j++){
                trans [j][i] = nums[i][j];
            }
        }

        return trans;
    }
}