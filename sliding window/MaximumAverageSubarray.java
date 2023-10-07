class MaximumAverageSubarray {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7 };

        System.out.println(findMaxAverage(nums, 3));
    }

    public static double findMaxAverage(int[] nums, int k) {
        int maximumSum = 0;
        int maxWindowSum = 0;
        for (int i = 0; i < k; i++)
            maxWindowSum += nums[i];
        maximumSum = maxWindowSum;
        for (int i = 0; i < nums.length - k; i++) {
            maxWindowSum += nums[i + k] - nums[i];
            if (maxWindowSum > maximumSum) {
                maximumSum = maxWindowSum;
            }
        }
        return maximumSum / (double) k;
    }
}