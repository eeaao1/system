package od;

import java.util.PriorityQueue;

/**
 * 题目描述
 * 有 N 块二手市场收集的银饰，每块银饰的重量都是正整数，收集到的银饰会被熔化用于打造新的饰品。 每一回合，从中选出三块 最重的 银饰，然后一起熔掉。假设银饰的重量分别为 x 、y 和 z，且 x <= y <= z。那么熔掉的可能结果如下：
 * <p>
 * 如果x == y == z，那么三块银饰都会被完全熔掉；
 * 如果x == y且y != z，会剩余重量为z - y的银块无法被熔掉；
 * 如果x != y且y == z，会剩余重量为y - x的银块无法被熔掉；
 * 如果x != y且y != z，会剩余重量为z - y与y - x差值的银块无法被熔掉。
 * 如果剩余两块，返回较大的重量（若两块重量相同，返回任意一块皆可）；如果只剩下一块，返回该块的重量；如果没有剩下，就返回 0。
 * <p>
 * 输入描述
 * 输入数据为两行
 * <p>
 * 第一行为银饰数组长度 n，1 ≤ n ≤ 40，
 * <p>
 * 第二行为 n 块银饰的重量，重量的取值范围为[1，2000]，重量之间使用空格隔开
 * <p>
 * 输出描述
 * 如果剩余两块，返回较大的重量（若两块重量相同，返回任意一块皆可）；如果只剩下一块，返回该块的重量；如果没有剩下，就返回 0。
 * <p>
 * 示例一
 * 输入
 * <p>
 * 3
 * 1 1 1
 * <p>
 * 输出
 * <p>
 * 0
 * <p>
 * 说明
 * <p>
 * 选出 1 1 1，得到 0，最终数组转换为 []，最后没有剩下银块，返回 0
 * <p>
 * 示例二
 * 输入
 * <p>
 * 3
 * 3 7 10
 * <p>
 * 输出
 * <p>
 * 1
 * <p>
 * 说明
 * <p>
 * 选出 3 7 10，需要计算 (7-3) 和 (10-7) 的差值，即(7-3)-(10-7)=1，所以数组转换为 [1]，剩余一块，返回该块重量，返回 1
 * <p>
 * 作者：不上岸不改名！
 * 链接：https://www.nowcoder.com/discuss/610145598326456320?sourceSSR=search
 * 来源：牛客网
 */
public class S26 {

    public static void main(String[] args) {
        int[] yy = {3, 7, 10};
        System.out.println(ss(3, yy));
    }

    public static int ss(int n, int[] yy) {
        PriorityQueue<Integer> yk = new PriorityQueue<>((a, b) -> b - a);
        for (int y : yy) {
            yk.add(y);
        }
        int a1 = 0;
        int a2 = 0;
        while (yk.size() > 2) {
            int z = yk.poll();
            int y = yk.poll();
            int x = yk.poll();

            if (x == y) {
                if (y != z) {
                    a2 = z - y;
                }
            } else {
                if (y != z) {
                    a1 = y - x;
                    a2 = z - y;
                } else {
                    a1 = y - x;
                }
            }
            if (a1 != 0 && a2 != 0) {
                yk.add(Math.abs(a1 - a2));
            } else if (a1 == 0) {
                yk.add(a2);
            } else {
                yk.add(a1);
            }
        }
        a1 = yk.poll();
        if (yk.size() == 2) {
            return yk.poll();
        } else {
            return a1;
        }

    }
}
