
class Solution {
    int M = 1000000007;

    public int nthPoint(int n) {
        return tabulation(n);
    }

    // Recursive approach with memoization
    public int recursion(int n, Integer[] dp) {
        // Base case: if n is non-positive, return 1 if n is 0, otherwise return 0
        if (n <= 0)
            return n == 0 ? 1 : 0;

        // If the result for the current value of n is already computed, return it
        if (dp[n] != null)
            return dp[n];

        // Recursively calculate the nth point using the results of n-1 and n-2
        int one = recursion(n - 1, dp) % M;
        int two = recursion(n - 2, dp) % M;

        // Save the result in the memoization table and return the result
        return dp[n] = (one + two) % M;
    }

    // Tabulation approach
    public int tabulation(int n) {
        // Initialize two variables to store the values of n-1 and n-2
        int one = 1, two = 1;

        // Iterate from 2 to n, calculating each point iteratively
        for (int i = 2; i <= n; i++) {
            // Calculate the sum of the last two points and take modulo M
            int sum = (one + two) % M;

            // Update values for the next iteration
            two = one;
            one = sum;
        }

        // Return the result for the nth point
        return one;
    }
}