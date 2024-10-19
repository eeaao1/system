package od.ext.letcode.normal;

public class T64 {
    public static void main(String[] args) {
        int[][] r = {{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
        System.out.println(minPathSum(r));
    }

    public static int minPathSum(int[][] grid) {
        int[][] dp = new int[grid.length][grid[0].length];
        return p(grid, 0, 0, dp);
    }

    public static int p(int[][] grid, int x, int y, int[][] dp) {
        if (x < 0 || x == grid[0].length || y < 0 || y == grid.length) {
            return Integer.MAX_VALUE;
        }
        if (x == grid[0].length - 1 && y == grid.length - 1) {
            return grid[y][x];
        }
        if (dp[y][x] != 0) {
            return dp[y][x];
        }
        int res = grid[y][x];
        int p1 = p(grid, x + 1, y, dp);
        int p2 = p(grid, x, y + 1, dp);
//        int p3 = p(grid, x, y - 1);
//        int p4 = p(grid, x - 1, y);
//        res += Math.min(Math.min(Math.min(p1, p2), p3), p4);
        res += Math.min(p1, p2);
        dp[y][x] = res;
        return res;
    }
}
