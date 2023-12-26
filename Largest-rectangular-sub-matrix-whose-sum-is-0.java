class Solution {
    public static ArrayList<ArrayList<Integer>> sumZeroMatrix(int[][] a) {
        // code here
        int n = a.length, m = a[0].length;
        int c1 = 0, c2 = 0, r1 = 0, r2 = 0, maxArea = -1001;

        for (int i = 0; i < m; i++) {
            int arr[] = new int[n];
            for (int j = i; j < m; j++) {
                for (int k = 0; k < n; k++) {
                    arr[k] += a[k][j];
                }
                int s[] = { 0 };
                int e[] = { 0 };
                int len = maxLen(arr, s, e);

                int area = (e[0] - s[0] + 1) * (j - i + 1);

                if (len > 0 && area > maxArea) {
                    r1 = s[0];
                    r2 = e[0];
                    c1 = i;
                    c2 = j;
                    maxArea = area;
                }
            }
        }

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int i = r1; i <= r2; i++) {
            ArrayList<Integer> ilist = new ArrayList<>();
            for (int j = c1; j <= c2; j++) {
                ilist.add(a[i][j]);
            }
            list.add(ilist);
        }
        return list;
    }

    static int maxLen(int arr[], int s[], int e[]) {
        int sum = 0, mlen = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (arr[i] == 0 && mlen == 0) {
                s[0] = i;
                e[0] = i;
                mlen = 1;
            }
            if (sum == 0) {
                if (mlen < i + 1) {
                    s[0] = 0;
                    e[0] = i;
                }
                mlen = i + 1;
            }
            if (hm.containsKey(sum)) {

                int plen = mlen;
                mlen = Math.max(mlen, i - hm.get(sum));

                if (mlen > plen) {
                    e[0] = i;
                    s[0] = hm.get(sum) + 1;
                }
            } else
                hm.put(sum, i);
        }
        return mlen;

    }
}