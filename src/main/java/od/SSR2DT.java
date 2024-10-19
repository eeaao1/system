package od;

import java.util.Scanner;

/**
 * 题目描述
 * 在一个机房中，服务器的位置标识在 n*m 的整数矩阵网格中，1 表示单元格上有服务器，0 表示没有。如果两台服务器位于同一行或者同一列中紧邻的位置，则认为它们之间可以组成一个局域网。
 * <p>
 * 请你统计机房中最大的局域网包含的服务器个数。
 * <p>
 * 输入描述
 * 第一行输入两个正整数，n和m，0<n,m<=100
 * <p>
 * 之后为n*m的二维数组，代表服务器信息
 * <p>
 * 输出描述
 * 最大局域网包含的服务器个数。
 * <p>
 * 用例1
 * 输入
 * <p>
 * 2 2
 * 1 0
 * 1 1
 * 输出
 * <p>
 * 3
 * [0][0]、[1][0]、[1][1]三台服务器相互连接，可以组成局域网
 * <p>
 * 作者：不上岸不改名！
 * 链接：https://www.nowcoder.com/discuss/626732760618590208?sourceSSR=search
 * 来源：牛客网
 */
public class SSR2DT {

    static int n, m;
    static int[][] server; // 定义一个矩阵，用于存储服务器的状态
    static boolean[][] visited; // 记录每个位置是否已经被访问过

    // 定义一个深度优先搜索函数，用于搜索当前位置的连通块大小
    public static int dfs(int i, int j) {
        // 如果当前位置超出矩阵边界或者当前位置没有服务器，则返回0
        if (i < 0 || i >= n || j < 0 || j >= m || server[i][j] == 0) {
            return 0;
        }

        // 如果当前位置已经被访问过，则返回0
        if (visited[i][j]) {
            return 0;
        }

        // 标记当前位置为已访问
        visited[i][j] = true;

        // 分别向上、下、左、右四个方向递归搜索，并累加连通块大小
        int count = 1; // 当前位置有服务器，将count初始化为1
        count += dfs(i - 1, j); // 上
        count += dfs(i + 1, j); // 下
        count += dfs(i, j - 1); // 左
        count += dfs(i, j + 1); // 右

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 读入矩阵的行数和列数
        n = sc.nextInt();
        m = sc.nextInt();
        sc.nextLine();

        server = new int[n][m];
        visited = new boolean[n][m];

        // 读入矩阵中每个位置的状态（0表示没有服务器，1表示有服务器）
        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            String[] nums = line.split(" ");
            for (int j = 0; j < m; j++) {
                server[i][j] = Integer.parseInt(nums[j]);
            }
        }

        int ans = 0; // 定义一个变量，用于存储最大连通块大小

        // 枚举矩阵中的每个位置，以该位置为起点进行深度优先搜索，并更新最大连通块大小
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                ans = Math.max(ans, dfs(i, j));
            }
        }

        // 输出最大连通块大小
        System.out.println(ans);
    }

}
