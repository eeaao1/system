package od;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.TreeMap;

/**
 * 题目描述
 * 给定一个非空数组（列表），其元素数据类型为整型，请按照数组元素十进制最低位从小到大进行排序，十进制最低位相同的元素，相对位置保持不变。当数组元素为负值时，十进制最低位等同于去除符号位后对应十进制值最低位。
 * <p>
 * 输入描述
 * 给定一个非空数组，其元素数据类型为32位有符号整数，数组长度[1, 1000]
 * 输出描述
 * 输出排序后的数组
 * 用例
 * 输入 1,2,5,-21,22,11,55,-101,42,8,7,32
 * <p>
 * 输出 1,-21,11,-101,2,22,42,32,5,55,7,8
 * <p>
 * 输入 19,-31,10,57,61,27,11,28,-94
 * <p>
 * 输出 10,-31,61,11,-94,57,27,28,19
 * <p>
 * 作者：不上岸不改名！
 * 链接：https://www.nowcoder.com/discuss/610146928147316736?sourceSSR=search
 * 来源：牛客网
 */
public class S29 {

    public static void main(String[] args) {
//        int[] yy = {1,2,5,-21,22,11,55,-101,42,8,7,32};
        int[] yy = {19,-31,10,57,61,27,11,28,-94};
        ss(yy);
    }

    public static void ss(int[] s) {
        TreeMap<Integer, ArrayList<Integer>> map = new TreeMap<>();
        int ge = 0;
        for (int i = 0; i < s.length; i++) {
            ge = Math.abs(s[i] % 10);
            ArrayList<Integer> ints = map.get(ge);
            if (ints != null) {
                ints.add(s[i]);
            } else {
                ints = new ArrayList<>();
                ints.add(s[i]);
                map.put(ge, ints);
            }
        }
        ArrayList<Integer> value = map.firstEntry().getValue();
        System.out.print(value.get(0));
        value.remove(0);
        while (map.size() > 0) {
            ArrayList<Integer> value1 = map.pollFirstEntry().getValue();
            for (Integer ii : value1) {
                System.out.print("," + ii);
            }
        }
    }
}
