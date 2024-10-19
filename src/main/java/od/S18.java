package od;

/**
 * 题目描述
 * 均衡串定义: 字符串只包含两种字符，且两种字符的个数相同。
 * <p>
 * 给定一个均衡字符串，请给出可分割成新的均衡子串的最大个数。
 * <p>
 * 约定字符串中只包含大写的X和Y两种字符。
 * <p>
 * 输入描述
 * 均衡串: XXYYXY字符串的长度[2,100001]。给定的字符串均为均衡串
 * <p>
 * 输出描述
 * 可分割为两个子串:XXYYXY
 * <p>
 * 备注分割后的子串，是原字符串的连续子串。
 * <p>
 * 用例
 * | 输入 | XXYYXY |
 * <p>
 * | 输出 | 2 |
 * <p>
 * 链接：https://www.nowcoder.com/discuss/607206249112809472?sourceSSR=search
 * 来源：牛客网
 */
public class S18 {

    public static void main(String[] args) {
        System.out.println(ss("XXYYXY"));
    }

    public static int ss(String s) {
        int x = 0;
        int y = 0;
        int r = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (chars[i] == 'X') {
                x++;
            } else {
                y++;
            }
            if (x == y && x != 0) {
                r++;
                x = 0;
                y = 0;
            }
        }
        return r;
    }
}
