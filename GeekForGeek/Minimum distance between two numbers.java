class Solution {
    int minDist(int arr[], int n, int x, int y) {
        // code here
        // Greedy aproach to always get the latest index of both (x,y)
        if (x == y)
            return 0;

        int min = Integer.MAX_VALUE;
        int indX = -1;
        int indY = -1;

        for (int i = 0; i < n; i++) {

            if (arr[i] == y) {
                if (indX != -1)
                    min = Math.min(min, Math.abs(i - indX));
                indY = i;
            } else if (arr[i] == x) {
                if (indY != -1)
                    min = Math.min(min, Math.abs(i - indY));
                indX = i;
            }
        }
        if (indX != -1 && indY != -1) {
            return min;
        }
        return -1;
    }
}