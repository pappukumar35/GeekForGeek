import java.util.ArrayList;
import java.util.List;

public class Print_Pattern {

    public List<Integer> pattern(int N) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        if (N <= 0) {
            arr.add(N);
            return arr;
        }
        return helper(false, N, arr);
    }

    public List<Integer> helper(boolean bool, int N, List<Integer> arr) {
        if (bool) {
            arr.add(N);
            if (N == arr.get(0)) {
                return arr;
            }
            N = N + 5;
            return helper(bool, N, arr);
        } else {
            arr.add(N);
            N = N - 5;
            if (N <= 0) {
                bool = true;
            }
            return helper(bool, N, arr);
        }

    }

}
