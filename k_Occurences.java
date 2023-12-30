class Solution {
    // Function to find all elements in array that appear more than n/k times.
    public int countOccurence(int[] arr, int n, int k) {
        k = n / k; // Updated value of k
        int ans = 0;
        Arrays.sort(arr);

        for (int i = 1; i < n; i++) {
            int count = 0;
            while (i < n && arr[i] == arr[i - 1]) {
                count++;
                i++;
            }
            if (count >= k)
                ans++;
        }
        return ans;
    }
}