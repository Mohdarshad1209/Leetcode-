class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        long[] squared = new long[n];
        for (int i = 0; i < n; i++) {
            squared[i] = (long) nums[i] * nums[i];
        }
        Arrays.sort(squared);
        long totalSum = 0;
        for (int i = 0; i < n; i++) {
            if (i < n / 2) {
                totalSum -= squared[i];
            } else {
                totalSum += squared[i];
            }
        }
        return totalSum;
    }
}