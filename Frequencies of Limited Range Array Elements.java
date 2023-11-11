
class Solution {

    public static void frequencyCount(int arr[], int n, int P) {
        // code here
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        for (int i = 0; i < n; i++) {
            if (map.containsKey(i + 1)) {
                arr[i] = map.get(i + 1);
            } else {
                arr[i] = 0;
            }
        }
    }
}