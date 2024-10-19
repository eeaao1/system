package od;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

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
public class S7 {
    public static void main(String[] args) {
        String s ="5 1 5 3 5 2 5 5 7 6 7 3 7 11 7 55 7 9 98 9 17 9 15 9 9 1 39";
        String[] s1 = s.split(" ");
        int[] ints = new int[s1.length];
        for (int i=0;i<s1.length;i++){
            ints[i] = Integer.valueOf(s1[i]);
        }
       ss(ints);

    }

    public static void ss(int[] ia) {

    }
}
