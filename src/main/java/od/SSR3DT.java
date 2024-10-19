package od;

/**
 * 题目描述：MELON的难题（本题200分）
 * MELON有一堆精美的雨花石（数量为n，重量各异），准备送给S和W。MELON希望送给俩人的雨花石重量一致，请你设计一个程序，帮MELON确认是否能将雨花石平均分配。
 * <p>
 * 输入描述
 * 第1行输入为雨花石个数: n，0 < n < 31. 第2行输入为空格分割的各雨花石重量: m[0] m[1] ..... m[n - 1]， 0 < m[k] < 1001
 * <p>
 * 不需要考虑异常输入的情况。
 * <p>
 * 输出描述
 * 如果可以均分，从当前雨花石中最少拿出几块，可以使两堆的重量相等:如果不能均分，则输出-1。
 * <p>
 * 用例1
 * 输入
 * <p>
 * 4
 * 1 1 2 2
 * 输出
 * <p>
 * 2
 * 说明
 * <p>
 * 输入第一行代表共4颗雨花石，第二行代表4颗雨花石重量分别为1、1、2、2。均分时只能分别为1,2，需要拿出重量为1和2的两块雨花石，所以输出2。
 * <p>
 * 作者：不上岸不改名！
 * 链接：https://www.nowcoder.com/discuss/626732158991740928?sourceSSR=search
 * 来源：牛客网
 */
public class SSR3DT {
    static int scount;
    static int totalW;
    static int halfW;

    public static void main(String[] args) {
        int[] n = {1, 1, 2, 2};
        for (int i : n) {
            totalW += i;
        }
        halfW = totalW / 2;
        scount = n.length;
        ;
        System.out.println(ss(n, 0, 0, 0, 0, 0));
    }

    public static int ss(int[] n, int curri, int currW, int count, int currS, int countS) {
        if (currW == currS && currW != 0) {
            return count + countS;
        }
        if (curri == scount) {
            return scount + 1;
        }
        int p1 = ss(n, curri + 1, currW + n[curri], count + 1, currS, countS);
        int p2 = ss(n, curri + 1, currW, count, currS + n[curri], countS + 1);
        return Math.min(p1, p2);
    }
}
