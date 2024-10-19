package od;

/**
 * 题目描述
 * 在学校中，N个小朋友站成一队， 第i个小朋友的身高为height[i]，
 * <p>
 * 第i个小朋友可以看到的第一个比自己身高更高的小朋友j，那么j是i的好朋友(要求j > i)。
 * <p>
 * 请重新生成一个列表，对应位置的输出是每个小朋友的好朋友位置，如果没有看到好朋友，请在该位置用0代替。
 * <p>
 * 小朋友人数范围是 [0, 40000]。
 * <p>
 * 输入描述
 * 第一行输入N，N表示有N个小朋友
 * <p>
 * 第二行输入N个小朋友的身高height[i]，都是整数
 * <p>
 * 输出描述
 * 输出N个小朋友的好朋友的位置
 * <p>
 * 用例1
 * 输入
 * <p>
 * 2
 * 100 95
 * 输出
 * <p>
 * 0 0
 * 说明
 * <p>
 * 第一个小朋友身高100，站在队尾位置，向队首看，没有比他身高高的小朋友，所以输出第一个值为0。 第二个小朋友站在队首，前面也没有比他身高高的小朋友，所以输出第二个值为0。
 * <p>
 * 用例2
 * 输入
 * <p>
 * 8
 * 123 124 125 121 119 122 126 123
 * 输出
 * <p>
 * 1 2 6 5 5 6 0 0
 * 说明
 * <p>
 * 123的好朋友是1位置上的124 124的好朋友是2位置上的125 125的好朋友是6位置上的126 以此类推
 */
public class S14 {
    public static void main(String[] args) {

        String[] s1 = "123 124 125 121 119 122 126 123".split(" ");
        int[] s = new int[s1.length];
        for (int i = 0; i < s1.length; i++) {
            s[i] = Integer.valueOf(s1[i]);
        }
        ss(s);
    }


    public static void ss(int[] in) {
        int[] ints = new int[in.length];
        for (int i = 0; i < in.length - 1; i++) {
            for (int j = i + 1; j < in.length; j++) {
                if (in[j] - in[i] > 0) {
                    ints[i] = j;
                    break;
                }
                if (j == in.length - 1) {
                    ints[i] = 0;
                }
            }
        }
        for (int i : ints) {
            System.out.print(i + " ");
        }
    }
}
