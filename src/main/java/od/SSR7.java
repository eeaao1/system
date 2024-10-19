package od;

import java.util.ArrayList;

/**
 * 欢乐的周末
 * 题目描述
 * 小华和小为是很要好的朋友，他们约定周末一起吃饭。 通过手机交流，他们在地图上选择了多个聚餐地点（由于自然地形等原因，部分聚餐地点不可达），求小华和小为都能到达的聚餐地点有多少个？
 * <p>
 * 输入描述
 * 第一行输入m和n，m代表地图的长度，n代表地图的宽度。
 * <p>
 * 第二行开始具体输入地图信息，地图信息包含：
 * <p>
 * 0 为通畅的道路
 * <p>
 * 1 为障碍物（且仅1为障碍物）
 * <p>
 * 2 为小华或者小为，地图中必定有且仅有2个 （非障碍物）
 * <p>
 * 3 为被选中的聚餐地点（非障碍物）
 * <p>
 * 输出描述
 * 可以被两方都到达的聚餐地点数量，行末无空格。
 * <p>
 * 作者：不上岸不改名！
 * 链接：https://www.nowcoder.com/discuss/630691381555499008?sourceSSR=search
 * 来源：牛客网
 */
public class SSR7 {
    static int scount;
    static int totalW;
    static int halfW;

    public static void main(String[] args) {
        int[][] map = new int[4][4];
        map[0] = new int[]{2, 1, 2, 3};
        map[1] = new int[]{0, 1, 0, 0};
        map[2] = new int[]{0, 1, 0, 0};
        map[3] = new int[]{0, 1, 0, 0};
        ArrayList<int[]> res = new ArrayList<>();
        ss(map, 0, 2, res, new int[map.length][map[0].length]);
        for (int[] ii : res) {
            System.out.println(ii[0] + "," + ii[1]);
        }
    }

    public static void ss(int[][] map, int n, int m, ArrayList<int[]> res, int[][] visited) {
        if (n < 0 || m < 0 || n == map.length || m == map[0].length || map[n][m] == 1 || visited[n][m] == 1) {
            visited = new int[map.length][map[0].length];
            return;
        }
        visited[n][m] = 1;
        if (map[n][m] == 3) {
            res.add(new int[]{n, m});
            return;
        }
        ss(map, n + 1, m, res, visited);
        ss(map, n, m + 1, res, visited);
        ss(map, n - 1, m, res, visited);
        ss(map, n, m - 1, res, visited);
    }

}


