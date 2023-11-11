class Solution {

    static List<Integer> matrixSum(int n, int m, int mat[][], int q, int queries[][])

    {

        // code here

        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < q; i++) {

            int col = queries[i][2];

            int row = queries[i][1];

            int val = queries[i][0];

            int sum = 0;

            int cs = col - val, rs = row - val + 1, re = row + val, ce = col + val;

            for (int j = cs; j <= ce && j < m; j++) {

                if (row - val >= 0 && j < m && j >= 0) {

                    sum += mat[row - val][j];

                }

                if (row + val < n && j < m && j >= 0) {

                    sum += mat[row + val][j];

                }

            }

            for (int j = rs; j < re && j < n; j++) {

                if (col - val >= 0 && j < n && j >= 0) {

                    sum += mat[j][col - val];

                }

                if (col + val < m && j < n && j >= 0) {

                    sum += mat[j][col + val];

                }

            }

            ans.add(sum);

        }

        return ans;

    }

}