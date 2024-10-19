package niu;

import org.apache.ibatis.plugin.Interceptor;

import java.util.HashMap;
import java.util.Map;

//给你一个字符串 s，找到 s 中最长的回文子串。
//
//如果字符串的反序与原始字符串相同，则该字符串称为回文字符串。
//
//
//
//示例 1：
//
//输入：s = "babad"
//输出："bab"
//解释："aba" 同样是符合题意的答案。
//示例 2：
//
//输入：s = "cbbd"
//输出："bb"
//
//
//提示：
//
//1 <= s.length <= 1000
//s 仅由数字和英文字母组成
public class Main1 {
    public static void main(String[] args) {
        System.out.println(p("bb"));
    }

    //baccab
    public static String p(String s) {
        int len = s.length();
        if (len < 2) {
            return s;
        }
        String res = "";
        char[] cs = s.toCharArray();
        int h;
        int e;
        int l;
        int rStart;
        boolean flag = true;
        for (int i = 0; i < len; i++) {
            if (i == len - 1) {
                if (res.length() < 1) {
                    res = String.valueOf(cs[i]);
                }
                break;
            }
            rStart = i + 1;
            while (true) {
                h = i;
                e = s.indexOf(cs[h], rStart);
                if (e + 1 >= len) {
                    break;
                }
                rStart = e + 1;
                flag = true;
                if (e != -1) {
                    l = e - h + 1;
                    while (h <= e) {
                        if (cs[h] != cs[e]) {
                            flag = false;
                            break;
                        }
                        h++;
                        e--;
                    }
                    if (res.length() < l && flag) {
                        res = s.substring(i, i + l);
                    }
                } else {
                    break;
                }
            }
        }
        return res;
    }
    public static int longestPalindrome(String s) {
        // 统计各字符数量
        HashMap<Character, Integer> counter = new HashMap<>();
        for (int i = 0; i < s.length(); i++)
            counter.merge(s.charAt(i), 1, (a, b) -> a + b);
        // 统计构造回文串的最大长度
        int res = 0, odd = 0;
        for (Map.Entry<Character, Integer> kv : counter.entrySet()) {
            // 将当前字符出现次数向下取偶数，并计入 res
            int count = kv.getValue();
            int rem = count % 2;
            res += count - rem;
            // 若当前字符出现次数为奇数，则将 odd 置 1
            if (rem == 1) odd = 1;
        }
        return res + odd;
    }
}
