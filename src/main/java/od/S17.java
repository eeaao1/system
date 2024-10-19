package od;

/**
 * 题目描述
 * 给定一个字符串，只包含字母和数字，按要求找出字符串中的最长（连续）子串的长度，字符串本身是其最长的子串，子串要求：1、 只包含1个字母(a~z, A~Z)，其余必须是数字；2、 字母可以在子串中的任意位置；如果找不到满足要求的子串，如全是字母或全是数字，则返回-1。
 * <p>
 * 输入描述
 * 字符串(只包含字母和数字)
 * <p>
 * 输出描述
 * 子串的长度
 * <p>
 * 用例
 * 输入
 * <p>
 * abC124ACb
 * <p>
 * 输出
 * <p>
 * 4
 * <p>
 * 说明
 * <p>
 * 满足条件的最长子串是C124或者124A，长度都是4
 * <p>
 * 输入
 * <p>
 * a5
 * <p>
 * 输出
 * <p>
 * 2
 * <p>
 * 说明
 * <p>
 * 字符串自身就是满足条件的子串，长度为2
 * <p>
 * 输入
 * <p>
 * aBB9
 * <p>
 * 输出
 * <p>
 * 2
 * <p>
 * 说明
 * <p>
 * 满足条件的子串为B9，长度为2
 * <p>
 * 输入
 * <p>
 * abcdef
 * <p>
 * 输出
 * <p>
 * -1
 * <p>
 * 说明
 * <p>
 * 没有满足要求的子串，返回-1
 * <p>
 * 作者：不上岸不改名！
 * 链接：https://www.nowcoder.com/discuss/604998227749777408?sourceSSR=search
 * 来源：牛客网
 */
public class S17 {

    public static void main(String[] args) {
        System.out.println(ss("abC124ACb"));
    }

    public static int ss(String s) {
        char[] chars = s.toCharArray();
        int l = 0;
        int r = 0;
        int max = -1;
        boolean f = false;
        for (int i = 0; i < s.length(); i++) {
            if (isaA(chars[i])) {
                l = i;
                if (f) {
                    max = Math.max(max, l + 1);
                }
                break;
            } else {
                f = true;
            }
        }
        f = false;
        r = l + 1;
        while (l <= r) {
            if (isaA(chars[r])) {
                if (f) {
                    max = Math.max(max, r - l);
                }
                l = r;
                f = false;
            } else {
                f = true;
            }
            r++;
            if (r == s.length() ) {
                if (f) {
                    max = Math.max(max, r - l);
                }
                break;
            }
        }
        return max;
    }

    public static boolean isaA(char c) {
        if ((c > 96 && c < 123) || (c > 64 && c < 91)) {
            return true;
        }
        return false;
    }
}
