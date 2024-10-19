package od;

import java.util.TreeMap;
import java.util.TreeSet;

/**
 * 题目描述
 * 给你一个字符串 s，字符串s首尾相连成一个环形 ，请你在环中找出 'o' 字符出现了偶数次最长子字符串的长度。
 * <p>
 * 给你一个字符串 s，字符串s首尾相连成一个环形 ，请你在环中找出 'o' 字符出现了偶数次最长子字符串的长度。
 * <p>
 * 输入描述
 * 输入是一串小写字母组成的字符串
 * <p>
 * 备注
 * 1 <= s.length <= 5 x 10^5s 只包含小写英文字母
 * <p>
 * 输出描述
 * 输出是一个整数
 * <p>
 * 示例1
 * 输入
 * <p>
 * alolobo
 * <p>
 * 输出
 * <p>
 * 6
 * <p>
 * 说明：最长子字符串之一是 "alolob"，它包含'o' 2个。
 * <p>
 * 示例2
 * 输入
 * <p>
 * looxdolx
 * <p>
 * 输出
 * <p>
 * 7
 * <p>
 * 说明：最长子字符串是 "oxdolxl"，由于是首尾连接在一起的，所以最后一个 'x' 和开头的 'l'是连接在一起的，此字符串包含 2 个'o' 。
 * <p>
 * 示例3
 * 输入
 * <p>
 * bcbcbc
 * <p>
 * 输出
 * <p>
 * 6
 * <p>
 * 说明：这个示例中，字符串 "bcbcbc" 本身就是最长的，因为 'o' 都出现了 0 次。
 */
public class S11 {
    public static void main(String[] args) {
        String s = "bcbcbc";
//        System.out.println("123".substring("123".indexOf("2")));
        ss(s);
    }


    public static void ss(String s) {
        int i =s.length();
            int k = 0;
            while (s.contains("o")){
                k++;
                s = s.substring(s.indexOf("o") + 1);
            }
            if(k%2 == 0){
                System.out.println(i);
            }else{
                System.out.println(i -1);
            }

    }
}
