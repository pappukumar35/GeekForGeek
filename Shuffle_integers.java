public class Shuffle_integers {
    void shuffleArray(long arr[], int n) {
        // Your code goes here

        solve(arr, n / 2 - 1, n - 1, n);

    }

    void solve(long arr[], int i, int j, int count) {
        if (count <= 0) {
            return;
        }

        long a = arr[i];
        long b = arr[j];

        solve(arr, i - 1, j - 1, count - 2);

        arr[count - 2] = a;
        arr[count - 1] = b;
    }
}
