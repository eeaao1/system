package od;

import java.util.*;

/**
 * 题目描述
 * 公司组织了一次考试,现在考试结果出来了，想看一下有没人存在作弊行为,但是员工太多了,需要先对员工进行一次过滤,再进一步确定是否存在作弊行为。
 * <p>
 * 过滤的规则为:找到分差最小的员工ID对(p1,p2)列表,要求p1<p2
 * <p>
 * 员工个数取值范国:O<n<100000
 * <p>
 * 员工ID为整数,取值范围:0<=n<=100000
 * <p>
 * 考试成绩为整数,取值范围:0<=score<=300
 * <p>
 * 输入描述
 * 员工的ID及考试分数
 * <p>
 * 输出描述
 * 分差最小的员工ID对(p1,p2)列表,要求p1<p2。每一行代表一个集合,每个集合内的员工ID按顺序排列,多行结果也以员工对中p1值大小升序排列(如果p1相同则p2升序)。
 * <p>
 * 样例1
 * 输入：
 * <p>
 * 5
 * 1 90
 * 2 91
 * 3 95
 * 4 96
 * 5 100
 * <p>
 * 输出:
 * <p>
 * 1 2
 * 3 4
 * <p>
 * 解释:
 * <p>
 * 输入：第一行为员工个数n，后续的n行第一个数值为员工ID,第二个数值为员工考试分数
 * <p>
 * 输出:员工1和员工2的分差为1,员工3和员工4的分差也为1,因此最终结果为
 * <p>
 * 1 2
 * <p>
 * 3 4
 * <p>
 * 样例2
 * 输入：
 * <p>
 * 5
 * 1 90
 * 2 91
 * 3 92
 * 4 85
 * 5 86
 * <p>
 * 输出：
 * <p>
 * 1 2
 * 2 3
 * 4 5
 * <p>
 * 作者：不上岸不改名！
 * 链接：https://www.nowcoder.com/discuss/604982820590587904?sourceSSR=search
 * 来源：牛客网
 */
public class S10 {
    public static void main(String[] args) {
        int[] in = {90, 91, 92, 85, 86};
        ss(in);
    }


    public static void ss(int[] in) {
        TreeMap<Integer, String> map = new TreeMap<>();
        for (int i = 0; i < in.length - 1; i++) {
            for (int j = i + 1; j < in.length; j++) {
                int abs = Math.abs(in[i] - in[j]);
                Integer f = null;
                if (map.size() > 0) {
                    f = map.firstKey();
                }
                if (f == null) {
                    map.put(abs, (i + 1) + " " + (j + 1));
                } else {
                    if (abs < f) {
                        map.clear();
                    } else if (abs > f) {
                        continue;
                    } else {
                        map.put(abs, map.get(abs) + "," + (i + 1) + " " + (j + 1));
                    }
                }

            }
        }
        String value = map.firstEntry().getValue();
        for (String s : value.split(",")) {
            System.out.println(s);
        }

    }
}
