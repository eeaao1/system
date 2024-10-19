package od;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

/**
 * 题目描述
 * 机器人搬砖，一共有N堆砖存放在N个不同的仓库中，第i堆砖中有bricks[i]块砖头，要求在8小时内搬完。机器人每小时能搬砖的数量取决于有多少能量格，机器人一个小时中只能在一个仓库中搬砖，机器人的能量格每小时补充一次且能量格只在这一个小时有效，为使得机器人损耗最小化尽量减小每次补充的能量格数 为了保障在8小时内能完成搬砖任务，请计算每小时给机器人充能的最小能量格数。
 * <p>
 * 1、无需考虑机器人补充能量格的耗时，2、无需考虑机器人搬砖的耗时;3、机器人每小时补充能量格只在这一个小时中有效;
 * <p>
 * 输入描述
 * 第一行为一行数字，空格分隔
 * <p>
 * 输出描述
 * 机器人每小时最少需要充的能量格，若无法完成任务，输出 -1
 * <p>
 * 示例1
 * | 输入 | 30 12 25 8 19 |
 * <p>
 * | 输出 | 15 |
 * <p>
 * 示例2
 * | 输入 | 10 12 25 8 19 8 6 4 17 19 20 30 |
 * <p>
 * | 输出 | -1 |
 * <p>
 * 作者：不上岸不改名！
 * 链接：https://www.nowcoder.com/discuss/607206752903262208?sourceSSR=search
 * 来源：牛客网
 */
public class S19 {

    public static void main(String[] args) {
        System.out.println(ss(new int[]{30, 12, 25, 8, 19}));
    }

    public static int ss(int[] s) {
        int r = 1;
        for (int ss : s) {
            r = Math.max(r, ss);
        }
        int l = 0;
        int m = l + (r - l) / 2;
        int h = 0;
        int min = r;
        while (l <= r) {
            h = 0;
            m = l + (r - l) / 2;
            for (int i = 0; i < s.length; i++) {
                h += (s[i] + m - 1) / m;
                if (h > 8) {
                    l = m + 1;
                    break;
                }
            }
            if (h <= 8) {
                min = Math.min(min, m);
                r = m - 1;
            }
        }
        return min;
    }
}
