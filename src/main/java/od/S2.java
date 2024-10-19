package od;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 构成指定长度字符串的个数
 * <p>
 * 给定 M（0 < M ≤ 30）个字符（a-z），从中取出任意字符（每个字符只能用一次）拼接成长度为 N（0 < N ≤ 5）的字符串，
 * <p>
 * 要求相同的字符不能相邻，计算出给定的字符列表能拼接出多少种满足条件的字符串，
 * <p>
 * 输入非法或者无法拼接出满足条件的字符串则返回0。
 * <p>
 * 输入描述
 * 给定的字符列表和结果字符串长度，中间使用空格(" ")拼接
 * <p>
 * 输出描述
 * 满足条件的字符串个数
 * <p>
 * 作者：不上岸不改名！
 * 链接：https://www.nowcoder.com/discuss/597000574252400640
 * 来源：牛客网
 * https://www.nowcoder.com/issue/tutorial?zhuanlanId=MqBWv0&uuid=db80df6af312465fa346221bc90c9f54
 */
public class S2 {
    public static void main(String[] args) {
//        Scanner s= new Scanner(System.in);
//        String s1 = s.nextLine();
//        System.out.println(s1);

        sss();
    }
    public static void sss() {
        sss();
    }
    public static void ss(int n, char[] ms, int curi, String rs, Map map) {
        if (rs.length() == n) {
            map.put(rs, "1");
            return;
        } else if ("".equals(rs) || (rs.charAt(rs.length() - 1) != ms[curi])) {
            rs += ms[curi];
        }
        if (curi == ms.length) {
            return;
        }
        ss(n, ms, ++curi, rs, map);
    }
}
