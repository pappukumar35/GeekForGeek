class Solution {
    static long countStr(long n) {
        // code here
        long case1 = 1;
        long case2 = n;
        long case3 = n;
        long case4 = n * (n - 1);
        long case5 = (n * (n - 1)) / 2;
        long case6 = (n * (n - 1) * (n - 2)) / 2;

        return case1 + case2 + case3 + case4 + case5 + case6;
    }
}