class Solution {
    public int[] antiDiagonalPattern(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int row = 0, col = 0;
        int ans[] = new int[n * m];
        int index = 0;
        for (int i = 0; i < m; i++) {
            row = 0;
            col = i;
            while (row < n && row >= 0 && col < m && col >= 0) {
                ans[index++] = matrix[row][col];
                row++;
                col--;
            }
        }

        for (int i = 1; i < n; i++) {
            row = i;
            col = m - 1;
            while (row < n && row >= 0 && col < m && col >= 0) {
                ans[index++] = matrix[row][col];
                row++;
                col--;
            }
        }
        return ans;

    }
}