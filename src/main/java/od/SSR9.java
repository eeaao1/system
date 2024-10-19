package od;

import java.util.*;

/**
 * 题目描述
 * 给一个正整数NUM1，计算出新正整数NUM2，NUM2为NUM1中移除N位数字后的结果，需要使得NUM2的值最小。
 * <p>
 * 输入描述
 * 1.输入的第一行为一个字符串，字符串由0-9字符组成，记录正整数NUM1，NUM1长度小于32。
 * 2.输入的第二行为需要移除的数字的个数，小于NUM1长度。
 * <p>
 * 输出描述
 * 输出一个数字字符串，记录最小值NUM2。
 * <p>
 * 用例
 * 输入
 * <p>
 * 2615371
 * 4
 * 输出
 * <p>
 * 131
 */
public class SSR9 {


    public static void main(String[] args) throws Exception {
        int[] num = {2, 6, 1, 5, 3, 7, 1};
        int[] del = new int[num.length];
        int n = 4;
        System.out.println(p(num, 0, n, del));
        int[][] dp = new int[num.length][n + 1];
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < n + 1; j++) {
                dp[i][j] = -1;
            }
        }
        del = new int[num.length];
        System.out.println(p1(num, 0, n, del, dp));

        Stack<Integer> stack = new Stack<>();

        // 遍历 NUM1 中的每个字符
        for (int c : num) {
            // 当栈非空、需要移除的数字个数大于 0 且栈顶元素大于当前字符时，出栈并减少需要移除的数字个数
            while (!stack.isEmpty() && n > 0 && stack.peek() > c) {
                stack.pop();
                n--;
            }
            stack.push(c);
        }

        // 移除剩余的数字
        while (n > 0) {
            stack.pop();
            n--;
        }

        // 构建结果字符串
        StringBuilder result = new StringBuilder();
        boolean leadingZero = true;
        for (Integer c : stack) {
            if (c == '0' && leadingZero) {
                continue;
            }
            leadingZero = false;
            result.append(c);
        }

        // 输出结果字符串，如果为空则输出 "0"
        System.out.println(result.length() == 0 ? "0" : result.toString());
    }

    public static int p(int[] num, int currIndex, int n, int[] del) {
        if (n == 0) {
            int join = join(num, del);
            return join;
        }
        if (currIndex == num.length) {
            return Integer.MAX_VALUE;
        }
        int res = 0;
        int buDel = p(num, currIndex + 1, n, del);
        del[currIndex] = 1;
        int yaoDel = p(num, currIndex + 1, n - 1, del);
        del[currIndex] = 0;
        res = Math.min(buDel, yaoDel);
        return res;
    }

    public static int join(int[] num, int[] del) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < num.length; i++) {
            if (del[i] == 0) {
                sb.append(num[i]);
            }
        }
        return Integer.valueOf(sb.toString());
    }

    public static int p1(int[] num, int currIndex, int n, int[] del, int[][] dp) {
        if (n == 0) {
            int join = join(num, del);
            return join;
        }
        if (currIndex == num.length) {
            return Integer.MAX_VALUE;
        }
        if (dp[currIndex][n] != -1) {
            return dp[currIndex][n];
        }
        int res = 0;
        int buDel = p1(num, currIndex + 1, n, del, dp);
        del[currIndex] = 1;
        int yaoDel = p1(num, currIndex + 1, n - 1, del, dp);
        del[currIndex] = 0;
        res = Math.min(buDel, yaoDel);
        dp[currIndex][n] = res;
        return res;
    }
}


