package od;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

/**
 * 题目描述
 * 输入 m 和 n 两个数，m 和 n 表示一个 m*n 的棋盘。输入棋盘内的数据。棋盘中存在数字和"."两种字符，如果是数字表示该位置是一匹马，如果是"."表示该位置为空的，棋盘内的数字表示为该马能走的最大步数。
 * <p>
 * 例如棋盘内某个位置一个数字为 k，表示该马只能移动 1~k 步的距离。
 * <p>
 * 棋盘内的马移动类似于中国象棋中的马移动，先在水平或者垂直方向上移动一格，然后再将其移动到对角线位置。
 * <p>
 * 棋盘内的马可以移动到同一个位置，同一个位置可以有多匹马。
 * <p>
 * 请问能否将棋盘上所有的马移动到同一个位置，若可以请输入移动的最小步数。若不可以输出 0。
 * <p>
 * 输入描述
 * 输入m 和 n 两个数，m 和 n 表示一个 m*n 的棋盘。输入棋盘内的数据。
 * <p>
 * 输出描述
 * 能否将棋盘上所有的马移动到同一个位置，若可以请输入移动的最小步数。若不可以输出 0。
 * <p>
 * 用例1
 * 输入
 * <p>
 * 3 2
 * . .
 * 2 .
 * . .
 * 输出
 * <p>
 * 0
 * 用例二
 * 输入
 * <p>
 * 3 5
 * 4 7 . 4 8
 * 4 7 4 4 .
 * 7 . . . .
 * 输出
 * <p>
 * 17
 * 给定的用例是一个3行5列的棋盘，其中一些位置有数字，代表马的位置和它们可以走的最大步数。我们将逐步模拟广度优先搜索（BFS）的过程来找到所有马都能到达的位置，并计算出最小步数。
 * <p>
 * 棋盘布局：
 * <p>
 * 4 7 . 4 8
 * 4 7 4 4 .
 * 7 . . . .
 */
public class SSR11 {

    static int m;
    static int n;
    static int mins = Integer.MAX_VALUE;

    public static void main(String[] args) throws Exception {
        m = 3;
        n = 5;
        char[][] num = new char[m][n];
        num[0] = new char[]{'4', '7', '.', '4', '8'};
        num[1] = new char[]{'4', '7', '4', '4', '.'};
        num[2] = new char[]{'7', '.', '.', '.', '.'};
//        m = 3;
//        n = 2;
//        char[][] num = new char[m][n];
//        num[0] = new char[]{'.', '.'};
//        num[1] = new char[]{'2', '.'};
//        num[2] = new char[]{'.', '.'};
        System.out.println(p(num));
    }

    public static int p(char[][] map) {
        int res = Integer.MAX_VALUE;
        int tmin;
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {

                tmin = 0;
                jump:
                for (int mi = 0; mi < map.length; mi++) {
                    for (int mj = 0; mj < map[0].length; mj++) {
                        int c = map[mi][mj] - '0';
                        if (c > -1 && c < 10) {
                            int jump = jump(i, j, mi, mj, c);
                            if (jump == -1) {
                                tmin = Integer.MAX_VALUE;
                                break jump;
                            }
                            tmin += jump;
                        }
                    }
                }

                res = Math.min(tmin, res);
            }
        }
        return res;
    }

    public static int jump(int tx, int ty, int sx, int sy, int step) {
        Queue<int[]> po = new LinkedList<>();
        po.add(new int[]{tx, ty, 0});
        while (!po.isEmpty()) {
            int[] pop = po.poll();
            if (pop[2] > step) {
                return -1;
            }
            if (pop[0] == sx & pop[1] == sy) {
                if (pop[2] <= step) {
                    return pop[2];
                }
                break;
            }
            if (pop[0] - 1 > -1 && pop[1] - 2 > -1) {
                po.add(new int[]{pop[0] - 1, pop[1] - 2, pop[2] + 1});
            }
            if (pop[0] - 1 > -1 && pop[1] + 2 < n) {
                po.add(new int[]{pop[0] - 1, pop[1] + 2, pop[2] + 1});
            }
            if (pop[0] + 1 < m && pop[1] - 2 > -1) {
                po.add(new int[]{pop[0] + 1, pop[1] - 2, pop[2] + 1});
            }
            if (pop[0] + 1 < m && pop[1] + 2 < n) {
                po.add(new int[]{pop[0] + 1, pop[1] + 2, pop[2] + 1});
            }

            if (pop[0] - 2 > -1 && pop[1] - 1 > -1) {
                po.add(new int[]{pop[0] - 2, pop[1] - 1, pop[2] + 1});
            }
            if (pop[0] - 2 > -1 && pop[1] + 1 < n) {
                po.add(new int[]{pop[0] - 2, pop[1] + 1, pop[2] + 1});
            }
            if (pop[0] + 2 < m && pop[1] - 1 > -1) {
                po.add(new int[]{pop[0] + 2, pop[1] - 1, pop[2] + 1});
            }
            if (pop[0] + 2 < m && pop[1] + 1 < n) {
                po.add(new int[]{pop[0] + 2, pop[1] + 1, pop[2] + 1});
            }
        }
        return -1;
    }

//    public static void jump(int tx, int ty, int sx, int sy, int step, int tstep) {
//        if (step < 0 || tx < 0 || ty < 0 || tx == m || ty == n) {
//            return;
//        }
//        if (tx == sx && ty == sy) {
//            mins = Math.min(mins, tstep - step);
//            return;
//        }
//        jump(tx - 1, ty - 2, sx, sy, step - 1, tstep);
//        jump(tx - 1, ty + 2, sx, sy, step - 1, tstep);
//        jump(tx + 1, ty - 2, sx, sy, step - 1, tstep);
//        jump(tx + 1, ty + 2, sx, sy, step - 1, tstep);
//
//        jump(tx - 2, ty - 1, sx, sy, step - 1, tstep);
//        jump(tx - 2, ty + 1, sx, sy, step - 1, tstep);
//        jump(tx + 2, ty - 1, sx, sy, step - 1, tstep);
//        jump(tx + 1, ty + 1, sx, sy, step - 1, tstep);
//    }


}


