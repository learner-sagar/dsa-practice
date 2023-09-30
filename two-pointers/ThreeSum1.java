import java.util.Arrays;

public class ThreeSum1 {
    public static boolean findSumOfThree(int[] nums, int target) {
        // Replace this placeholder return statement with your code
        Arrays.sort(nums);
        for (int current = 0; current < nums.length; current++) {
            int start = current + 1;
            int end = nums.length - 1;

            while (start < end) {
                int sum = nums[current] + nums[start] + nums[end];
                if (target == sum) {
                    return true;
                }
                if (sum > target) {
                    end--;
                }
                if (sum < target) {
                    start++;
                }
            }
        }
        return false;
    }
}
