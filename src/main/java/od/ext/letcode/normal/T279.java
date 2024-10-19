package od.ext.letcode.normal;

public class T279 {
    public static void main(String[] args) {
        System.out.println(numSquares(1));
    }

    public static int numSquares(int n) {
        if (isP(n)) {
            return 1;
        }
        int[][] dp = new int[n + 1][n / 2 + 2];
        return p(n, 1, dp);
    }

    public static int p(int n, int jp, int[][] dp) {
        if (n == 0) {
            return 0;
        }
        if (n < 0 || n < jp * jp) {
            return Integer.MAX_VALUE - 1;
        }
        if (dp[n][jp] != 0) {
            return dp[n][jp];
        }
        int res = 0;
        int p2 = p(n, jp + 1, dp);
        int p1 = p(n - jp * jp, jp, dp);
        res = Math.min(p1 + 1, p2);
        dp[n][jp] = res;
        return res;
    }

    public static boolean isP(int n) {
        if (n < 4) {
            return false;
        }
        int l = 1;
        int r = n / 2;
        int m;
        int p;
        while (l <= r) {
            m = l + (r - l) / 2;
            p = m * m;
            if (p > n) {
                r = m - 1;
            } else if (p < n) {
                l = m + 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
