class Solution {
    static long maximumSumSubarray(int K, ArrayList<Integer> Arr, int N) {
        if (N < K) {
            return -1;
        }
        long res = 0;
        for (int i = 0; i < K; i++) {
            res += Arr.get(i);
        }
        long currsum = res;
        for (int i = K; i < N; i++) {
            currsum += Arr.get(i) - Arr.get(i - K);
            res = Math.max(res, currsum);
        }
        return res;
    }
}