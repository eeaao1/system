package od.ext.letcode.normal;

import java.util.ArrayList;
import java.util.List;

public class T198 {

    public static void main(String[] args) {
        p2(new int[]{1, 2, 3,1});
    }

    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        return p(nums, 0, dp);
    }

    public int p1(int[] nums, int index) {
        if (index >= nums.length) {
            return 0;
        }
        int res = nums[index];
        int p1 = p1(nums, index + 2);
        int p2 = p1(nums, index + 1);
        res = Math.max(p1 + res, p2);
        return res;
    }

    public int p(int[] nums, int index, int[] dp) {
        if (index >= nums.length) {
            return 0;
        }
        if (dp[index] != 0) {
            return dp[index];
        }
        int res = nums[index];
        int p1 = p(nums, index + 2, dp);
        int p2 = p(nums, index + 1, dp);
        res = Math.max(p1 + res, p2);
        dp[index] = res;
        return res;
    }

    public static int p2(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 1], nums[i - 2] + nums[i]);
        }
        return dp[nums.length - 1];
    }
}
