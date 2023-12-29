
class Solution {
    long countWays(int n, int k) {
        // code here.
        long mod = 1000000007;
        if (n == 1) {
            return k;
        }

        long same = 0;
        long diff = k;

        for (int i = 2; i <= n; i++) {
            long prev = same;
            same = diff;
            diff = (prev + same) * (k - 1) % mod;
        }
        return (same + diff) % mod;

    }
}