package od;

import java.util.Arrays;

/**
 题目描述
 已知火星人使用的运算符为#、$，其与地球人的等价公式如下：

 x#y = 2*x+3*y+4

 x$y = 3*x+y+2

 其中x、y是无符号整数
 地球人公式按C语言规则计算
 火星人公式中，$的优先级高于#，相同的运算符，按从左到右的顺序计算
 现有一段火星人的字符串报文，请你来翻译并计算结果。

 输入描述
 火星人字符串表达式（结尾不带回车换行）

 输入的字符串说明：字符串为仅由无符号整数和操作符（#、$）组成的计算表达式。

 例如：123#4$5#67$78。

 用例保证字符串中，操作数与操作符之间没有任何分隔符。
 用例保证操作数取值范围为32位无符号整数。
 保证输入以及计算结果不会出现整型溢出。
 保证输入的字符串为合法的求值报文，例如：123#4$5#67$78
 保证不会出现非法的求值报文，例如类似这样字符串：
 #4$5 //缺少操作数

 4$5# //缺少操作数

 4#$5 //缺少操作数

 4 $5 //有空格

 3+4-5*6/7 //有其它操作符

 12345678987654321$54321 //32位整数计算溢出

 输出描述
 根据输入的火星人字符串输出计算结果（结尾不带回车换行）。

 用例
 输入	7#6$5#12
 输出	226
 说明
 7#6$5#12

 =7#(3*6+5+2)#12

 =7#25#12

 =(2*7+3*25+4)#12

 =93#12

 =2*93+3*12+4

 =226

 作者：不上岸不改名！
 链接：https://www.nowcoder.com/discuss/643737950248792064?sourceSSR=search
 来源：牛客网
 */
public class S78 {

    public static void main(String[] args) {
//        int[] yy = {1,2,5,-21,22,11,55,-101,42,8,7,32};

        ss("07:08");
    }

    public static void ss(String s) {
        String[] split = s.split(":");
        int[] sorted = {Integer.valueOf(split[0].substring(0, 1)),
                Integer.valueOf(split[0].substring(1)),
                Integer.valueOf(split[1].substring(0, 1)),
                Integer.valueOf(split[1].substring(1))
        };
        int[] ints = {sorted[0], sorted[1], sorted[2], sorted[3]};
        Arrays.sort(sorted);
        boolean co = false;
        for (int i = 1; i < 4; i++) {
            if (ints[3] < sorted[i]) {
                ints[3] = sorted[i];
                co = true;
                break;
            }
        }
        if (!co) {
            for (int i = 1; i < 4; i++) {
                if (ints[2] < sorted[i] && sorted[i] < 6) {
                    ints[2] = sorted[i];
                    ints[3] = sorted[0];
                    co = true;
                    break;
                }
            }
        }
        if (!co) {
            for (int i = 1; i < 4; i++) {
                if (ints[1] < sorted[i] && (ints[0] * 10 + sorted[i] < 24)) {
                    ints[1] = sorted[i];
                    ints[2] = sorted[0];
                    ints[3] = sorted[0];
                    co = true;
                    break;
                }
            }
        }
        if (!co) {
            for (int i = 1; i < 4; i++) {
                if (ints[0] < sorted[i] && sorted[i] < 3) {
                    ints[0] = sorted[i];
                    ints[1] = sorted[0];
                    ints[2] = sorted[0];
                    ints[3] = sorted[0];
                    break;
                }
            }
        }

        if (!co) {
            ints[0] = sorted[0];
            ints[1] = sorted[0];
            ints[2] = sorted[0];
            ints[3] = sorted[0];
        }
        System.out.println(ints[0] + "" + ints[1] + ":" + ints[2] + ints[3]);
    }
}
