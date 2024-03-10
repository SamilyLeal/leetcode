import java.util.Arrays;

public class MaximumProductDifferenceBetweenTwoPairs {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length - 1;
        return nums[n] * nums[n - 1] - nums[1] * nums[0];
    }
}
