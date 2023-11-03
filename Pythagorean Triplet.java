class Solution {
    boolean checkTriplet(int[] arr, int n) {
        // code here

        Set<Long> sqr = new HashSet<>();
        long[] sqrArr = new long[n];

        // store all squares in a set and Array
        for (int i = 0; i < n; i++) {
            long val = (long) Math.pow(arr[i], 2);
            sqr.add(val);
            sqrArr[i] = val;
        }

        // iterate array and check if the sum exists in set
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                long num1 = sqrArr[i];
                long num2 = sqrArr[j];
                if (sqr.contains(num1 + num2)) {
                    return true;
                }
            }
        }

        return false; // didn't got match
    }
}