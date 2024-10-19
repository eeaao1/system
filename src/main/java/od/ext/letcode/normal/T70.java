package od.ext.letcode.normal;

import java.util.PriorityQueue;

public class T70 {

    public static void main(String[] args) {
        System.out.println(climbStairs(3));
    }

    public static int climbStairs(int n) {
        int[] dp = new int[n + 1];
        return p(n, dp);
    }

    public static int p(int n, int[] dp) {
        if (n == 0) {
            return 1;
        }
        if (n <= 0) {
            return 0;
        }
        if (dp[n] != 0) {
            return dp[n];
        }
//        int res;
        int p1 = p(n - 1, dp);
        int p2 = p(n - 2, dp);
        dp[n] = p1 + p2;
        return dp[n];
    }
}
