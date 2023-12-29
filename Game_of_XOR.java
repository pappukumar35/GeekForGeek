public class Game_of_XOR {
    static int gameOfXor(int N, int[] A) {
        // code here
        int ans = 0;
        for (int i = 0; i < N; i++) {
            int count = (i + 1) * (N - i);
            if (count % 2 != 0) {
                ans = ans ^ (A[i]);
            }
        }
        return ans;
    }
}
