package od.ext.letcode.normal;

public class T322 {
    public static void main(String[] args) {
        System.out.println(coinChange(new int[]{1, 2, 5}, 11));
    }

    public static int coinChange(int[] coins, int amount) {
//        int[] dp = new int[amount + 1];
//        for (int i = 1; i <= amount; i++) {
//            int curra = i;
//            int currres = 0;
//            dp[i] = Integer.MAX_VALUE;
//            for (int j = 0; j < coins.length; j++) {
//                while (curra <= 0) {
//                    currres++;
//                    curra -= coins[j];
//                }
//                currres = Math.min(currres, )
//            }
//            dp[i] =
//        }
        return p(coins, amount, 0);
    }

    public static int p(int[] coins, int amount, int index) {
        if (amount < 0 || index == coins.length) {
            return -1;
        }
        if (amount == 0) {
            return 1;
        }
        int res = 0;
        int p1 = p(coins, amount, index + 1);
        int p2 = p(coins, amount - coins[index], index);
        if (p2 == -1 && p1 == -1) {
            res = -1;
        } else if (p2 != -1) {
            res = p2 + 1;
        } else if (p1 != -1) {
            res = p1;
        } else {
            res = Math.min(p1, p2 + 1);
        }
        return res;
    }
}
