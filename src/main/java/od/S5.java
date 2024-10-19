package od;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Stack;

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
public class S5 {
    public static void main(String[] args) {
System.out.println("Result:"+ss(9999));

    }

    public static int ss(int i) {
        System.out.println(i + "=" + i);
        int r = 1;
        int s = 0;
        Stack<String> res = new Stack<>();
        String rs = i + "=";
        for (int q = 1; q < i; q++) {
            s = q;
            rs = i + "="+ q;
            for (int p = q + 1; p < i; p++) {
                s += p;
                rs += "+" + p;
                if (s == i) {
                    res.push(rs);
                    break;
                } else if (s > i) {
                    break;
                }
            }
        }
        r +=res.size();
      while(res.size()>0){
          System.out.println(res.pop());
      }
        return r ;
    }
}
