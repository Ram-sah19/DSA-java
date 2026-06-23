class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
                List<Integer> result = new ArrayList<>();

        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {

            // top
            for (int col = startCol; col <= endCol; col++) {
                result.add(matrix[startRow][col]);
            }

            // right
            for (int row = startRow + 1; row <= endRow; row++) {
                result.add(matrix[row][endCol]);
            }

            // bottom
            for (int col = endCol - 1; col >= startCol; col--) {
                if (startRow == endRow) break;
                result.add(matrix[endRow][col]);
            }

            // left
            for (int row = endRow - 1; row >= startRow + 1; row--) {
                if (startCol == endCol) break;
                result.add(matrix[row][startCol]);
            }

            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }

        return result;
    }
}