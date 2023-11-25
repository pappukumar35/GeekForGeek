public class Solution8 {
    class Solution {
        static long sumOfDivisors(int N) {
            // code here
            // 1*4 = 4
            // 2*2 = 4
            // 3*1 = 3
            // 4*1 = 4
            long ans = 0;
            for (int i = 1; i <= N; i++) {
                ans += i * (N / i);
            }
            return ans;
        }

        public static void main(String[] args) {
            sumOfDivisors(0);
            char[] ans;
            System.out.println(long ans);
        }
    }

}
