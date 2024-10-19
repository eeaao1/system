package od.ext.letcode.normal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class T560 {
    public static void main(String[] args) {
        subarraySum(new int[]{-1, -2, 2}, 0);
    }

    public static int subarraySum1(int[] nums, int k) {
        int l = 0;
        int r = 0;
        int rr = r;
        int sum = 0;
        int res = 0;
        while (l <= r && r < nums.length) {
            if (rr != r || r == 0) {
                sum += nums[r];
                rr = r;
            }
            if (sum < k) {
                r++;
            } else if (sum > k) {
                sum -= nums[l];
                l++;
            } else {
                res++;
                sum -= nums[l];
                l++;
                r++;
            }
        }
        return res;
    }

    public static int subarraySum(int[] nums, int k) {
        int count = 0, pre = 0;
        HashMap<Integer, Integer> mp = new HashMap<>();
        mp.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            pre += nums[i];
            if (mp.containsKey(pre - k)) {
                count += mp.get(pre - k);
            }
            mp.put(pre, mp.getOrDefault(pre, 0) + 1);
        }
        return count;
    }

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            Integer integer1 = map.get(target - nums[i]);
            if (integer1 != null) {
                res[0] = integer1;
                res[1] = i;
                return res;
            }
            map.put(nums[i], i);
        }
        return res;
    }
}
