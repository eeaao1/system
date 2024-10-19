package od;

import java.util.ArrayList;
import java.util.TreeMap;

/**
 * 题目描述
 * 给定一个乱序的数组，删除所有的重复元素，使得每个元素只出现一次，并且按照出现的次数从高到低进行排序，相同出现次数按照第一次出现顺序进行先后排序。
 * <p>
 * 输入描述
 * 一个数组，数组大小不超过100 数组元素值大小不超过100
 * <p>
 * 输出描述
 * 去重排序后的数组
 * <p>
 * 示例1
 * 输入：
 * 1,3,3,2,4,4,4,5
 * <p>
 * 输出：
 * 4,3,1,2,5
 * <p>
 * 题解
 * 解题思路：
 * <p>
 * 创建一个 NumInfo 用于存储数字、数字出现次数和第一次出现的位置。
 * 初始化一个数组 nums，其中每个元素是一个 NumInfo 对象，表示数字的信息。
 * 读入数组并遍历，统计每个数字的出现次数和第一次出现的位置。
 * 使用排序函数对 nums 数组进行排序，按照出现次数从高到低排序，相同出现次数按照第一次出现的位置排序。
 * 输出排序后的结果。
 * <p>
 * 作者：code5bug
 * 链接：https://www.nowcoder.com/discuss/598130333791416320?sourceSSR=search
 * 来源：牛客网
 */
public class S30 {

    public static void main(String[] args) {
//        int[] yy = {1,2,5,-21,22,11,55,-101,42,8,7,32};
        int[] yy = {1, 3, 3, 2, 4, 4, 4, 5
        };
        ss(yy);
    }

    public static void ss(int[] s) {
        TreeMap<Integer, ArrayList<Integer>> map = new TreeMap<>((a, b) -> b - a);
        int[] ii = new int[101];
        for (int i = 0; i < s.length; i++) {
            ii[s[i]]++;
        }
        for (int i = 0; i < s.length; i++) {
            ArrayList<Integer> ints = map.get(ii[s[i]]);
            if (ii[s[i]] == -1) {
                continue;
            }
            if (ints == null) {
                ints = new ArrayList<>();
                ints.add(s[i]);
                map.put(ii[s[i]], ints);
                ii[s[i]] = -1;
            } else {
                ints.add(s[i]);
            }
        }
        ArrayList<Integer> value = map.firstEntry().getValue();
        System.out.print(value.get(0));
        value.remove(0);
        while (map.size() > 0) {
            ArrayList<Integer> value1 = map.pollFirstEntry().getValue();
            for (Integer v : value1) {
                System.out.print("," + v);
            }
        }
    }
}
