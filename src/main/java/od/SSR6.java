package od;

import java.util.*;

/**
 * 题目描述
 * 有N条线段，长度分别为a[1]-a[n]。
 * <p>
 * 现要求你计算这N条线段最多可以组合成几个直角三角形。
 * <p>
 * 每条线段只能使用一次，每个三角形包含三条线段。
 * <p>
 * 输入描述
 * 第一行输入一个正整数T（1<＝T<＝100），表示有T组测试数据.
 * <p>
 * 对于每组测试数据，接下来有T行，
 * <p>
 * 每行第一个正整数N，表示线段个数（3<＝N<＝20），接着是N个正整数，表示每条线段长度，（0<a[i]<100）。
 * <p>
 * 输出描述
 * 对于每组测试数据输出一行，每行包括一个整数，表示最多能组合的直角三角形个数
 * <p>
 * 用例
 * 输入
 * <p>
 * 1
 * 7 3 4 5 6 5 12 13
 * 输出
 * <p>
 * 2
 * 说明
 * <p>
 * 可以组成2个直角三角形（3，4，5）、（5，12，13）
 * <p>
 * 作者：不上岸不改名！
 * 链接：https://www.nowcoder.com/discuss/628594841575809024?sourceSSR=search
 * 来源：牛客网
 */
public class SSR6 {
    static int scount;
    static int totalW;
    static int halfW;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 读取测试数据的数量
        int T = scanner.nextInt();

        for (int t = 0; t < T; t++) {
            // 读取每组数据的线段数量 N
            int N = scanner.nextInt();
            int[] segments = new int[N];

            // 读取每条线段的长度
            for (int i = 0; i < N; i++) {
                segments[i] = scanner.nextInt();
            }

            // 计算最多可以组成的直角三角形数量
            System.out.println(countRightAngleTriangles(segments));
        }

        scanner.close();
    }

    // 计算能组成的直角三角形数量
    private static int countRightAngleTriangles(int[] segments) {
        int n = segments.length;
        int triangleCount = 0;

        // 使用布尔数组来记录哪些线段已经使用过
        boolean[] used = new boolean[n];

        // 三重循环遍历所有三条线段的组合
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    // 如果这些线段都没被使用过
                    if (!used[i] && !used[j] && !used[k]) {
                        int a = segments[i];
                        int b = segments[j];
                        int c = segments[k];

                        // 找到最大边，并验证是否满足勾股定理
                        if (isRightAngleTriangle(a, b, c)) {
                            triangleCount++;
                            used[i] = used[j] = used[k] = true;  // 标记这些线段已经被使用
                        }
                    }
                }
            }
        }

        return triangleCount;
    }

    // 判断是否能组成直角三角形
    private static boolean isRightAngleTriangle(int a, int b, int c) {
        int[] sides = {a, b, c};
        Arrays.sort(sides);  // 将边长排序，最大边在最后
        return sides[0] * sides[0] + sides[1] * sides[1] == sides[2] * sides[2];
    }

}
