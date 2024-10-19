package od.ext.letcode.normal;

import org.springframework.security.core.parameters.P;

import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class T518 {
    public static void main(String[] args) {
//        System.out.println(removeStones(new int[][]{{0, 0}, {0, 1}, {1, 0}, {1, 2}, {2, 1}, {2, 2}}));
//        System.out.println(removeStones(new int[][]{{0, 1}, {1, 0}, {1, 1}}));
        int[] i = {1, 2, 5};
//        int[] i = {5};
//        System.out.println(change(10, i));
//        System.out.println(p(5, i, 0));
        System.out.println(change(5, i));
        System.out.println("");
    }


    public static int change(int amount, int[] coins) {
        int[][] ints = new int[coins.length][amount + 1];
        for (int i = 0; i < coins.length; i++) {
            for (int j = 0; j < amount + 1; j++) {
                ints[i][j] = -1;
            }
        }
        return p1(amount, coins, 0, ints);
    }


    public static int p(int amount, int[] coins, int r) {
        if (amount == 0) {
            return 1;
        }
        if (r == coins.length || amount < 0) {
            return 0;
        }
        int p1 = p(amount, coins, r + 1);
        int p2 = p(amount - coins[r], coins, r);
        return p1 + p2;
    }

    public static int p1(int amount, int[] coins, int r, int[][] dp) {
        if (r == coins.length || amount < 0) {
            return 0;
        }
        if (dp[r][amount] != -1) {
            return dp[r][amount];
        }
        if (amount == 0) {
            return 1;
        }

        int p1 = p1(amount, coins, r + 1, dp);
        int p2 = p1(amount - coins[r], coins, r, dp);
        int a = p1 + p2;
        dp[r][amount] = a;
        return a;
    }
}
