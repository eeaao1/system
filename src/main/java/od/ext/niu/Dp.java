package od.ext.niu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.Arrays;
import java.util.Scanner;

//https://www.nowcoder.com/practice/fd55637d3f24484e96dad9e992d3f62e
public class Dp {

    static int manP = 0;

    public static void main(String[] args) throws IOException {
        StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        in.nextToken();
        int n = (int) in.nval;
        in.nextToken();
        int v = (int) in.nval;
        // 注意 hasNext 和 hasNextLine 的区别
        int[][] goods = new int[n][2];
        for (int i = 0; i < n; i++) { // 注意 while 处理多个 case
            in.nextToken();
            goods[i][0] = (int) in.nval;
            in.nextToken();
            goods[i][1] = (int) in.nval;
        }
        //----------------------------------------------------------------------------
//        System.out.println(s1(0, 0, 0, v, goods));
//        System.out.println(manP);
//----------------------------------------------------------------------------
        int[][] dp = new int[goods.length + 1][v + 1];
//        for (int i = 0; i < totalv + 1; i++) {
//            dp[goods.length][i] = 0;
//        }
        for (int i = 0; i < goods.length + 1; i++) {
            for (int j = 0; j < v + 1; j++) {
                dp[i][j] = -1;
            }
        }
        System.out.println(s2(0, 0, 0, v, goods, dp));
        for (int i = 0; i < goods.length + 1; i++) {
            for (int j = 0; j < v + 1; j++) {
                dp[i][j] = -1;
            }
        }
        int i = s22(0, 0, 0, v, goods, dp);
        System.out.println(i == -2 ? 0 : i);
//        for (int i = 0; i < goods.length + 1; i++) {
//            manP = Math.max(manP, dp[i][v]);
//        }
    }


    public static int s1(int currIndex, int currp, int currv, int totalv, int[][] goods) {
        if (currv > totalv) {
            return -1;
        }
        if (currv == totalv) {
            manP = Math.max(manP, currp);
        }
        if (currIndex == goods.length) {
            return 0;
        }
        int ans = 0;
        //放currindex
        int f = s1(currIndex + 1, currp + goods[currIndex][1], currv + goods[currIndex][0], totalv, goods);
        ans = f + goods[currIndex][1];
        if (f == -1) {
            ans = 0;
        }
        int bf = s1(currIndex + 1, currp, currv, totalv, goods);
        ans = Math.max(ans, bf);
        return ans;
    }


    public static int s2(int currIndex, int currp, int currv, int totalv, int[][] goods, int[][] dp) {
        if (currv > totalv) {
            return -2;
        }
        if (currIndex == goods.length) {
            return 0;
        }
        if (dp[currIndex][currv] != -1) {
            return dp[currIndex][currv];
        }
        int ans = 0;
        //放currindex
        int f = s2(currIndex + 1, currp + goods[currIndex][1], currv + goods[currIndex][0], totalv, goods, dp);
        ans = f + goods[currIndex][1];
        if (f == -2) {
            ans = 0;
        }
        int bf = s2(currIndex + 1, currp, currv, totalv, goods, dp);
        ans = Math.max(ans, bf);
        dp[currIndex][currv] = ans;
        return ans;
    }

    public static int s22(int currIndex, int currp, int currv, int totalv, int[][] goods, int[][] dp) {
        if (currv > totalv) {
            return -2;
        }
        if (currIndex == goods.length) {
            return totalv == currv ? 0 : -2;
        }
        if (dp[currIndex][currv] != -1) {
            return dp[currIndex][currv];
        }
        int ans = 0;
        //放currindex
        int f = s22(currIndex + 1, currp + goods[currIndex][1], currv + goods[currIndex][0], totalv, goods, dp);
        ans = f + goods[currIndex][1];
        if (f == -2) {
            ans = -2;
        }
        int bf = s22(currIndex + 1, currp, currv, totalv, goods, dp);
        ans = Math.max(ans, bf);
        dp[currIndex][currv] = ans;
        return ans;
    }

//    public static int p(int v, int i, int j, int[][] goods, int[][] dp) {
//        if (j < 0) {
//            return -1;
//        }
//        if (i == goods.length) {
//            return 0;
//        }
//    }
}
