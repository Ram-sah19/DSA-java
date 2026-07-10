class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];

        int startRow = 0;
        int startCol = 0;
        int endRow = n - 1;
        int endCol = n - 1;
        int num = 1;

        while (startRow <= endRow && startCol <= endCol) {

            // top
            for (int col = startCol; col <= endCol; col++) {
                matrix[startRow][col] = num++;
            }

            // right
            for (int row = startRow + 1; row <= endRow; row++) {
                matrix[row][endCol] = num++;
            }

            // bottom
            for (int col = endCol - 1; col >= startCol; col--) {
                if (startRow == endRow) break;
                matrix[endRow][col] = num++;
            }

            // left
            for (int row = endRow - 1; row >= startRow + 1; row--) {
                if (startCol == endCol) break;
                matrix[row][startCol] = num++;
            }

            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }

        return matrix;
    }
}