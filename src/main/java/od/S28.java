package od;

import java.util.PriorityQueue;

/**
 * 题目描述
 * 给定一个字符串的摘要算法，请输出给定字符串的摘要值
 * <p>
 * 去除字符串中非字母的符号。
 * 如果出现连续字符(不区分大小写) ，则输出：该字符 (小写) + 连续出现的次数。
 * 如果是非连续的字符(不区分大小写)，则输出：该字符(小写) + 该字母之后字符串中出现的该字符的次数
 * 对按照以上方式表示后的字符串进行排序：字母和紧随的数字作为一组进行排序，数字大的在前，数字相同的，则按字母进行排序，字母小的在前。
 * 输入描述
 * 一行字符串，长度为[1,200]
 * <p>
 * 输出描述
 * 摘要字符串
 * <p>
 * 用例1
 * 输入
 * <p>
 * aabbcc
 * 输出
 * <p>
 * a2b2c2
 * 用例2
 * 输入
 * <p>
 * bAaAcBb
 * 输出
 * <p>
 * a3b2b2c0
 * 说明
 * <p>
 * bAaAcBb:
 * <p>
 * 第一个b非连续字母，该字母之后字符串中还出现了2次(最后的两个Bb) ，所以输出b2
 * <p>
 * a连续出现3次，输出a3，
 * <p>
 * c非连续，该字母之后字符串再没有出现过c，输出c0
 * <p>
 * Bb连续2次，输出b2
 * <p>
 * 对b2a3c0b2进行排序，最终输出a3b2b2c0
 * <p>
 * 作者：不上岸不改名！
 * 链接：https://www.nowcoder.com/discuss/638298071373185024?sourceSSR=search
 * 来源：牛客网
 */
public class S28 {

    public static void main(String[] args) {
        int[] yy = {3, 7, 10};
        System.out.println(Integer.valueOf('a'));//97
        System.out.println(Integer.valueOf('z'));//122
        System.out.println(Integer.valueOf('A'));//65
        System.out.println(Integer.valueOf('Z'));//90
        System.out.println(Integer.valueOf('0'));//90
        System.out.println(Integer.valueOf('9'));//90
        System.out.println(ss(3, ""));
    }

    public static int ss(int n, String s) {
        PriorityQueue<Character[]> yk = new PriorityQueue<>((a, b) -> b[1] == a[1] ? a[0] - b[0] : b[1] - a[1]);
        char[] chars = s.toCharArray();
        char c;
        for (int i = 0; i < chars.length; i++) {
            c = chars[i];
            if ((c > 96 && c < 123) || (c > 64 && c < 91)) {
                for (int j = i + 1; j < chars.length; j++) {
                    if (chars[j] == c) {

                    }
                }
            }
        }
        return 1;

    }
}
