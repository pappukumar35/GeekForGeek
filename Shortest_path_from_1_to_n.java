public class Shortest_path_from_1_to_n {

    public int minStep(int n) {
        // code here
        int ans = 0;
        while (n > 1) {
            if (n % 3 == 0) {
                n = n / 3;
            }

            else
                n--;
            ans++;
        }
        return ans;
    }
}
