package od.ext.letcode.normal;

import java.util.*;

public class T15 {
    public static void main(String[] args) {
        System.out.println(threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
    }

    public static List<List<Integer>> threeSum1(int[] nums) {
        ArrayList<List<Integer>> res = new ArrayList<>();
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int p = j + 1; p < nums.length; p++) {
                    if (nums[i] + nums[j] + nums[p] == 0) {
                        int max = Math.max(nums[i], Math.max(nums[j], nums[p]));
                        int min = Math.min(nums[i], Math.min(nums[j], nums[p]));
                        if (set.contains(min + "" + max)) {
                            continue;
                        }
                        set.add(min + "" + max);
                        ArrayList<Integer> r = new ArrayList<>();
                        r.add(nums[i]);
                        r.add(nums[j]);
                        r.add(nums[p]);
                        res.add(r);
                    }
                }
            }
        }
        return res;
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        ArrayList<List<Integer>> res = new ArrayList<>();
        HashSet<String> set = new HashSet<>();
        Arrays.sort(nums);
        int t = 0;
        int l = 0;
        int r = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            t = nums[i];
            r = nums.length - 1;
            l = 0;
            while (l < r) {
                if (l == i) {
                    l++;
                }
                if (r == i) {
                    r--;
                }
                if (l >= r) {
                    break;
                }
                if (nums[l] + nums[r] + t > 0) {
                    r--;
                } else if (nums[l] + nums[r] + t == 0) {
                    int max = Math.max(t, Math.max(nums[l], nums[r]));
                    int min = Math.min(t, Math.min(nums[l], nums[r]));
                    if (!set.contains(min + "" + max)) {
                        set.add(min + "" + max);
                        ArrayList<Integer> re = new ArrayList<>();
                        re.add(t);
                        re.add(nums[l]);
                        re.add(nums[r]);
                        res.add(re);
                    }
                    r--;
                    l++;
                } else {
                    l++;
                }
            }
        }
        return res;
    }
}
