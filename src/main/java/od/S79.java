package od;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeMap;

/**
 * 题目描述
 * 警察在侦破一个案件时，得到了线人给出的可能犯罪时间，形如 HH:MM 表示的时刻。
 * <p>
 * 根据警察和线人的约定，为了隐蔽，该事件是修改过的，解密规则为：
 * <p>
 * 利用当前出现过的数字，构造下一个距离当前事件最近的时刻，则该时间为可能的犯罪的时间。每个数字都可以被无限次使用。
 * <p>
 * 输入描述
 * 形如 HH:SS 字符串，表示原始输入。
 * <p>
 * 输出描述
 * HH:SS 字符串，表示推理处理的犯罪时间。
 * <p>
 * 备注：
 * <p>
 * 可以保证现任给定的字符串一定是合法的，例如，"01:3501:35" 和 "11:0811:08" 是合法的，"1:351:35"和"11:811:8" 是不合法的。
 * 最近的时刻可能在第二天。
 * 示例1
 * 输入：
 * 20:12
 * <p>
 * 输出：
 * 20:20
 * 示例2
 * 输入：
 * 23:59
 * <p>
 * 输出：
 * 22:22
 * 题解
 * 这个问题可以分为以下几个步骤来解决：
 * <p>
 * 记录已经出现的数字： 遍历输入的时间字符串，记录出现过的数字。这里可以使用一个长度为10的布尔数组exists，用于标记数字0到9是否出现过。
 * 计算原始时间： 将输入的时间字符串转换为分钟表示，方便后续的计算。
 * 枚举所有时间： 使用两层循环枚举所有可能的小时和分钟，然后计算对应的分钟数，得到当前时间点。
 * 判断当前时间点是否符合条件： 判断当前小时和分钟的每一位数字是否都在已经出现过的数字中。如果有任何一个数字未出现，说明这个时间点不符合条件，直接跳过。
 * 计算时间间隔： 计算当前时间点与原始时间的时间间隔，考虑了第二天的情况。
 * 找到最近的时刻： 通过比较时间间隔找到最近的时刻，更新最近时刻的小时、分钟和时间间隔。
 * 格式化输出结果： 最终输出找到的最近时刻。
 * <p>
 * 作者：code5bug
 * 链接：https://www.nowcoder.com/discuss/600784612188545024?sourceSSR=search
 * 来源：牛客网
 */
public class S79 {

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
