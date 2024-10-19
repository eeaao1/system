package od;

import java.util.*;

/**
 * 输入两个字符串S和L，都只包含英文小写字母。S长度<=100，L长度<=500,000。判定S是否是L的有效子串。
 * 判定规则：
 * S中的每个字符在L中都能找到（可以不连续），
 * 且S在Ｌ中字符的前后顺序与S中顺序要保持一致。
 * （例如，S=”ace”是L=”abcde”的一个子序列且有效字符是a、c、e，而”aec”不是有效子序列，且有效字符只有a、e）
 * 输入描述
 * 输入两个字符串S和L，都只包含英文小写字母。S长度<=100，L长度<=500,000。
 * 先输入S，再输入L，每个字符串占一行。
 * 输出描述
 * 输出S串最后一个有效字符在L中的位置。（首位从0开始计算，无有效字符返回-1）
 * 用例
 * 用例1
 * 输入
 * ace
 * abcde
 * 输出
 * 4
 * <p>
 * 用例2
 * 输入
 * fgh
 * abcde
 * 输出
 * -1
 */
public class S8 {
    public static void main(String[] args) {
        HashSet<String> ys = new HashSet<>();
        ys.add("a");
        ys.add("e");
        ys.add("i");
        ys.add("o");
        ys.add("u");
        ys.add("A");
        ys.add("E");
        ys.add("I");
        ys.add("O");
        ys.add("U");
        int f = 1;
        String s = "aaeebbiouu";
        System.out.println(ss(f, s, ys));

    }

    public static int ss(int f, String aa, Set ys) {
        int max = 0;
        int currf = 0;
        int t = 0;
        ArrayList<Integer> ol = new ArrayList<>();
        for (int i = 0; i < aa.length(); i++) {
            if (ys.contains(String.valueOf(aa.charAt(i)))) {
                ol.add(i);
            }
        }
        for (int i = 0; i < ol.size() - 1; i++) {
            currf = 0;
            t = 0;
            for (int j = i; j < ol.size() - 1; j++) {
                t = ol.get(j + 1) - ol.get(j) - 1 + currf;
                if (t < f) {
                    currf = t;
                } else if (t > f) {
                    if (currf == f) {
                        max = Math.max(ol.get(j) - ol.get(i) + 1, max);
                    }
                    break;
                } else {
                    currf = t;
                    max = Math.max(ol.get(j+1) - ol.get(i) + 1, max);
                }
            }
        }
        return max;
    }
}
