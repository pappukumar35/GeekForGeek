
class Solution {
    public int minNumber(int arr[], int N) {
        // O(n) time O(1) space
        int sum = 0;
        for (int i : arr)
            sum += i;

        // O(nlogn) time O(1) space
        int temp = sum;
        while (!isPrime(temp))
            temp++;

        return temp - sum;
    }

    // O(logn) time no space
    public boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0)
                return false;
        return true;
    }
}