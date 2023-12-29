class Solution {
    static int minCandy(int N, int ratings[]) {
        int[] nums = new int[ratings.length];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = 1;
        }
        for (int i = 1; i < nums.length; i++) {
            if (ratings[i] > ratings[i - 1]) {
                nums[i] = nums[i - 1] + 1;
            }
        }
        for (int i = nums.length - 1; i >= 1; i--) {
            if (ratings[i - 1] > ratings[i] && nums[i - 1] <= nums[i]) {
                nums[i - 1] = nums[i] + 1;
            }
        }
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
        }
        return sum;
    }
}