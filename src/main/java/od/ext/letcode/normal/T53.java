package od.ext.letcode.normal;

import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.TreeMap;

public class T53 {
    public static void main(String[] args) {
        maxSubArray(new int[]{-1, -2, 2});
    }

    public static int maxSubArray(int[] nums) {
        PriorityQueue<Integer> pre = new PriorityQueue<>();
        int sum = 0;
        Integer peek;
        int res = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            peek = pre.peek();
            if (peek != null) {
                res = Math.max(res, sum - peek);
            }
            res = Math.max(res, sum);
            pre.add(sum);
        }
        return res;
    }
}
