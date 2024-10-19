package od;

import java.util.PriorityQueue;
import java.util.Stack;
import java.util.TreeMap;

/**
 * 题目描述：最长合法表达式（本题分值200）
 * 提取字符串中的最长合法简单数学表达式字符串长度最长的，并计算表达式的值。如果没有返回 0
 * 简单数学表达式只能包含以下内容
 * 0-9 数字，符号+-*
 * 说明:
 * 1.所有数字，计算结果都不超过 long
 * <p>
 * 2.如果有多个长度一样的，请返回第一个表达式的结果
 * <p>
 * 3.数学表达式，必须是最长的，合法的
 * 4.操作符不能连续出现，如 +--+1 是不合法的
 * <p>
 * 输入描述 字符串
 * 输出描述 表达式值 示例一 输入
 * 1-2abcd 输出
 * <p>
 * -1
 * <p>
 * 输入描述
 * 字符串
 * <p>
 * 输出描述
 * 表达式值
 * <p>
 * 用例
 * 输入
 * <p>
 * 1-2abcd
 * 输出
 * <p>
 * -1
 * <p>
 * 作者：不上岸不改名！
 * 链接：https://www.nowcoder.com/discuss/626733096930467840?sourceSSR=search
 * 来源：牛客网
 */
public class SSR4 {
    static int scount;
    static int totalW;
    static int halfW;

    public static void main(String[] args) {

        ss("v1v1-11+11*2+34-11*11ab2cd");
    }

    public static void ss(String s) {
        char[] chars = s.toCharArray();
        int l = 0;
        int r = 0;
        int currType;
        int preType = -2;
        int maxL = 0;
        String maxString = "";
        while (l <= r && r < s.length()) {
            currType = getType(chars[r]);
            if (currType == 0) {
                r++;
                preType = currType;
            } else if (currType == 1) {
                if (preType == 0) {
                    r++;
                    preType = currType;
                } else if (preType == -2) {
                    r++;
                    l = r;
                    preType = -2;
                } else {
                    int tmpL = r - 1 - l;
                    if (tmpL > maxL) {
                        maxL = tmpL;
                        maxString = s.substring(l, r - 1);
                    }
                    r++;
                    l = r;
                    preType = -2;
                }
            } else {
                int tmpL = r - l;
                if (tmpL > maxL) {
                    maxL = tmpL;
                    maxString = s.substring(l, r);
                }
                r++;
                l = r;
                preType = -2;
            }
        }
        System.out.println(cal(maxString));
    }

    public static long cal(String s) {

        Stack<String> cs = new Stack<>();
        char[] chars = s.toCharArray();
        int currType;
        int preType = -2;
        Boolean isc = false;
        for (char c : chars) {
            currType = getType(c);
            if (currType == 0) {
                if (preType == 0) {
                    cs.push(String.valueOf(Integer.valueOf(cs.pop()) * 10 + c - '0'));
                } else {
                    cs.push(String.valueOf(c));
                }
                preType = currType;
            } else {
                if (isc) {
                    String v1 = cs.pop();
                    cs.pop();
                    String v2 = cs.pop();
                    cs.push(String.valueOf(Integer.valueOf(v1) * Integer.valueOf(v2)));
                }
                if (c == '*') {
                    isc = true;
                } else {
                    isc = false;
                }
                cs.push(String.valueOf(c));
                preType = currType;
            }
        }
        if (isc) {
            String v1 = cs.pop();
            cs.pop();
            String v2 = cs.pop();
            cs.push(String.valueOf(Integer.valueOf(v1) * Integer.valueOf(v2)));
        }
        long res = Integer.valueOf(cs.get(0));
        for (int i = 1; i < cs.size(); i += 2) {
            String f = cs.get(i);
            String v1 = cs.get(i + 1);
            if ("-".equals(f)) {
                res -= Integer.valueOf(v1);
            } else {
                res += Integer.valueOf(v1);
            }
        }
        return res;
    }

    // 0 数字， 1 符号， 2 其他
    public static int getType(char c) {
        if (c > 47 && c < 58) {
            return 0;
        }
        if ((c > 96 && c < 123) || (c > 64 && c < 91)) {
            return 2;
        }
        return 1;
    }
}
