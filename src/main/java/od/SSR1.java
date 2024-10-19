package od;

import java.util.*;

/**
 * 题目描述
 * 服务之间交换的接口成功率作为服务调用关键质量特性，某个时间段内的接口失败率使用一个数组表示。
 * <p>
 * 数组中每个元素都是单位时间内失败率数值，数组中的数值为0~100的整数，
 * <p>
 * 给定一个数值(minAverageLost)表示某个时间段内平均失败率容忍值，即平均失败率小于等于minAverageLost.找出数组中最长时间段，
 * <p>
 * 如果未找到则直接返回NULL。
 * <p>
 * 输入描述
 * 有两行内容，
 * <p>
 * 第一行为 minAverageLost，
 * <p>
 * 第二行为数组，数组元素通过空格(" ")分隔,
 * <p>
 * minAverageLost及数组中元素取值范围为0~100的整数，数组元素的个数不会超过100个
 * <p>
 * 输出描述
 * 找出平均值小于等于minAverageLost的最长时间段，输出数组下标对，格式{beginIndex}-{endIndex} (下标从0开始)，
 * <p>
 * 如果同时存在多个最长时间段，则输出多个下标对且下标对之间使用空格(” “)拼接，多个下标对按下标从小到大排序。
 * <p>
 * 示例1
 * 输入：
 * 1
 * 0 1 2 3 4
 * <p>
 * 输出：
 * 0-2
 * <p>
 * 说明：
 * A、输入解释：minAverageLost=1，数组[0, 1, 2, 3, 4]
 * B、前3个元素的平均值为1，因此数组第一个至第三个数组下标，即0-2
 * 示例2
 * 输入：
 * 2
 * 0 0 100 2 2 99 0 2
 * <p>
 * 输出：
 * 0-1 3-4 6-7
 * <p>
 * 说明：
 * A、输入解释：minAverageLost=2，数组[0, 0, 100, 2, 2, 99, 0, 2]
 * B、通过计算小于等于2的最长时间段为：数组下标为0-1即[0, 0]，数组下标为3-4即[2, 2]，数组下标为6-7即[0, 2]，这三个部分都满足平均值小于等2的要求，因此输出0-1 3-4 6-7
 * 题解
 * 解题思路：
 * <p>
 * 输入最小平均失败率和失败率数据。
 * 使用前缀和数组 psum 记录从头开始到每个位置的失败率累加和。
 * 使用两层循环遍历所有可能的时间段，通过前缀和数组判断平均失败率是否小于等于给定的阈值。
 * 如果找到一个满足条件的时间段，比较其长度是否大于当前已知的最大长度，更新最大长度和结果数组。
 * 最终输出所有满足条件的最长时间段。
 * <p>
 * 作者：code5bug
 * 链接：https://www.nowcoder.com/discuss/594811070066307072?sourceSSR=search
 * 来源：牛客网
 */
public class SSR1 {

    private static int n, m;
    private static int[][] grid;
    private static boolean[][] visited;
    private static int[] dx = {0, 0, 1, -1}; // 四个方向：右、左、下、上
    private static int[] dy = {1, -1, 0, 0};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 输入n和m
        n = scanner.nextInt();
        m = scanner.nextInt();

        // 初始化服务器网格
        grid = new int[n][m];
        visited = new boolean[n][m];

        // 输入网格数据
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                grid[i][j] = scanner.nextInt();
            }
        }

        // 记录最大局域网的服务器数量
        int maxServers = 0;

        // 遍历网格，找到未访问过的服务器并启动DFS
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1 && !visited[i][j]) {
                    // 计算当前局域网的服务器数量
                    int serverCount = dfs(i, j);
                    maxServers = Math.max(maxServers, serverCount);
                }
            }
        }

        // 输出最大局域网的服务器数量
        System.out.println(maxServers);
    }

    // 深度优先搜索函数，用于计算局域网中服务器的数量
    private static int dfs(int x, int y) {
        visited[x][y] = true;
        int count = 1; // 当前服务器计入数量

        // 四个方向进行扩展
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            // 判断是否越界且未访问且是服务器
            if (nx >= 0 && ny >= 0 && nx < n && ny < m && grid[nx][ny] == 1 && !visited[nx][ny]) {
                count += dfs(nx, ny); // 递归累加服务器数量
            }
        }

        return count;
    }
    public static void ss(int[] s, int k) {
        int l = 0;
        int r = 0;
        int len = 0;
        double ave = 0;
        double cAve = 0;
        TreeMap<Integer, ArrayList<String>> map = new TreeMap<>((a, b) -> b - a);
        while (l <= r && r < s.length) {
            cAve = (ave * len + s[r]) / (len + 1);
            if (cAve <= k) {
                ave = cAve;
                len++;
                ArrayList<String> strings = map.get(len);
                if (strings == null) {
                    strings = new ArrayList<>();
                    strings.add(l + "-" + r);
                    map.put(len, strings);
                } else {
                    strings.add(l + "-" + r);
                }
                r++;
            } else {
                if (len == 0) {
                    r++;
                    l++;
                } else {
                    if (len == 1) {
                        ave = 0;
                    } else {
                        ave = (ave * len - s[l]) / (len - 1);
                    }
                    l++;
                    len--;
                }
            }
        }
        ArrayList<String> value = map.pollFirstEntry().getValue();
        System.out.print(value.get(0));
        value.remove(0);
        for (String ss : value) {
            System.out.print(" " + ss);
        }
    }
}
