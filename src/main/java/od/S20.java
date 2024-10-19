package od;

/**
 * 题目描述
 * 程序员小明打了一辆出租车去上班。出于职业敏感，他注意到这辆出租车的计费表有点问题，总是偏大。
 * <p>
 * 出租车司机解释说他不喜欢数字4，所以改装了计费表，任何数字位置遇到数字4就直接跳过，其余功能都正常。
 * <p>
 * 比如：
 * <p>
 * 23再多一块钱就变为25；
 * <p>
 * 39再多一块钱变为50；
 * <p>
 * 399再多一块钱变为500；
 * <p>
 * 小明识破了司机的伎俩，准备利用自己的学识打败司机的阴谋。
 * <p>
 * 给出计费表的表面读数，返回实际产生的费用。
 * <p>
 * 输入描述
 * 只有一行，数字N，表示里程表的读数。
 * <p>
 * (1<=N<=888888888)。
 * <p>
 * 输出描述
 * 一个数字，表示实际产生的费用。以回车结束。
 * <p>
 * 示例1
 * 输入
 * 5
 * 输出
 * 4
 * 说明
 * 5表示计费表的表面读数。
 * 4表示实际产生的费用其实只有4块钱。
 * 示例2
 * 输入
 * 17
 * 输出
 * 15
 * 说明
 * 17表示计费表的表面读数。
 * 15表示实际产生的费用其实只有15块钱。
 * 示例3
 * 输入
 * 100
 * 输出
 * 81
 * 说明
 * 100表示计费表的表面读数。
 * 81表示实际产生的费用其实只有81块钱。
 * <p>
 * 作者：code5bug
 * 链接：https://www.nowcoder.com/discuss/564514429228834816?sourceSSR=search
 * 来源：牛客网
 */
public class S20 {

    public static void main(String[] args) {
        System.out.println(ss(17));
    }

    public static int ss(int s) {
        String s1 = String.valueOf(s);
        char[] chars = s1.toCharArray();
        int l = chars.length;
        int res = 0;
        for (int i = 0; i < l; i++) {
            char c = chars[i];
            int d = c - '0';
            if (c - '4' >= 1) {
                d--;
            }
            res = res * 9 + d;
        }
        return res;
    }
}
