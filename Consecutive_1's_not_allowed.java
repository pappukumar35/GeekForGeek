class Solution {
    long countStrings(int n) {
        // code here
        int MOD = 1000000007;
        long zero = 1;
        long one = 1;

        for (int i = 2; i <= n; i++) {
            long nZero = (zero + one) % MOD;
            long nOne = zero;

            zero = nZero;
            one = nOne;
        }
        return (int) (zero + one) % MOD;
    }
}