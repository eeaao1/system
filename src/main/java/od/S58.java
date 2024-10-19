package od;

import java.util.HashMap;

/**
 * 题目描述
 * 现代计算机系统中通常存在多级的存储设备，针对海量 workload 的优化的一种思路是将热点内存页优先放到快速存储层级，这就需要对内存页进行冷热标记。
 * <p>
 * 一种典型的方案是基于内存页的访问频次进行标记，如果统计窗口内访问次数大于等于设定阈值，则认为是热内存页，否则是冷内存页。
 * <p>
 * 对于统计窗口内跟踪到的访存序列和阈值，现在需要实现基于频次的冷热标记。内存页使用页框号作为标识。
 * <p>
 * 输入描述
 * 第一行输入为 N，表示访存序列的记录条数，0 < N ≤ 10000
 * <p>
 * 第二行为访存序列，空格分隔的 N 个内存页框号
 * <p>
 * 第三行为阈值
 * <p>
 * 输出描述
 * 第一行输出标记为热内存的内存页个数，如果没有被标记的热内存页，则输出 0 。
 * <p>
 * 如果第一行 > 0，则接下来按照访问频次降序输出内存页框号，一行一个，频次一样的页框号，页框号小的排前面。
 * <p>
 * 用例1
 * 输入
 * <p>
 * 10
 * <p>
 * 1 2 1 2 1 2 1 2 1 2
 * <p>
 * 5
 * <p>
 * 输出
 * <p>
 * 2
 * <p>
 * 1
 * <p>
 * 2
 * <p>
 * 说明
 * <p>
 * 在这个例子中，内存页框号 1 和 2 都被访问了 5 次，达到了阈值，因此它们被标记为热内存页。输出首先是热内存页的数量 2，然后是按照访问频次降序排列的页框号 1 和 2(频次一样的页框号，页框号小的排前面)。
 * <p>
 * 用例2
 * 输入
 * <p>
 * 5
 * <p>
 * 1 2 3 4 5
 * <p>
 * 3
 * <p>
 * 输出
 * <p>
 * 0
 * <p>
 * 说明
 * <p>
 * 在这个例子中，没有任何内存页的访问次数达到阈值 3，因此没有热内存页，输出为 0。
 * <p>
 * 作者：不上岸不改名！
 * 链接：https://www.nowcoder.com/discuss/610146275039657984?sourceSSR=search
 * 来源：牛客网
 */
public class S58 {

    public static void main(String[] args) {
        int x = 10;
        int ii = x / 2 + 1;
        String res = "";
        int min = Integer.MAX_VALUE;
        int maxcheng = 0;
        for (int i = 2; i < ii; i++) {
            int i1 = x / i;
            int i2 = x % i;
            int v = (int) Math.pow(i, i1 - 1) * (i2 + i);
            if (v > maxcheng) {
                maxcheng = v;
                min = i;
            } else if (min > i && v == maxcheng) {
                min = i;
            }
        }
        System.out.println(min);
        System.out.println(maxcheng);
    }


}
