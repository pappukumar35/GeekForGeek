class Solution {
    static long countLR(int arr[], int n, int x) {
        long count = 0;
        long sum = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > x) {
                sum += (count * (count + 1)) / 2;
                count = 0;
            } else {
                count++;

            }
        }
        sum += (count * (count + 1)) / 2;
        return sum;
    }

    static long countSubarrays(int a[], int n, int L, int R) {
        // Complete the function
        return countLR(a, n, R) - countLR(a, n, L - 1);
    }
}