package od.ext.letcode.normal;

import java.io.StreamTokenizer;

public class T300 {
    public static void main(String[] args) {
        System.out.println(lengthOfLIS(new int[]{10, 9, 2, 5, 3, 7, 101, 18}));
        System.out.println(lengthOfLIS2(new int[]{3, 5, 6, 2, 5, 4, 19, 5, 6, 7, 12}));
    }

    public static int lengthOfLIS2(int[] nums) {

        int[] dp = new int[nums.length];
        int l = 0;
        int max = 1;
        int r = 0;
        int m = 0;
        dp[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            r = max - 1;
            l = 0;
            while (l <= r) {
                m = l + (r - l) / 2;
                if (dp[m] < nums[i]) {
                    if (dp[m + 1] == 0 || dp[m + 1] > nums[i]) {
                        dp[m + 1] = nums[i];
                        max = Math.max(max, m + 2);
                        break;
                    } else {
                        l = m + 1;
                    }
                } else if (dp[m] > nums[i]) {
                    if (m == l) {
                        dp[m] = nums[i];
                        max = Math.max(max, m + 1);
                        break;
                    } else {
                        r = m - 1;
                    }
                } else {
                    break;
                }
            }
        }
        return max;
    }

    public static int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = 1;
        int max = 1;
        int cmax = 1;
        for (int i = 1; i < nums.length; i++) {
            for (int d = 0; d < i; d++) {
                if (nums[d] < nums[i]) {
                    cmax = Math.max(cmax, dp[d] + 1);
                }
            }
            max = Math.max(max, cmax);
            dp[i] = cmax;
            cmax = 1;
        }
        return max;
    }

    static class Rec {
        int w;
        int h;
        int c;

        public Rec(int w, int h, int c) {
            this.w = w;
            this.h = h;
            this.c = c;
        }

        public Rec() {
        }
    }

    public static int lengthOfLIS3(int[][] nums) {
        Rec[] recs = new Rec[nums.length];
        recs[0] = new Rec(nums[0][0], nums[0][1], 1);
        int max = 1;
        int cmax = 1;
        for (int i = 1; i < nums.length; i++) {
            cmax = 1;
            for (int j = 0; j < recs.length; j++) {
                if (recs[j].w < nums[i][0] && recs[j].h < nums[i][1]) {
                    cmax = Math.max(cmax, recs[j].c + 1);
                }
            }
            recs[i] = new Rec(nums[i][0], nums[i][1], cmax);
            max = Math.max(max, cmax);
        }
        return max;
    }

}
