package od;

import sun.reflect.generics.tree.Tree;

import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;
import java.util.stream.Stream;

/**
 * 题目描述
 * 孙悟空爱吃蟠桃，有一天趁着蟠桃园守卫不在来偷吃。已知蟠桃园有 N 棵蟠桃树，每棵树上都桃子，守卫将在 H 小时后回来。
 * <p>
 * 孙悟空可以决定他吃蟠桃的速度 K （个/每小时），每个小时选一棵桃树，并从树上吃掉 K 个，如果K大于该树上所有桃子个数，则全部吃掉，并且这一小时剩余的时间里不再吃桃。
 * <p>
 * 孙悟空喜欢慢慢吃，但又想在守卫回来前吃完桃子。
 * <p>
 * 请返回孙悟空可以在 H 小时内吃掉所有桃子的最小速度 K （K 为整数）。如果以任何速度都吃不完所有桃子，则返回 0。
 * <p>
 * 输入描述
 * 第一行输入为 N个数字， N 表示桃树的数量，这 N 个数字表示每棵桃树上蟠桃的数量。
 * <p>
 * 第二行输入为一个数字，表示守卫离开的时间 H。
 * <p>
 * 其中数字通过空格分割， N、 H 为正整数，每棵树上都有蟠桃，且 0<N<10000, 0 < H < 10000。
 * <p>
 * 输出描述
 * 输出吃掉所有蟠桃的最小速度 K，无解或输入异常时输出 0。
 * <p>
 * 示例1
 * 输入：
 * 2 3 4 5
 * 4
 * <p>
 * 输出：
 * 5
 * 示例2
 * 输入：
 * 2 3 4 5
 * 3
 * <p>
 * 输出：
 * 0
 * 示例3
 * 输入：
 * 30 11 23 4 20
 * 6
 * <p>
 * 输出：
 * 23
 */
public class S15 {
    public static void main(String[] args) {

        String[] s1 = "1 2 3 4".split(" ");
        int[] s = new int[s1.length];
        for (int i = 0; i < s1.length; i++) {
            s[i] = Integer.valueOf(s1[i]);
        }
        ss(s, 4);

    }


    public static void ss(int[] in, int h) {
        Arrays.sort(in);
        int max = in[in.length - 1];
        int min = in[0];
        int k = 0;
        TreeSet<Integer> tk = new TreeSet<>((a, b) -> (b - a));

        while (max >= min) {
            k = (max + min) / 2;
            int ch = geth(in, k);
            if (ch <= h) {
                max = k - 1;
                tk.add(k);
            } else {
                min = k + 1;
            }

        }
        if(tk.isEmpty()){
            tk.add(0);
        }
        System.out.println(tk.last());
    }

    public static int geth(int[] in, int k) {
        int h = 0;
        for (int i : in) {
            h += (i + k - 1) / k;
        }
        return h;
    }
}
