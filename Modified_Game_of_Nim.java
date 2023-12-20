class Solution {
    static int findWinner(int n, int arr[]) {
        int xor = 0;
        for (int a : arr)
            xor ^= a;
        return (n % 2 != 0 && xor != 0) ? 2 : 1;
    }
}